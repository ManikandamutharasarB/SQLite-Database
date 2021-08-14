package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;


public class SQLiteDemo {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:sqlite:/E:\\SQLite\\sqlite-tools-win32-x86-3360000\\movies.db";
		try
		{
			Connection connection=DriverManager.getConnection(jdbcUrl);
			String sql="select rowid,* from movie";
			String sql1="select rowid,* from movie where actor='Vijay'";
			String sql2="select rowid,* from movie where year_of_release=2019";
			String sql3="select rowid,* from movie where director='vetrimaran'";
			String sql4="select rowid,* from movie where actor='Vijay' and director='Murugadoss'";
			String sql5="select rowid,* from movie where actor='Dhanush' or director='Murugadoss'";
					
			Statement statement=connection.createStatement();
			Scanner sc=new Scanner(System.in);
			
				int res=0;
			
				
				while(res<7) 
				{
					System.out.println("Select Any Query from 1 to 6");
					
					res=sc.nextInt();
					
					
				if(res==1)
				{
					ResultSet result=statement.executeQuery(sql);
					while(result.next())
					{
						
						Integer id=result.getInt("rowid");
						String name=result.getString("name");
						String actor=result.getString("actor");
						String actress=result.getString("actress");
						String director=result.getString("director");
						Integer year_of_release=result.getInt("year_of_release");
						
						
						System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
					}
					break;
					
				}
				else if(res==2)
				{
					ResultSet result1=statement.executeQuery(sql1);
					while(result1.next())
					{
						Integer id=result1.getInt("rowid");
						String name=result1.getString("name");
						String actor=result1.getString("actor");
						String actress=result1.getString("actress");
						String director=result1.getString("director");
						Integer year_of_release=result1.getInt("year_of_release");
						
						System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
						
					}
					
					break;
				}
				else if(res==3)
				{
					ResultSet result2=statement.executeQuery(sql2);
					while(result2.next()) {
						Integer id=result2.getInt("rowid");
						String name=result2.getString("name");
						String actor=result2.getString("actor");
						String actress=result2.getString("actress");
						String director=result2.getString("director");
						Integer year_of_release=result2.getInt("year_of_release");
						
						System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
						
					}
					break;
				}
				else if(res==4)
				{
					ResultSet result3=statement.executeQuery(sql3);
					while(result3.next()) {
						Integer id=result3.getInt("rowid");
						String name=result3.getString("name");
						String actor=result3.getString("actor");
						String actress=result3.getString("actress");
						String director=result3.getString("director");
						Integer year_of_release=result3.getInt("year_of_release");
						
						System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
					
					}
					break;
				}
				else if(res==5)
				{
					ResultSet result4=statement.executeQuery(sql4);
					
					while(result4.next())
					{
						Integer id=result4.getInt("rowid");
						String name=result4.getString("name");
						String actor=result4.getString("actor");
						String actress=result4.getString("actress");
						String director=result4.getString("director");
						Integer year_of_release=result4.getInt("year_of_release");
						
						System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
					}
					
					break;
				}
					else if(res==6)
					{
						ResultSet result5=statement.executeQuery(sql5);
						while(result5.next()) {
							Integer id=result5.getInt("rowid");
							String name=result5.getString("name");
							String actor=result5.getString("actor");
							String actress=result5.getString("actress");
							String director=result5.getString("director");
							Integer year_of_release=result5.getInt("year_of_release");
							
							System.out.println(id+" | "+name+" | "+actor+" | "+actress+" | "+director+" | "+year_of_release);
						
						}
						break;
					}
					else
					{
						System.out.println("NO Queries where created ");
						break;
					}
					
					
		}
		}
		catch(SQLException e ) {
			System.out.println("Error Connecting");
			e.printStackTrace();
		}
	
		
	}

}
