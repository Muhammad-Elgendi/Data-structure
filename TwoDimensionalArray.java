package TwoDimensionalArray;

/**
 * @author Muhammad Elgendi
 **/
public class TwoDimensionalArray {

    public static void main(String[] args) {
        
        //intialization process
        int arr1[][]=new int[][]{
            {1,2,3}, 
            {5,6,7}, 
            {8,9,11}
        };
        int arr2[][]=new int[][]{
            {5,5,3}, 
            {4,7,7}, 
            {3,5,11}
        };
        int result[][]=new int[3][3];
        
        //multipling array's elemwnts
        for (int row=0;row<arr1.length;row++){
            for(int col2=0;col2<arr2[0].length;col2++){
                for(int col1=0;col1<arr1[0].length;col1++){
                    result[row][col2]+=(arr1[row][col1]*arr2[col1][col2]);   
                }    
            }
        }         
        //display the Result 
        for (int row2=0;row2<arr1.length;row2++){
            for(int coloum2=0;coloum2<arr1[row2].length;coloum2++){
                System.out.print(result[row2][coloum2]+"    ");
            }
            System.out.print("\n");
        } 
    }
}
