package Restassured.Genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



public class DatabaseLibrary 
{
Driver driverRef ;
Connection con;
/**
 * this method is used to connect with mysql db
 * @author K RAMCHANDER
 * @throws SQLEXCEPTION
 */
public void connectToDB() throws SQLException
{
	driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	con=DriverManager.getConnection(Iconstants.dbURL,Iconstants.dbUserName,Iconstants.dbPassword);
}	

public void closeDB()throws SQLException
{
	con.close();
}

public String readDataAndvalidate(String query,int columnIndex,String expData)throws SQLException
{
	boolean flag=false;
	ResultSet result=con.createStatement().executeQuery(query);
	while (result.next())
	{
		if(result.getString(columnIndex).equalsIgnoreCase(expData))
		{
			flag=true;
			break;
		}
	}
	if(flag)
	{
		System.out.println("verified");
		return expData;
	}
	else
	{
		System.out.println("data not verified");
		return "";
	}
		
	}
}

