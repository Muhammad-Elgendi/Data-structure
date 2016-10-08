package Array_processing_oop;
import java.util.Scanner;
/**
 * @Coder : Muhammad Abdelhameed Abdelraheem Elgendi 
 **/
public class Array_processing_oop {
    
    public static void main(String[] args) {      
        Array arr= new Array(10);      
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your array : ");
        int counter=0;
        for(counter=0;counter<10;counter++){
        arr.insert(input.nextInt());
        }        
        System.out.println(
             "\nMax : "+arr.max()+
             "\nMin : "+arr.min()+
             "\nSum outcome : "+arr.sum()+
             "\nMultiplication outcome : "+arr.multi());
    }    
}
// End of package