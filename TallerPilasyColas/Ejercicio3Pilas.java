import java.util.Stack;

public class Ejercicio3Pilas {

    // Determina la prioridad/precedencia de cada operador
    private static int prioridad(char operador) {
        switch (operador) {
            case '^': return 3;  // La exponenciación tiene mayor prioridad
            case '*': case '/': return 2;  // Multiplicación y división
            case '+': case '-': return 1;  // Suma y resta
            default: return 0;   // Para otros caracteres 
        }
    }

    // Convierte una expresión infija (normal) a postfija (operadores después)
    public static String convertirAPostfija(String expresion) {
        Stack<Character> pila = new Stack<>();  // Pila para manejar operadores
        StringBuilder postfija = new StringBuilder();  // Almacena el resultado final

        // Se recorre cada carácter de la expresión
        for (char c : expresion.toCharArray()) {
            
            // Si es letra o número: va directo al resultado
            if (Character.isLetterOrDigit(c)) {
                postfija.append(c).append(' ');
            }
            // Si es '(': lo apilamos para marcar inicio de agrupación
            else if (c == '(') {
                pila.push(c);
            }
            // Si es ')': desapilamos hasta encontrar el '(' correspondiente
            else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop()).append(' ');
                }
                pila.pop();  // Eliminamos el '(' de la pila
            }
            // Si es operador: manejamos prioridades
            else {
                // Desapilamos operadores con mayor o igual prioridad
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(c)) {
                    postfija.append(pila.pop()).append(' ');
                }
                pila.push(c);  // Apilamos el operador actual
            }
        }

        // Desapilamos los operadores restantes
        while (!pila.isEmpty()) {
            postfija.append(pila.pop()).append(' ');
        }

        return postfija.toString().trim();  // Elimina espacio final si existe
    }

    public static void main(String[] args) {
        String expresionInfija = "(x-y)/(z+w)-(z+y)^x";  // Expresión de ejemplo
        String expresionPostfija = convertirAPostfija(expresionInfija);
        
        System.out.println("Notación infija: " + expresionInfija);
        System.out.println("Notación postfija: " + expresionPostfija);
    }
}