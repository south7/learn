package com.wangfan.factory;

import com.wangfan.service.IEmpService;
import com.wangfan.service.impl.EmpServiceImpl;
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
