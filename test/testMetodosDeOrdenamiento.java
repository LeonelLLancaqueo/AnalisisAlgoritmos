package test;

import metodosDeOrdenamiento.MetodosDeOrdenamiento;

public class testMetodosDeOrdenamiento {
    public static void main(String[] args) {
        int [] arregloDesordenado= new int[]{25,65,87,95,14,23,56,24,8,1,54,7};
    
        System.out.println("Arreglo antes de ordenar");
        for(int i=0; i<arregloDesordenado.length;i++){
            System.out.print(arregloDesordenado[i]);
        }
        System.out.println("");
        MetodosDeOrdenamiento.quickSort(arregloDesordenado);       

        System.out.println("Arreglo luego de ordenar");
        for(int k=0; k<arregloDesordenado.length;k++){
            System.out.print(arregloDesordenado[k]+" ");
        }
        
    }    
}