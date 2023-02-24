import java.sql.*;
import java.io.*;
class six
{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/first";
            String username="root";
            String password="root";
         Connection con=DriverManager.getConnection(url,username,password);
            String query = "select * from student";
            Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          while(rs.next())
          {
            String name =rs.getString(2);
            String city =rs.getString(3);
            int id =rs.getInt(1);
            System.out.println("\nname of student:" +name);
            System.out.println("\ncity of student:" +city);
            System.out.println("\nid of student:" +id);

                     
          }
           System.out.println("Data displayed to the users...");
           con.close();     
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


 
    

