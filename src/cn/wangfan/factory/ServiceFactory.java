package cn.wangfan.factory;

import cn.wangfan.service.IEmpService;
import cn.wangfan.service.impl.EmpServiceImpl;
/**
 * ҵ��㹤����
 * ���ﲻ����ǰ��̨ҵ�񹤳�
 * @author wangfan
 *
 */
public class ServiceFactory {
	public static IEmpService getIEmpServiceInstance(){
		return new EmpServiceImpl();
	}

}
