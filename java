import java.sql.*;
//here i included header file for jdbc program
public class Demo{
 public static void main(String[] args){ 
 Connection con = DriverManager.getConnection("url","user","pswd");
 Statement st = con.Createnew Statement();
 ResultSet rs = st.ExecuteQuery("select * from emp");
