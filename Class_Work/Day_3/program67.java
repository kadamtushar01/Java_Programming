import java.util.Scanner;
class program67
{

 
    public static void main(String A[])
    {

      Scanner scanner = new Scanner(System.in);
      int iValue =0;
      
      System.out.println("Enter the Frequency");
      iValue = scanner.nextInt();

       Iteration iteration = new Iteration();
        iteration.Display(iValue);

    }
}

class Iteration
{
       public void Display(int iNo)
    {
       int icnt = 0;
       icnt = 1;
        do
       {
          System.out.println("-------------");
          System.out.println(icnt +" Jay Ganesh...." );
           System.out.println("-------------");
        icnt++;
            
        }while(icnt<=iNo);
         
    }
}