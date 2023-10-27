package tp2;

import java.util.Random;

public class TP2 {
    


    public static int distMin(int []a, int n){
        
        int dmin= 5000000;
        for(int i=0; i < n; i++ ){
            for(int j=0; j < n; j++){
                if( i!=j && a[i]-a[j] < dmin){
                    dmin= Math.abs(a[i]-a[j]);
                }
            }
        }
        return dmin;
    }
    public static int distMinMejorado(int []a, int n){
        int dist=0;
        int dmin= 5000000;
        int n1= n-1;
        for(int i=0; i < n1; i++ ){
            for(int j=1; j < n; j++){
                dist= Math.abs(dist);
                if( i!=j &&  dist< dmin){
                    dmin= dist;
                }
            }
        }
        return dmin;
    }
    public static void llenarArreglo(int []a){
        Random r= new Random();
        for(int i=0; i < a.length; i++){
            a[i]= r.nextInt(1000);
        }
    }   
    public static void main(String[] args) {
        
        int a[]= new int[1000000];
        double dist=0;
          /*  
        Long time1= System.currentTimeMillis();
        
        dist=distMin(a, a.length);
        Long time2= System.currentTimeMillis();

        System.out.println("tiempo distMin: "+ (time2-time1));
        */
          
        Long time3= System.currentTimeMillis();
        
        dist=distMinMejorado(a, a.length);
        Long time4= System.currentTimeMillis();

        System.out.println("tiempo distMin: "+ (time4-time3));
        
        System.out.println("dist min: "+ dist);



    }    
}
