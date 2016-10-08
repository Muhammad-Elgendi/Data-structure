package Array_processing_without_oop;
import java.util.Scanner;
/**
 * @Coder : Muhammad Abdelhameed Abdelraheem Elgendi 
 **/
public class Array_processing_without_oop { 
    public static void main(String args[]) {        
        System.out.println("Enter your array : ");
        Scanner input = new Scanner(System.in);
        int arr[]= new int [10];
        int counter;
        for(counter=0;counter<10;counter++){
            arr[counter]=input.nextInt();
        }
        sum=counter=0;
        int max,min,sum,multi;
        max=min=arr[0];        
        multi=1;
        for(counter=0;counter<10;counter++){
            if(arr[counter]>max)
                max=arr[counter];
            if(arr[counter]<min)
                min=arr[counter];
            sum+=arr[counter];
            multi*=arr[counter];
        }        
            System.out.println(
				"\nMax : "+max+
				"\nMin : "+min+
				"\nSum outcome : "+sum+
				"\nMultiplication outcome : "+multi);
}
// End of package