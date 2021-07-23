
import java.awt.Image;
import java.sql.*;
import javax.swing.JOptionPane;        //for showing dialog boxes to show messages


public class Connect {
    public static void main(String[] args) {
        ConnectDB();                   //function of the connection with database
    }
    
    Connection conn;
    public static Connection ConnectDB()
    {
        String url="jdbc:mysql://localhost:3306/signup";    //xampp localhost file named signup path or link
      
        
        String username="root";       //initializing username as root;
        String password="";           //password is set as null
        
            
            
   
        
        try{
            Class.forName("com.mysql.jdbc.Driver");                    //driver class for mysql database
            Connection conn=DriverManager.getConnection(url, username, password);
            
           
            return conn;
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);             //for showing null pointer exception
            return null;
        }
                
        
    }
    
    
    
    
}
