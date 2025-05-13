class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRec(raiz.derecho, valor);

        return raiz;
    }

    // Recorrido en orden (izquierdo, raíz, derecho)
    void inorden() {
        inordenRec(raiz);
    }

    void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    // Recorrido preorden (raíz, izquierdo, derecho)
    void preorden() {
        preordenRec(raiz);
    }

    void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }

    // Recorrido postorden (izquierdo, derecho, raíz)
    void postorden() {
        postordenRec(raiz);
    }

    void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierdo);
            postordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertar nodos
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido en orden:");
        arbol.inorden();
        
        System.out.println("\nRecorrido preorden:");
        arbol.preorden();
        
        System.out.println("\nRecorrido postorden:");
        arbol.postorden();
    }
}