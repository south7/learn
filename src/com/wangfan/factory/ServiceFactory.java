package com.wangfan.factory;

import com.wangfan.service.IEmpService;
import com.wangfan.service.impl.EmpServiceImpl;
/**
 * 业务层工厂类
 * 这里不区分前后台业务工厂
 * @author wangfan
 *
 */
public class ServiceFactory {
	public static IEmpService getIEmpServiceInstance(){
		return new EmpServiceImpl();
	}

}
