package tp3;

public class Algoritmos {

    

    //algoritmo de orden(n)
    public static void imprimir(int n){
        for(int i=0; i< n; i++){
            System.out.print(i);
        }
    }

    //algoritmos de orden n²
    public static void recorrerMatriz(int [][]n){
        for(int i=0; i< n.length; i++){
            for(int j=0; j< n[i].length; j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }  
    }
    public static int[][] crearMatriz(final int FILAS, final int COLUMNAS){
        int [][]n= new int[FILAS][COLUMNAS];
        for(int i=0; i< FILAS; i++){
            for(int j=0; j< COLUMNAS; j++){
                n[i][j]= i*10+j; 
            }
        }  
        return n;
    }
    public static int[] elementosComunes(int []l1, int []l2){

        if(l1.length < l2.length){
            return elementosComunesAux(l1, l2, new int[l1.length]);
        }else{
            return elementosComunesAux(l2, l1, new int[l2.length]);
        }
    }
    private static int[]  elementosComunesAux(int []l1, int []l2, int []elementos){
        
        int j=0;
        for(int i=0; i< l1.length; i++){
            boolean mismoElemento= false;
            int k=0;
            while(  !mismoElemento && k < l2.length){
                if(l1[i] == l2[k]){
                    mismoElemento= true;
                    elementos[j]= l1[i];
                    j++;
                }
                k++;
            }
        }
        return elementos;
    }
    

    public static void main(String[] args) {
        /* 
        double tiempoInicio = System.currentTimeMillis();
        imprimir(100000);
        double tiempofin = System.currentTimeMillis();
        System.out.println("Tiempo del algoritmo: "+ (tiempofin-tiempoInicio));
        */

        /*         
        long tiempoInicio = System.currentTimeMillis();
        int [][]matriz= crearMatriz(10, 100);
        long tiempofin = System.currentTimeMillis();
        System.out.println("Tiempo del algoritmo: "+ (tiempofin-tiempoInicio));

        recorrerMatriz(matriz);
        */

        int [] l1= {1,2,7,3,8};
        int [] l2= {1,1,3,3,5,5,2};
        int [] res= elementosComunes(l1, l2);
        for(int i=0; i< res.length; i++){
            System.out.print(res[i]);
        }
         

    }



}
