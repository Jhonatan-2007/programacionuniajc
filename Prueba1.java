public class Prueba1 {
    public static void main(String[] args) {
        int[] a = {4, 8, 2, 1, 6, 7};
        System.out.println(sumaParesImparesArreglo(a));
        System.out.println(sumaExtremosArreglos(a));
        int [] b = {};
    }

    public static String sumaParesImparesArreglo(int[] a) {
        int sumapares = 0, sumaimpares = 0;
        String cad="";
        for(int i = 0; i < a.length; i++){
                if(a[i]%2 == 0){
                    sumapares += a [i];
                }else{
                    sumaimpares +=a[i];
                }
        }
        cad = "la suma de los numeros pares = "+ sumapares +" suma de los numeros impares = "+sumaimpares;
        return cad;
    }

    public static String sumaExtremosArreglos(int[] a){
        String cad = "";
            //Verificar si el arreghlos es par o impar 
            if(a.length%2 == 0){
                //el arreglo es par
                for(int i = 0; i< a.length/2; i++){
                    cad+=(a[i]+ (a[a.length-1-i]))+ " ";
                }
            }else{
                // el arrglo es impar
                cad+="arreglo impar";
            }

        return cad;
    }
}


