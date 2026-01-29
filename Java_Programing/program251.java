import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCnt = 0, iCount = 0;
        
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
           {
            iCount++;
           }
        }

        return iCount;
    }
}

class program251
{
    public static void main(String A[]) 
    {
        int iRet = 0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();
        iRet = strObj.CountCapital(sObj);

        System.out.println("Frequency of Capital Character is : " + iRet);

    }

}
