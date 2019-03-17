package cn.wangfan.dao;

import java.util.List;
import java.util.Set;

import cn.wangfan.vo.Emp;

/**
 * ���ݲ�ӿ�
 * ����emp������ݲ�Ĳ�����׼
 * @author wangfan
 *
 */
public interface IEmpDAO {
    /**
     * ʵ�����ݵ����Ӳ���
     * @param vo ������Ҫ�������ݵ�VO����
     * @return ���ݱ���ɹ�����true,���򷵻�false
     * @throws Exception SQLִ���쳣
     */
	public boolean doCreate(Emp vo)throws Exception;
	/**
	 * ʵ�����ݵ��޸Ĳ���,�����޸��Ǹ���id����ȫ���ֶ����ݵ��޸�
	 * @param vo ������Ҫ�޸����ݵ���Ϣ,һ��Ҫ��ID����
	 * @return �����޸ĳɹ�����true,���򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doUpdate(Emp vo)throws Exception;
	/**
	 * ִ�����ݵ�����ɾ������,����Ҫɾ����������Set���ϵ���ʽ����
	 * @param ids ����������Ҫɾ��������ID,���������ظ�����
	 * @return ɾ�����ݳɹ�����true(ɾ�������ݸ�����Ҫɾ�������ݸ�����ͬ),���򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doRemoveBatch(Set<Integer>ids)throws Exception;
	/**
	 * ���߹�Ա��Ų�ѯָ���Ĺ�Ա��Ϣ
	 * @param id Ҫ��ѯ�Ĺ�Ա���
	 * @return �����Ա��Ϣ���ڣ���������VO��������ʽ���أ������Ա���ݲ����ڣ��򷵻�NULL
	 * @throws Exception SQLִ���쳣
	 */
	public Emp findById(Integer id)throws Exception;
	/**
	 * ��ѯָ�����ݱ��ȫ����¼���Լ��ϵ���ʽ����
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ��أ�
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0(size()==0,����NULL)
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp>findAll()throws Exception;
	/**
	 * ��ҳ�������ݵ�ģ����ѯ,��ѯ����Լ��ϵ���ʽ����
	 * @param currentPage ��ǰ���ڵ�ҳ
	 * @param lineSize ÿҳ��ʾ����������
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ��أ�
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0(size()==0,����NULL)
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp>findAllSplit(Integer currentPage,Integer lineSize,String column,String keyWord)throws Exception;
	/**
	 * ����ģ����ѯ��������ͳ�ƣ��������û�м�¼ͳ�ƵĽ������0
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ���ر��е�������,���û�����ݷ���0
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp>findAllCount(String column,String keyWord)throws Exception;

}
