package hannoi;
import java.util.Scanner;

public class hannoi_tower {
    public static void hannoi(int destinationNumber, char src, char aux, char destination)
    {
        if(destinationNumber == 1)
        {
            System.out.printf("將碟子從 %c 移到 %c \n",src, destination);
        }
        else 
        {
            hannoi(destinationNumber-1, src, destination, aux);
            System.out.printf("將碟子從 %c ",src);
            System.out.printf("移到 %c \n",destination);
            hannoi(destinationNumber-1, aux, src, destination);
        }
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int destinationNumber = 0;

        System.out.println("input a Nature number");
        while( ! scn.hasNextInt())
        {
            System.out.println("WRONG Number.");
            System.out.println("Please input again");
            destinationNumber = scn.nextInt();
        }
        destinationNumber  = scn.nextInt();
        scn.close();
        char src = 'A', aux = 'B', destination = 'C';
        hannoi(destinationNumber, src, aux, destination);
    }
}
