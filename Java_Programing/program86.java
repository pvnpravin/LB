import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i = 0, iFact = 1;

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }
} // End of Number Class

class program86
{
    public static void main(String A[]) 
    {
        int iValue = 0, iRet = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();
        iRet = nObj.CalculateFactorial(iValue);

        System.out.println("Factorial is : " + iRet);
        
        // Important to tell that all work is done

        sObj = null;
        nObj = null;

        System.gc();    
    }    
}
