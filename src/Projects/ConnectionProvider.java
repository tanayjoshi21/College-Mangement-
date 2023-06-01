/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;
import java.sql.*;
/**
 *
 * @author kartik jain
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
       try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:7587/project","root","");
            System.out.println("Connection Establish");
            return con;
        }
        catch(ClassNotFoundException e)
        {
            return null ;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
