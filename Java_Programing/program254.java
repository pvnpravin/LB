import java.util.*;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);   // changed
    }
}

class program254
{
    public static void main(String A[]) 
    {

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();

        sObj = strObj.Update(sObj); // not preferable as we loose old / original string 

        System.out.println("Updated String is : " + sObj);

    }

}
