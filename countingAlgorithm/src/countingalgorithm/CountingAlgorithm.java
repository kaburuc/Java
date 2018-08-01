//Description: Counting Argorithm
//Author: Cephas Kaburu

package countingalgorithm;
import java.util.Scanner;

public class CountingAlgorithm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int value;
        
        System.out.print("Enter a Value: ");
        value = input.nextInt(); // get the next int
        
       int counter = 0;
       for(int i = 1; i<= value; i++)
       {
           System.out.println((i%5 == 0)? (counter++): ("i is " + i));
           
       }        
    }
}

