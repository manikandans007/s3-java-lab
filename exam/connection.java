import java.sql.*;
class connection
{
public static void main(String args[])
{
try
{

 Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/first";
	String username="root";
	String password="root";
 Connection con=DriverManager.getConnection(url,username,password);
	if(con.isClosed())
{
System.out.println("Connection is clossed");
}
else
{
System.out.println("Connection is not clossed");
}

}
catch(Exception e)
{
e.printStackTrace();
}
}
}