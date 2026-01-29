import java.util.*;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);   // changed (instad of a temp object we directly return the output)
    }
}

class program253
{
    public static void main(String A[]) 
    {
        String sRet = null;

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();
        sRet = strObj.Update(sObj);

        System.out.println("Updated String is : " + sRet);

    }

}
