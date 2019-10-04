package autoclosable;

public class demo {
    public static void main(String args[])
    {
        try(abc a=new abc();
            xyz x=new xyz())
        {
            //Class.forName("hi");
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Exception Raised : "+c);
        }
        catch(Exception c)
        {
            System.out.println("Exception Raised : "+c);
        }
    }
}
