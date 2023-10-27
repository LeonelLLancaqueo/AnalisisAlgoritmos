package UsoDeScanner;

import java.util.Random;
import java.util.Scanner;

public class UsoDeScanner {
    
    
    private static boolean esPrimo(int i){
        boolean esPrimo= true;
        int k=2, mitadDeN= i/2;
        
        while(k<= mitadDeN && esPrimo){

            if(i%k == 0){
                esPrimo= false;
            }
            k++;
            
        }
        
        return true;
    }
    private static int cuantosNPrimos(int n){
        int resp=0;
        for(int i=1; i< n; i++){
            if(esPrimo(i)){
                resp++;
            }
        }
        return resp;
    }
   

    public static void juegoAdivinar(){
        final int MAXIMO= 20;
        final int MINIMO= 0;
        int numeroGanador, numero;
        Scanner s= new Scanner(System.in);
        Random r= new Random();
        boolean adivino= false;
        numeroGanador= r.nextInt(MINIMO, MAXIMO);  
        
        while(!adivino){
            System.out.print("ingrese un numero: ");
            numero= s.nextInt();
            if(numero == numeroGanador){
                adivino= true;
            }else{
                if(numero < numeroGanador){
                    System.out.println("el numero buscado es mayor a: "+ numero);
                }else{
                    System.out.println("el numero buscado es menor a: "+ numero);
                }
                
            }
        }
        System.out.println("Felicidades el numero ganador es: "+ numeroGanador);
        
    }

    
    public static void main(String[] args) {
        //juegoAdivinar();

        int n;
        Scanner s= new Scanner(System.in); 
        System.out.print("ingrese un numero entero: ");
        n= s.nextInt();
        System.out.println(cuantosNPrimos(n));
    }
    

}
