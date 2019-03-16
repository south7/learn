package cn.wangfan.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ����ר�Ÿ������ݿ��������رղ���,��ʵ�����������ʱ����ζ��Ҫ�������ݿ�Ŀ���
 * �����ڱ���Ĺ��췽����Ҫ�������ݿ��������������ݿ�����ȡ��
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
   * �ڹ��췽������Ϊconn�������ʵ����,����ֱ��ȡ�����ݿ�����Ӷ���
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
   * ȡ��һ�����ݿ�����Ӷ���
   * @return Connectionʵ��������
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
