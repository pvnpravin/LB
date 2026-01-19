import java.util.*;

class ArrayX
{  
    public void Display(int Brr[])
    {
        int i = 0;
        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}

class program100
{
    public static void main(String A[]) 
    {
       Scanner sObj = new Scanner(System.in);

       int iSize = 0;

       System.out.print("Enter The Size of Array : ");
       iSize = sObj.nextInt();

       int Arr[] = new int[iSize];
       int i = 0;
       System.out.println("Enter The Elements : ");

       for(i = 0; i < Arr.length; i++)
       {
            Arr[i] = sObj.nextInt();
       }

        ArrayX aObj = new ArrayX();
        aObj.Display(Arr);

        // Important to free the memory after use
        aObj = null;
        Arr = null;
        sObj = null;

        System.gc();
    }    
}
