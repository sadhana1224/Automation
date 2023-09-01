package com.selenium.intermediate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class DatabseTesting {
	
			
	    	public static void  main(String[] args) throws  Exception {													
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:mysql://localhost:3036/emp";					

					//Database Username		
					String username = "root";	
	                
					//Database Password		
					String password = "guru99";				

					//Query to Execute		
					String query = "select *  from employee;";	
	                
	         	    //Load mysql jdbc driver		
	           	    Class.forName("com.mysql.jdbc.Driver");			
	           
	           		//Create Connection to DB		
	            	Connection con = DriverManager.getConnection(dbUrl,username,password);
	          
	          		//Create Statement Object		
	        	   Statement stmt = (Statement) con.createStatement();					
	       
	       			// Execute the SQL Query. Store results in ResultSet		
	         		ResultSet rs= ((java.sql.Statement) stmt).executeQuery(query);							
	         
	         		// While Loop to iterate through all data and print results		
					while (rs.next()){
				        		String myName = rs.getString(1);								        
	                            String myAge = rs.getString(2);					                               
	                            System. out.println(myName+"  "+myAge);		
	                    }		
	      			 // closing DB Connection		
	      			con.close();			
			}
	}



