package autoclosable;

public class abc implements AutoCloseable {
    abc()
    {
        System.out.println("Creaing abc");
    }

    @Override
    public void close() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Closing ABC");
        
    }
}
