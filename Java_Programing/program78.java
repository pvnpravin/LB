import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i = 0, j = 0;
        int iSum = 0;

        // for(i = 1; i<= (iNo / 2); i++)
        // {
        //     if ((iNo % i) == 0 ) 
        //     {
        //         System.out.println(i); 
        //     }
        // }

        for(j = 1; j <= iNo; j++)
        {
            for(i = j; i <= (iNo / 2); i++)
            {
                if ((j % i) == 0 ) 
                {
                     iSum = iSum + i; 
                }
            }
            if(iSum == iNo)
            {
                System.out.println(iSum);
            }
        }
    }
} // End of Number Class

class program78
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();
        nObj.DisplayFactors(iValue);

        // Important to tell that all work is done
        sObj = null;
        nObj = null;

        System.gc();    
    }    
}
