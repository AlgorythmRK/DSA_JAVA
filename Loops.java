import java.util.*;
public class Loops {
        public static void main(String args[])
        {
            int i=0;
            for(int counter=0;counter<11;counter++) {
                System.out.println(counter);
            }

            while(i<20)
            {
                System.out.println(i);
                i++;
            }
            do{
                System.out.println("Hum do, hamare do");
                i++;
            }
            while(i<5);

            // sum of first natural numbers
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number that you want sum upto ");
            int n= sc.nextInt();
            int sum=0;
            for(int j=0;j<= n;j++)
            {
                sum= sum+j;
            }
            System.out.println(sum);

            //table of a number input;
            System.out.println("Enter the user input");
            int u= sc.nextInt();
            for(int k=0;k<11;k++)
            {
                System.out.println(u*k);
            }
        }
    }


