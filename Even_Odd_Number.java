import java.util.Scanner;


public class Even_Odd_Number
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        System.out.println("Input a number to determine whether odd or not.");
        System.out.printf("x = ");
        input = scn.nextInt();

        if(input % 2 == 0)
        {
            System.out.println(input + " is an even number.");
        }
        else 
        {
            System.out.println(input + " is an odd number.");
        }
        scn.close();
    }
}