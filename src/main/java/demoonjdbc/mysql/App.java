package demoonjdbc.mysql;
import java.sql.*;
public class App 
{
  public static void main(String[] args) throws Exception
  {
    try {
          Class.forName("com.mysql.jdbc.Driver");
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:mysql://localhost","root","Nandu@1112");
          Statement s = conn.createStatement();
         // String query1 = "create database klu";
         // String query2 = "use klu";
          
         // String query3 ="CREATE TABLE student (id INTEGER ,name CHAR(20))";
          String query1 ="use klu";
        //  String query2 ="Alter Table Student Add cgpa float";
        //  String query2 ="Alter Table Student drop cgpa";
        //    String query2 = "insert into student values(1,'smith')";
      //      String query3 = "insert into student values(2,'John')";
          String query2 = "select * from student";
        //  s.addBatch(query1);
       //   s.addBatch(query2);
       //   s.addBatch(query3);
          s.execute(query1);
          ResultSet rs = s.executeQuery(query2);
      //    s.executeBatch();
          while(rs.next())
          {
        	  System.out.println("ID: " + rs.getInt("id"));
        	  System.out.println(", Name: "+ rs.getString("name")+"\n");
          }
          rs.close();
        //  System.out.println("success");
      
    }
      catch(Exception e)  
    {
        
    }
  }
}