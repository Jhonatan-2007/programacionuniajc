public class MetodoArreglos {

    public String nombreSueldos(String[]n, int[]s){
        int suma = 0;
        for(int i = 0; i <s.length; i++){
              suma +=s[i];
        }
        double promedio = suma/s.length;
        String cad = ""; int contador = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] >= promedio){
                cad += n[i] + " \n";
                 contador++;
            }
        }
        cad += "Fueron " + contador + " los empleados que tienen sueldo por encima del promedio: " + promedio;
        return cad;
    }
}
