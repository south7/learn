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
	//�������Ķ����ڲ����ṩ��һ�����ݿ��������ʵ��������
    private DatabaseConnection dbc=new DatabaseConnection();
	@Override
	public boolean insert(Emp vo) throws Exception {
		try {
			//Ҫ���ӵĹ�Ա������������,��findById()���صĽ������null,�ձ�ʾ���Խ����¹�Ա�ı���
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
