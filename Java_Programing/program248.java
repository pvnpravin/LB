import java.util.*;

class StringX
{
    public void Display(String str)
    {
        int iCnt = 0;
        
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class program248
{
    public static void main(String A[]) 
    {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sObj = scanObj.nextLine();

        StringX strObj = new StringX();
        strObj.Display(sObj);

    }

}
