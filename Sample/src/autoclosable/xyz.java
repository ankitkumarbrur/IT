package autoclosable;

public class xyz implements AutoCloseable {
    xyz()
    {
        System.out.println("Creating xyz");
    }

    @Override
    public void close() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Closing xyz");
        //throw new Exception("abc");
    }
}
