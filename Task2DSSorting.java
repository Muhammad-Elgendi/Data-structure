/*
 * @Name    : Muhammad Abdelhameed Abdelraheem Elgendi
 * @Section : 9
 */
package task.pkg2.ds.sorting;

public class Task2DSSorting {

    public static void main(String[] args) {
        
        int arr[]=new int[]{2, 1, 5, 4, 3, 6};        
        System.out.println("*********** Bubble sort ***********");
        int swap=0;
        int comp=0;  
        for(int i = 0;i<5;i++){           
            for (int x=1;x<6-i;x++){
               comp++;               
               if(arr[x-1]<arr[x]){                
                    int temp=arr[x-1];
                    arr[x-1]=arr[x];
                    arr[x]=temp;
                    swap++;
               }                   
           }
        }
        for(int y=0;y<6;y++){
        System.out.println(arr[y]);
        }
        System.out.println("swap : "+swap);
        System.out.println("comp : "+comp); 
    
    
        int array[]=new int[]{2, 1, 5, 4, 3, 6};
        System.out.println("*********** Selection sort ***********");
        swap=0;
        comp=0;
        for(int z=5;z>0;z--){
            int max=0;            
            for(int n=1;n<=z;n++){
                comp++;
                if(array[n]< array[max]){
                    max=n;
                    swap++;
                }
                int temp=array[max];
                array[max]=array[z];
                array[z]=temp;
            }
        }         
        for(int y=0;y<6;y++){
            System.out.println(array[y]);
        }       
        System.out.println("swap : "+swap);
        System.out.println("comp : "+comp);            
    }    
}