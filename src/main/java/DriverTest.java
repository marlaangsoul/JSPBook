package com.soo.projectmain;
import java.sql.*;

public class DriverTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mariadb://000.000.000.000:3306/soo_edu_125","000000","0000000");
			System.out.println("디비 접속 성공");
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException : 디비 연동에 실패했습니다" );
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

//<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
//<property name="driverClassName" value="org.mariadb.jdbc.Driver"/>
//<property name ="url" value="jdbc:mariadb://125.140.201.190:3306/soo_edu_125"/>
//<property name="username" value="root"/>
//<property name="password" value="difficultMariaRoot#12"/>
//</bean>