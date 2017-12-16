/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avgarray;
import java.util.Scanner;
/**
 *
 * @author muhammad
 */
public class Avgarray {

    public static void main(String[] args) {
        int arr[][] = new int[][]{{2,4},{6,5}};
        int max,min;
        //avg array
            int sum=0;
            int count=0;     
            for(int i=0;i<arr.length;i++){
                for(int n=0;n<arr[i].length;n++){
                    sum+=arr[i][n];
                    count+=1;                    
                } 
            }
        System.out.println((float)sum/count);
        
        //tot row
        Scanner input =new Scanner(System.in);
        int row=input.nextInt();
        int sumRow=0;
        max=min=arr[row][0];
                for(int n=0;n<arr[row].length;n++){
                    sumRow+=arr[row][n];   
                    if(arr[row][n]>max)
                        max=arr[row][n];
                    if(arr[row][n]<min)
                        min=arr[row][n];
                } 
        System.out.println(sumRow); 
        System.out.println("min : "+min+" max : "+max ); 
        //tot col
        int col=input.nextInt();
        int sumCol=0;
        for(int i=0;i<arr.length;i++){
                
                    sumCol+=arr[i][col];
                                           
             
            }
        System.out.println(sumCol); 

    }  
    
}
