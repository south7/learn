package cn.wangfan.factory;

import java.sql.Connection;

import cn.wangfan.dao.IDeptDAO;
import cn.wangfan.dao.IEmpDAO;
import cn.wangfan.dao.impl.DeptDAOImpl;
import cn.wangfan.dao.impl.EmpDAOImpl;
/**
 * 数据层工厂类
 * @author wangfan
 *
 */
public class DAOFactory {

	public static IEmpDAO getIEmpDAOInstance(Connection conn){
		return new EmpDAOImpl(conn);
	}
	public static IDeptDAO getIDeptDAOInstance(Connection conn){
		return new DeptDAOImpl(conn);
	}
}
