import java.util.*;

class program73
{
    public static void main(String A[]) 
    {
        int iNo = 0;
        int i = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sObj.nextInt();
        
        for(i = 1; i<= (iNo / 2); i++)
        {
            if ((iNo % i) == 0 ) 
            {
                System.out.println(i); 
            }
        }
    }    
}
