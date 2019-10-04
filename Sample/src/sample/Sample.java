package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample {
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ank4103", "root","");
            Statement stmt=conn.createStatement();
            ResultSet result= stmt.executeQuery("Select * from student"))
            {
                  result.next();
                    while(result.next())
                    {
                      System.out.print(result.getInt(1));
                      System.out.print(result.getString("studentname"));
                      System.out.println(result.getString("address"));
                    }
            }      
          
        }
        catch(ClassNotFoundException c)
        {
            
        }
    }
}