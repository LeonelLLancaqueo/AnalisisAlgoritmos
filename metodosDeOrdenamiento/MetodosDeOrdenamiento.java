package metodosDeOrdenamiento;


public class MetodosDeOrdenamiento {
    

    public static void quickSort(int []arr){
        
        if(arr.length > 1){
            quickSortRecursivo(arr, (arr.length-1)/2, 0, arr.length-1);
        }
    }
    private static void quickSortRecursivo(int []arr, int pivote, int posIzq, int posDer){
        
        int nAux;
        int posIzqAux= posIzq;
        int posDerAux= posDer;
        System.out.println("interacion de ordenar");
        if(posDer != pivote && posIzq != pivote && posDer!= posIzq){

            while(posIzq != posDer){
                if(arr[posIzq] > arr[pivote]){
                    while(arr[posDer] > arr[pivote]){
                        posDer--;
                    }
                    
                    nAux= arr[posIzq];
                    arr[posIzq]= arr[posDer];
                    arr[posDer]= nAux;
                    
                    if(posDer == pivote){
                        pivote= posIzq;
                        posDer--;
                    }    
                }
                
                if(posIzq != pivote){
                    posIzq++;
                }
                if(arr[posDer] < arr[pivote]){
                    while(arr[posIzq] < arr[pivote]){
                        posIzq++;
                    }
                    nAux= arr[posDer];
                    arr[posDer]= arr[posIzq];
                    arr[posIzq]= nAux;
                    
                    if(posIzq == pivote){
                        pivote= posDer;
                        posIzq++;
                    }    
                }
                
                if(posDer != pivote){
                    posDer--;
                }
                
            }
            System.out.println("Arreglo luego de ordenar");
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k]);
            }  
            quickSortRecursivo(arr, (pivote+posDerAux)/2, pivote+1, posDerAux);
            quickSortRecursivo(arr, ((pivote+posIzqAux)/2) , posIzqAux, pivote);
        }
            
        
    }


    public static void marge(int []arr){
        int []arrTemp= new int[arr.length];

        margeSort(arr, arrTemp, 0, arr.length-1, arr.length);
    }
        
    private static void margeSort(int []arr, int []arrTemp,int izq, int der, int centro){
        
        if(izq < der){
            
            
            margeSort(arr, arrTemp,izq, centro/2, centro/2);
            margeSort(arr, arrTemp,centro+1, der, centro/2);
            mezclar(arr, arrTemp, izq, centro+1, der);
            System.out.println("luego de mesclar: " );
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k]);
            }
        }       

    }
    private static void mezclar(int []arr, int []arrTemp,int posIzq, int posDer, int posFin){
        int finIzq,posAux,numElementos,i;
        finIzq = posDer-1;
        posAux = posIzq;
        numElementos= posFin-posDer+1;

        while(posIzq <= finIzq && posDer <= posFin){
            if(arr[posIzq] <= arr[posDer]){
                arrTemp[posAux]= arr[posIzq];
                posIzq++;
            }else{
                arrTemp[posAux]= arr[posDer];
                posDer++;
            }
            posAux++;
        }
        while(posIzq <= finIzq){
            arrTemp[posAux]= arr[posIzq];
            posAux++;
            posIzq++;
        }
        while(posDer <= posFin){
            arrTemp[posAux]= arr[posDer];
            posAux++;
            posDer++;
        }
        i=0;
        while(i <= numElementos){
            arr[posFin]= arrTemp[posFin];
            i++;
            posFin--;
        }
        

    }

}
 
