import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0, iCount = 0;
        
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
           {
            iCount++;
           }
        }

        return iCount;
    }
}

class program250
{
    public static void main(String A[]) 
    {
        int iRet = 0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();
        iRet = strObj.CountSmall(sObj);

        System.out.println("Frequency of Small Character is : " + iRet);

    }

}
