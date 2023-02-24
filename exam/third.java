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
            String q = "insert into student(tName,tCity) values (?,?)";
           PreparedStatement pstm = con.prepareStatement(q);
           pstm.setString(1,"jayand yadhav");
           pstm.setString(2,"aluva");
           pstm.executeUpdate();
           System.out.println("data inserted into database...");
           con.close();










        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
