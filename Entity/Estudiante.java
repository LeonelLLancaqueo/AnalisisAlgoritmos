package Entity;

import java.util.Random;

public class Estudiante {
    private int [] notasAsignatura;

    public Estudiante(){
        this.notasAsignatura= new int[5];
        inicializarNotas();
    }

    public void inicializarNotas(){
        Random r= new Random();
        for(int i=0; i< notasAsignatura.length; i++){
            notasAsignatura[i]= r.nextInt(0,10);
        } 

    }
    public int[] getNotas(){
        return notasAsignatura;
    }

    public int mediaDeNotas(){
        int media=0;
        for(int nota: notasAsignatura){
            media+= nota;
        }  
        return media/2;
    }
    public int obteneNotaMatematica(){
        return notasAsignatura[0];
    }
    public int obteneNotaAlgoritmos(){
        return notasAsignatura[1];
    }
    public int obteneNotaComputacion(){
        return notasAsignatura[2];
    }
    public int obteneNotaIngles(){
        return notasAsignatura[3];
    }
    public int obteneNotaGrafos(){
        return notasAsignatura[4];
    }
    
}
