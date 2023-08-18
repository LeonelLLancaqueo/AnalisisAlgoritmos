package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

import Entity.Estudiante;
import metodosDeOrdenamiento.MetodosDeOrdenamiento;


public class TestEstudiante {
    static final int CANT_ALUMNOS= 10;
    static final String ARCHIVO= "src/test/lote_notas.txt";
    

    private static int[] crearArrNotas(){
        Random r= new Random();
        int [] arrAux= new int[5];
        for(int i=0; i< 5; i++){
            arrAux[i]= r.nextInt(0,10);
        } 
        return arrAux;
    }
    private static int mediaDeNotas(int []notasAsignatura){
        int media=0;
        for(int nota: notasAsignatura){
            media+= nota;
        }  
        return media/2;
    }


    public static void main(String[] args) {
        
        Estudiante arrEstudiante[]= new Estudiante[CANT_ALUMNOS];
        int []arrNotasAux= new int[CANT_ALUMNOS];
        int []arrMediaDeNotas= new int[CANT_ALUMNOS];
        int mediaNotasClase=0;
        /* 
        try {
            BufferedReader buff= new BufferedReader(new FileReader(ARCHIVO));
            Scanner s= new Scanner(buff);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        //creamos a los estudiantes        
        for(int i=0; i< 10; i++){
            arrEstudiante[i]= new Estudiante();
        } 
        //obtenemos la media de los estudiantes
        
        for(int i=0; i< 10; i++){
            System.out.println("media de cada alumno: "+ arrEstudiante[i].mediaDeNotas());
        }
        //obtenemos la media de matematica
        for(int i=0; i< 10; i++){
            arrNotasAux[i]= arrEstudiante[i].obteneNotaMatematica();
        } 

        System.out.println("media de la asignatura matematica : "+ mediaDeNotas(arrNotasAux));
        
        //obtenemos la media de la clase
        for(int i=0; i< CANT_ALUMNOS; i++){
            mediaNotasClase+= mediaDeNotas(arrEstudiante[i].getNotas()); 
        } 
        System.out.println("media de la clase: "+ mediaNotasClase);

        

        MetodosDeOrdenamiento.quickSort(arrNotasAux);







        


    }    
}
