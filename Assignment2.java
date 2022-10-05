import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        int rows, columns,raws;

        System.out.println("Type a Number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int count=1;
        for(rows = 1; rows <=2*x-1; rows++) {
            for(columns = count; columns<=x; columns++)
            {
                System.out.println(" ");

            }
            for(raws = 1;raws<=2*x-1; raws++)
            {
                System.out.println("*");
            }

            System.out.println("\n");

        if (rows<x)
                count++;
        else
                count--;
                System.out.println("");


            }

        }

    }
