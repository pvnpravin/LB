import java.util.*;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int i = 0; 
        long iFact = 1;       // long

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        i = 0;
        while(i <= iNo)   // converted for loop from program 88 into while loop
        {
            iFact = iFact * i;
            i++;
        }

        return iFact;
    }
} // End of Number Class

class program89
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        long iRet = 0;          // important

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
