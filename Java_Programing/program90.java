import java.util.*;

class Digit
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo !=0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}
class program90
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Digit dObj = new Digit();
        dObj.DisplayDigits(iValue);
        
        // Important to tell that all work is done

        sObj = null;
        dObj = null;

        System.gc();    
    }    
}
