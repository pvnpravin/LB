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

class program99
{
    public static void main(String A[]) 
    {
        Scanner sObj = new Scanner(System.in);

        int iSize = 0;

        System.out.print("Enter The Size of Array : ");
        iSize = sObj.nextInt();  // 5

        int Arr[] = new int[iSize];

       System.out.println("Enter The Elements : ");

       Arr[0] = sObj.nextInt();
       Arr[1] = sObj.nextInt();
       Arr[2] = sObj.nextInt();
       Arr[3] = sObj.nextInt();
       Arr[4] = sObj.nextInt();
        
        ArrayX aObj = new ArrayX();
        aObj.Display(Arr);

        // Important to free the memory after use
        aObj = null;
        Arr = null;
        sObj = null;

        System.gc();
    }    
}
