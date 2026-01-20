import java.util.*;

class ArrayX
{  
    public void Display(int Brr[])
    {
        int i = 0;
        
        System.out.println("Elements of the Array are : ");
        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }

    public int CountEven(int Brr[])
    {
        int i = 0, iCount = 0;

        for(i = 0; i < Brr.length; i++ )
        {
            if (Brr[i] % 2 == 0) 
            {
                iCount++;                
            }
        }

        return iCount;
    }

    public int Summation(int Brr[])
    {
        int i = 0, iSum = 0;

        for(i = 0; i < Brr.length; i++)
        {
            iSum = iSum + Brr[i];
        }

        return iSum;
    }
}

class program102
{
    public static void main(String A[]) 
    {
       Scanner sObj = new Scanner(System.in);

       int iSize = 0, i = 0, iRet = 0, iSumResult = 0;

       System.out.print("Enter The Size of Array : ");
       iSize = sObj.nextInt();

       int Arr[] = new int[iSize];

       System.out.println("Enter The Elements : ");

       for(i = 0; i < Arr.length; i++)
       {
            Arr[i] = sObj.nextInt();
       }

        ArrayX aObj = new ArrayX();
        aObj.Display(Arr);

        iRet = aObj.CountEven(Arr);
        System.out.println("Even Elements are : " + iRet);

        iSumResult = aObj.Summation(Arr);
        System.out.println("Summation of all the elements is : " +iSumResult );

        // Important to free the memory after use
        aObj = null;
        Arr = null;
        sObj = null;

        System.gc();
    }    
}
