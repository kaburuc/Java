//Author: Cephas Kaburu
// Description: calculate the value of pi for infinite series

import java.util.Scanner;
import java.util.Random;
//import static java.lang.Math;

public class Pi {

    static double piValue(int den)
    {
        int num = 4, current, next;

        for(int i = 0; i < )

        return pi;
    }

   public static void main(String[] args)
    {
        //Start by asking the user how many terms
        Scanner userInput = new Scanner(System.in);
        System.out.println("Approximating PI");
        System.out.print("Compute to how many terms of the series?");

        int input = userInput.nextInt();

        int num = 4;
        int[] den = new int[input];
        int counter = 1;
        double piValue;
        int i;
        for( i = 0;i < den.length; i++)
        {
            den[i] = i * 2 + 1;
            System.out.println(" " + den[i]);
        }
    }


}
