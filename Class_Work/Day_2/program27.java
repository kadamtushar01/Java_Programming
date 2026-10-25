import java.util.Scanner;

class program27
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        String sName = null;

        int iAge = 0;
        float fMarks = 0.0;                 //Error


       scanner= new Scanner(System.in);

        System.out.println("Enter your Name");
         sName = scanner.next();

         System.out.println("Enter Your Age");
         iAge = scanner.nextInt();

         System.out.println("Enter Your Marks");
         fMarks = scanner.nextFloat();



        System.err.println("Welcome "+sName);
        System.out.println("Your Age is:"+iAge);
        System.out.println("Your Marks :"+fMarks);
    }
}