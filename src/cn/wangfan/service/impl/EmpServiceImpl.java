package cn.wangfan.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.wangfan.dbc.DatabaseConnection;
import cn.wangfan.factory.DAOFactory;
import cn.wangfan.service.IEmpService;
import cn.wangfan.vo.Emp;

public class EmpServiceImpl implements IEmpService {
	//在这个类的对象内部就提供有一个数据库连接类的实例化对象
    private DatabaseConnection dbc=new DatabaseConnection();
	@Override
	public boolean insert(Emp vo) throws Exception {
		try {
			//要增加的雇员编号如果不存在,则findById()返回的结果就是null,空表示可以进行新雇员的保存
			if(null==DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(vo.getEmpno())){
				return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doCreate(vo);
			}
			return false;
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

	@Override
	public boolean update(Emp vo) throws Exception {
		try {
			 return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doUpdate(vo);
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

	@Override
	public boolean delete(Set<Integer> ids) throws Exception {
		try {
			 return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doRemoveBatch(ids);
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

	@Override
	public Emp get(int id) throws Exception {
		try {
			 return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(id);
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

	@Override
	public List<Emp> list() throws Exception {
		try {
			 return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAll();
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

	@Override
	public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception {
		try {
			 Map<String,Object>map=new HashMap<String, Object>();
			 map.put("allEmps", DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAllSplit(currentPage, lineSize, column, keyWord));
			 map.put("empCount", DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAllCount(column, keyWord));
			 return map;
		} catch (Exception e) {
			throw e;
		}finally {
			dbc.close();
		}
	}

}
