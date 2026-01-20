// OOP Design

import java.util.*;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int no)
    {
        System.out.println("Inside Constructor...");
        
        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sObj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the Elements of Array : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sObj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Elements of the Array are : ");
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program105
{
    public static void main(String A[])
    {
        ArrayX aObj1 = new ArrayX(5);
        System.out.println(aObj1.iSize);

        // BAd Code  (Need of Access Specifier to prevent such modification)
        aObj1.iSize = 11;
        aObj1.Arr = null;

        ArrayX aObj2 = new ArrayX(7);
        System.out.println(aObj2.iSize);
    }    
}
