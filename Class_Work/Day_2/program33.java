//Approach 1

import java.util.Scanner;

class program33
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;

        int ivalue1 = 0, iValue2 = 0, iResult = 0;


       scanner= new Scanner(System.in);

       System.out.println("Enter first Number");
       ivalue1 = scanner.nextInt();

        System.out.println("Enter Second Number");
       iValue2 = scanner.nextInt();

       iResult = ivalue1 + iValue2;    //Business logic

       System.err.println("Addition is :"+iResult);
    }
}