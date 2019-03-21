package cn.wangfan.service.impl;

import java.util.List;
import java.util.Set;

import cn.wangfan.dbc.DatabaseConnection;
import cn.wangfan.factory.DAOFactory;
import cn.wangfan.service.IDeptService;
import cn.wangfan.vo.Dept;

public class DeptServiceImpl implements IDeptService {

	private DatabaseConnection dbc=new DatabaseConnection();
	@Override
	public boolean insert(Dept vo) throws Exception {
		try {
			if(null==DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findById(vo.getDeptno())){
				return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doCreate(vo);
			}
			return false;
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
		
	}

	@Override
	public boolean update(Dept vo) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doUpdate(vo);
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
	}

	@Override
	public boolean delete(Set<Integer> ids) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doRemoveBatch(ids);
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
	}

	@Override
	public List<Dept> list() throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findAll();
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
	}

	@Override
	public Dept get(int id) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findById(id);
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
	}

}
