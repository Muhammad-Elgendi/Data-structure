package Array_processing_oop;
/**
 * @Coder : Muhammad Abdelhameed Abdelraheem Elgendi 
 **/
public class Array{
    // Set access type for variables
    private int arr[],index; 
    // Constractor porperties
    public Array(int size){
    index=0;
    arr=new int[size];
    }
    // Sum function
    /* Return Sum of all elements of an array */
    public int sum(){      
        int sum,counter;
        counter=sum=0;     
        for(counter=0;counter<arr.length;counter++){
            sum+=arr[counter];
        }
        return sum;
    }
    // Multiplication function
    /* Return Multiplication outcome of all elements of an array */
    public int multi(){
        int multi,counter;
        counter=0;    
        multi=1;
        for(counter=0;counter<arr.length;counter++){
            multi*=arr[counter];
        }
        return multi;
    }
    // Max function
    /* Return Maximum of all elements of an array */
    public int max(){
        int max,counter;
        counter=0; 
        max=arr[0];       
        for(counter=0;counter<arr.length;counter++){
            if(arr[counter]>max)
                max=arr[counter];            
        }
        return max;
    }
    // Min function
    /* Return Minimum of all elements of an array */
    public int min(){
        int min,counter;
        counter=0; 
        min=arr[0];       
        for(counter=0;counter<arr.length;counter++){
            if(arr[counter]<min)
                min=arr[counter];            
        }
        return min;
    }
    // Insert function
    /* Insert elements inside an array */
    public void insert(int element){
        arr[index]=element;
        index++;
    }
}
// End of class