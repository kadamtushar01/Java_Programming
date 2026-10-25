//Approach 3

import java.util.Scanner;

class Arithematic
{
     public static  int Addition(int iNo1,int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }


}

class program36
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

       iResult = Addition(ivalue1,iValue2);       //Error  

       System.err.println("Addition is : "+iResult);
    }
}