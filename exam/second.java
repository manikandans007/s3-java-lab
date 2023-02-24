import java.sql.*;
class second
{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/first";
            String username="root";
            String password="root";
         Connection con=DriverManager.getConnection(url,username,password);
            String q = "create table student(sid int(20) primary key auto_increment,tName varchar(30) not null,tCity varchar(15))";
           Statement stmt =  con.createStatement();
           stmt.executeUpdate(q);
           System.out.println("table created in database...");
           con.close();










        }catch(Exception e){
            e.printStackTrace();
        }
    }
}