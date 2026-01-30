import java.util.*;

class program297
{
    public static void main(String A[]) 
    {
        Vector <String>vObj = new Vector<String>();

        vObj.add("C");
        vObj.add("C++");
        vObj.add("JAVA");
        vObj.add("Python");
        vObj.add("C#");
        vObj.add("JAVA");

        System.out.println(vObj);

        vObj.add(2, "LSP");

        System.out.println(vObj);

        System.out.println(vObj.capacity());

        System.out.println(vObj.contains("LSP"));
        System.out.println(vObj.contains("UNIX"));

        vObj.remove(6);
        System.out.println(vObj);

        Iterator iObj = vObj.iterator();

        while(iObj.hasNext())
        {
            System.out.println(iObj.next());
        }

        vObj.clear();
    }
}
