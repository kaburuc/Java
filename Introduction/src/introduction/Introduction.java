// Author: Cephas Kaburu
// Description: Control Structures Practice
package introduction;

public class Introduction {
    public static void main(String[] args){
        
        int i = 1, sum =0;
        System.out.println((i <= 1)? ("i is equal to " + i) : ("I am the False Statement"));
        
        while(i<=50)
        {
            sum = sum += i;
            i++;
            System.out.println("The sum between 1 to 50 is " + sum);
            
            System.out.println((i == 50 )? ("i is " + i): ("Next Sum..")); // the only trinery operand in Java
        }
        
       for(int j = 1; j<=50; j++)
       {
           sum += j;
           System.out.println("J is " + j + " While sum is " + sum);
           
       }
              
    }
}




