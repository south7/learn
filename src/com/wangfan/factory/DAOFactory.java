package com.wangfan.factory;

import java.sql.Connection;

import cn.wangfan.dao.IEmpDAO;
import cn.wangfan.dao.impl.EmpDAOImpl;
/**
 * ���ݲ㹤����
 * @author wangfan
 *
 */
public class DAOFactory {

	public static IEmpDAO getIEmpDAOInstance(Connection conn){
		return new EmpDAOImpl(conn);
	}
}
