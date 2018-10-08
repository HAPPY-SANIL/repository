package com.nissan.training.corejava.jdbc;

import java.sql.*;

public class Mysqlcon {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan","root","admin");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
		
		stmt.executeUpdate("insert into student values(6,'happy',21)");
		rs=stmt.executeQuery("select * from student");
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		
		stmt.executeUpdate("delete from student where id=6");
		rs=stmt.executeQuery("select * from student");
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		
		stmt.executeUpdate("update student set name = 'hance' where id=1");
		
		rs=stmt.executeQuery("select count(*) from student");
		while(rs.next())  
			System.out.println(rs.getString(1));
		
		PreparedStatement stmt1=con.prepareStatement("insert into student values(?,?,?)");
		stmt1.setInt(1, 7);
		stmt1.setString(2, "johny");
		stmt1.setInt(3, 66);
		int i=stmt1.executeUpdate();
		System.out.println(i+" record inserted");
		
		stmt1=con.prepareStatement("update student set name = ? where id=1");
		stmt1.setString(1, "mathew");
		i=stmt1.executeUpdate();
		System.out.println(i+" record inserted");
		
		rs=stmt.executeQuery("select * from student");
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}
