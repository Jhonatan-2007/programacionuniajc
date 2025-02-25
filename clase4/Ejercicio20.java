public class Ejercicio20 {

    public int[][] llenarMatriz(int n, int m) {
        int[][] matriz = new int[n][m];
        for(int i = 0; i< matriz.lenght; i++) {
            for (int = j; j < matriz.length; i++){
            matriz[i][j] = (int) (Math.random()* 50 + 0) + 0;
            }
        }
        return matriz;
    }

    public String diagonalCerosMatriz(int[][] m) {
        int[][] matriz = new int[n][m];
        for(int i = 0; i< matriz.lenght; i++) {
            for (int = j; j < matriz.length; i++){
                if(j >= i){
                    m[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public String mostrarMatriz(int[][] m) {
        int[][] matriz = new int[n][m];
        for(int i = 0; i< matriz.lenght; i++) {
            for (int = j; j < matriz.length; i++){
                cad += m[i][j] + " ";
            }
            cad += "\n"
        }
        return cad;
    }
}