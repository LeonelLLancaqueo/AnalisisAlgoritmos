package exampleFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class ManipulacionArchivos {
    
    public static void leerSinEspacios(){
        String readerFile="src/exampleFile/lineasConEspacio.txt";
        String writerFile="src/exampleFile/lineasSinEspacio.txt";
        int ch;
        try {
            FileReader lectura= new FileReader(readerFile);
            FileWriter escritura= new FileWriter(writerFile);
            
            BufferedReader bufferReader= new BufferedReader(lectura);
            BufferedWriter bufferWriter= new BufferedWriter(escritura);

            while((ch= bufferReader.read()) != -1){
                
                if(ch != ' '){
                    bufferWriter.write(ch);
                }
            }
            


            bufferReader.close();
            bufferWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            

        }        
        //BufferedReader
    }
    public static void numerosSinRepeticion(){
        String writerFile="src/exampleFile/numeroSinRepeticion.txt";
        
    }
 
    public static void generarNumeros(){
        
        String writerFile="src/exampleFile/floatsRandoms.txt";

        final int CANTNUMEROS= 100;
        final float MAXIMO= 100, MINIMO= -100;
        
        Random geneRandom= new Random();

        try {
            
            FileWriter escritura= new FileWriter(writerFile);
            
            BufferedWriter bufferWriter= new BufferedWriter(escritura);

            for(int i =0; i< CANTNUMEROS; i++){
                
                bufferWriter.write(geneRandom.nextFloat(MINIMO, MAXIMO) + "\n");
            }
            


            bufferWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            

        }        
        //BufferedReader
    }
    public static void generarCadenaRandom(){
        
        String writerFile="src/exampleFile/cadenaRandom.txt";

        final int CANTCADENAS= 100;
        
        final char []ABCEDARIO= new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        //final char []LETRAS_MAYUSCULA= new char[]{};
        //final char[] NUMEROS= new char[]{};
        
        //final char [][]ABCEDARIO= new char[][]{LETRAS_MINUSCULA, LETRAS_MAYUSCULA, NUMEROS};
        
        String cadena="";

        Random geneRandom= new Random();

        try {
            
            FileWriter escritura= new FileWriter(writerFile);
            
            BufferedWriter bufferWriter= new BufferedWriter(escritura);

            

            for(int i =0; i< CANTCADENAS; i++){
                for(int k =0; k< 10; k++){
                    cadena+= ABCEDARIO[geneRandom.nextInt(ABCEDARIO.length-1)];
                }    
                bufferWriter.write(cadena + "\n");
                cadena="";
        
            }
            


            bufferWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            

        }        
        //BufferedReader
    }


     public static void lineasImpares(){
        String readerFile="src/exampleFile/lineasConEspacio.txt";
        String writerFile="src/exampleFile/lineasImpares.txt";
        int ch;
        try {
            FileReader lectura= new FileReader(readerFile);
            FileWriter escritura= new FileWriter(writerFile);
            
            BufferedReader bufferReader= new BufferedReader(lectura);
            BufferedWriter bufferWriter= new BufferedWriter(escritura);

            int i=0;
            while((ch= bufferReader.read()) != -1){
                
                if(ch != ' '){
                    bufferWriter.write(ch);
                }else{
                    if(i%2 == 0){
                    bufferWriter.write(ch);
                       
                    }
                    i++;
                }
                
                
                
            }
            bufferReader.close();
            bufferWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            

        }
    }

    public static void main(String[] args) {
        //leerSinEspacios();
        //lineasImpares();
        //generarNumeros();
        generarCadenaRandom();
    }
}
