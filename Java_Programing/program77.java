import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i = 0;

        for(i = 1; i<= (iNo / 2); i++)
        {
            if ((iNo % i) == 0 ) 
            {
                System.out.println(i); 
            }
        }
    }
} // End of Number Class

class program77
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();
        nObj.DisplayFactors(iValue);
    }    
}
