package com.wangfan.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import cn.wangfan.vo.Emp;

/**
 * ����emp���ҵ����ִ�б�׼,����һ��Ҫ�������ݿ�Ĵ���رղ���
 * �����ͨ��DAOFactory���ȡ��IEmpDAO�ӿڶ���
 * @author wangfan
 *
 */
public interface IEmpService {
    /**
     * ʵ�ֹ�Ա���ݵ����Ӳ���������Ҫ����IEmpDAO�ӿڵ����·�����
     * 1.��Ҫ����IEmpDAO.findById()�������ж�Ҫ�������ݵ�id�Ƿ��Ѿ�����
     * 2.�����Ų����������IEmpDAO.doCreate()���������ز����Ľ��
     * @param vo ������Ҫ�������ݵ�VO����
     * @return ����������ݵ�ID�ظ����߱���ʧ�ܷ���false,���򷵻�true
     * @throws Exception SQLִ���쳣
     */
	public boolean insert(Emp vo)throws Exception;
	/**
	 * ʵ�ֹ�Ա���ݵ��޸Ĳ���,����Ҫ����IEmpDAO.doUpdate()����,�����޸�����ȫ�����ݵ��޸�
	 * @param vo ������Ҫ�޸����ݵ�VO���� 
	 * @return �޸ĳɹ�����true�����򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean update(Emp vo)throws Exception;
    /**
     * ִ�й�Ա���ݵ�ɾ������������ɾ�������Ա��Ϣ������IEmpDAO.doRemoveBatch()����
     * @param ids ������Ҫɾ�����ݵļ��ϣ�û���ظ�����
     * @return ɾ���ɹ�����true,���򷵻�false
     * @throws Exception SQLִ���쳣
     */
	public boolean delete(Set<Integer> ids)throws Exception;
	/**
	 * ���ݹ�Ա��Ų��ҹ�Ա��������Ϣ������IEmpDAO.findById()����
	 * @param id Ҫ���ҵĹ�Ա���
	 * @return ����ҵ������Ա��Ϣ��VO���󷵻�,���򷵻�null
	 * @throws Exception SQLִ���쳣
	 */
	public Emp get(int id)throws Exception;
	/**
	 * ��ѯȫ����Ա��Ϣ������IEmpDAO.findAll()����
	 * @return ��ѯ�����List���ϵ���ʽ���أ����û�������򼯺ϵĳ���Ϊ0
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp> list() throws Exception;
	/**
	 * ʵ�����ݵ�ģ����ѯ������ͳ��,Ҫ����IEmpDAO�ӿڵ���������
	 * 1.����IEmpDAO.findAllSpilt()��������ѯ���еı����ݣ�����List<Emp>
	 * 2.����IEmpDAO.getAllCount()����,��ѯ���е������������ص���Integer
	 * @param currentPage ��ǰ����ҳ
	 * @param lineSize ÿҳ��ʾ�ļ�¼��
	 * @param column ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ������������Ҫ��������������ͣ�����ʹ��Map���Ϸ��أ��������Ͳ�ͳһ���������е�value����������ΪObject,���ؽ�����£�
	 * key=allEmps,value=IEmpDAO.findAllSplit()���ؽ����:List<Emp>
	 * key=empCount,value=IEmpDAO.getAllCount()���ؽ����Integer
	 * @throws Exception SQLִ���쳣
	 */
	public Map<String,Object>list(int currentPage,int lineSize,String column,String keyWord)throws Exception;
}
