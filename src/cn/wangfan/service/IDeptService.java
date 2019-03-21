package cn.wangfan.service;

import java.util.List;
import java.util.Set;

import cn.wangfan.vo.Dept;

public interface IDeptService {

	public boolean insert(Dept vo)throws Exception;
	public boolean update(Dept vo)throws Exception;
	public boolean delete(Set<Integer> ids)throws Exception;
	public List<Dept> list() throws Exception;
	public Dept get(int id)throws Exception;
	
}
