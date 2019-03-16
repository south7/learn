package cn.wangfan.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 本类专门负责数据库的链接与关闭操作,在实例化本类对象时就意味着要进行数据库的开发
 * 所以在本类的构造方法里要进行数据库驱动加载与数据库链接取得
 * @author wangfan
 *
 */
public class DatabaseConnection {
  private static final String DBDRIVER="com.mysql.jdbc.Driver";
  private static final String DBURL="jdbc:mysql://localhost:3306/dao?useSSL=false";
  private static final String DBUSER="root";
  private static final String PASSWORD="root";
  private Connection conn=null;
  /**
   * 在构造方法里面为conn对象进行实例化,可以直接取得数据库的链接对象
   */
  public DatabaseConnection() {
    try {
		Class.forName(DBDRIVER);
		this.conn=DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
  /**
   * 取得一个数据库的链接对象
   * @return Connection实例化对象
   */
  public Connection getConnection(){
	  return this.conn;
  }
  public void close(){
	  if(null!=this.conn){
		  try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  }
  }
}
