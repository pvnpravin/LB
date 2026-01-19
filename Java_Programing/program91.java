import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        while(iNo !=0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
}
class program91
{
    public static void main(String A[]) 
    {
        int iValue = 0, iRet = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Digit dObj = new Digit();
        iRet = dObj.SumDigits(iValue);

        System.out.println("Addition is : " + iRet);
        
        // Important to tell that all work is done

        sObj = null;
        dObj = null;

        System.gc();    
    }    
}
