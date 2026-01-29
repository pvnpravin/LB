import java.util.*;

class program247
{
    public static void main(String A[]) 
    {
        int iCnt = 0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        char Arr[] = sObj.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        
    }

}
