package tp4;

public class main_tp4 {
    


    public static  int fibonacciIterativo(int n){
        int a,b,c;
        a=1;
        b=1;
        c=1;
        
        for(int i= 2; i <n;i++){
            c= a+b;
            a=b;
            b=c;
        }
        
        return c;
    }
    public static int fibonacciRecursivo(int n){
        int resp;
        if(n == 2 || n==1){
            resp=1;
        }else{
            resp= fibonacciRecursivo(n-1)+ fibonacciRecursivo(n-2);
        }

        return resp;
    }
    public static int sumafibonacciRecursivoPar(int n){
        
            int sum=0, result=0;
            for(int i=0; i< n; i++){

                result =fibonacciRecursivo(i);
                if(result/2 == 0){
                    sum+= result;
                }
            }
            return sum;
        
    } 
    public static int sumafibonacciRecursivoPa2(int n){

        int resp;
        if(n == 2 || n==1){
            resp=1;
        }else{
            resp= fibonacciRecursivo(n-1)+ fibonacciRecursivo(n-2);
        }

        return resp; 
    } 

    public static long testFibonacciRecursivo(int n, int pos){
        long promedio;
        promedio=0;
        for(int i=0; i< n; i++){
            
            promedio+= testUnitarioFibonacciRecursivo(pos);
        }
        return promedio/n;
    }
    public static long testUnitarioFibonacciIterativo(int pos){
        long time1, time2;
        time1= System.nanoTime();
        fibonacciIterativo(pos);
        time2= System.nanoTime(); 
        return time2-time1; 
    }
    public static long testUnitarioFibonacciRecursivo(int pos){
        long time1, time2;
        time1= System.nanoTime();
        fibonacciRecursivo(pos);
        time2= System.nanoTime(); 
        return time2-time1; 
    }
    public static long testFibonacciIterativo(int n, int pos){
        long promedio;
        promedio=0;
        for(int i=0; i< n; i++){
            promedio+= testUnitarioFibonacciIterativo(pos);
        }
        return promedio/n;
    }


    public static void main(String[] args) {
         
        //System.out.println("promedio test fibonacci Iterativo: "+testFibonacciIterativo(10, 10));

        //System.out.println("promedio test fibonacci recursivo: "+testFibonacciRecursivo(10, 5));
        

    }


}
