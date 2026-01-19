import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0;
        int iSum = 0;

        if(iNo < 0 )
        {
            iNo = -iNo;
        }

        for(i = 1; i<= (iNo / 2); i++)
        {
            if ((iNo % i) == 0 )
            {
                iSum = iSum + i; 
            }            
        }
        return (iSum == iNo); // change 

    }
} // End of Number Class

class program82
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();
        bRet = nObj.CheckPerfect(iValue);

        if (bRet == true) 
        {
            System.out.println(iValue + " is Perfect Number");
        }
        else
        {
            System.out.println(iValue + " is NOT a Perfect Number");
        }

        // Important to tell that all work is done

        sObj = null;
        nObj = null;

        System.gc();    
    }    
}
