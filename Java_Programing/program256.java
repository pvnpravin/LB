import java.util.*;

class StringX
{
    public String strToggleX(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                 Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }
       
        return new String(Arr);
    }
}

class program256
{
    public static void main(String A[]) 
    {

        String sRet = null;

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();

        sRet = strObj.strToggleX(sObj);

        System.out.println("Updated Toggle String is : " + sRet);

    }

}
