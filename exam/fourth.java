import java.sql.*;
import java.io.*;
class second
{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/first";
            String username="root";
            String password="root";
         Connection con=DriverManager.getConnection(url,username,password);
            String q = "insert into student(tName,tCity) values (?,?)";
           PreparedStatement pstm = con.prepareStatement(q);
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name");
            String name = br.readLine();
            System.out.println("Enter the city");
            String city = br.readLine();



           pstm.setString(1,name);
           pstm.setString(2,city);
           pstm.executeUpdate();
           System.out.println("Data inserted into database from the users...");
           con.close();










        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

