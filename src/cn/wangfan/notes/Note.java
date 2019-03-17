package cn.wangfan.notes;

public class Note {
/**
 * 知识点：
 * 1.理解程序设计分层的思想
 * 2.DAO设计模式的组成以及各部分的开发
 * 
 * 具体内容：
 * 程序分层最常见的划分方式:显示层+控制层+业务层+数据层+数据库
 * 显示层和控制层统称为前台，业务层和数据层统称为后台业务层
 * 数据层完成的是一个个原子性的数据库开发，一个业务层的操作需要多个数据层的操作，总业务可划分为多个子业务
 * 数据层：又被称为数据访问层（Data Access Object,DAO）,是专门进行数据库的原子性操作，数据层最需要控制的就是JDBC中的PrepareStatement接口的使用
 * 业务层：又被称为业务对象(Business Object,BO),但是现在又被称为服务层(Service),核心目的是调用多个数据层的操作已完成整体项目的业务设计
 * 数据库中的实体表，一定要写简单Java类，保存在vo包
 * 开发数据层：数据层最终交给业务层调用的，所以业务层必须知道数据层的执行标准，即业务层需要明确 的知道数据层的操作方法，但是不需要知道它的具体实现。
 * 数据层保存在dao包,数据层的接口定义I+数据表+DAO.
 * 数据层两类功能：
 *   更新：操作方法以doXxx()的形式命名,例如:doCreate().doUpdate().doRemove()
 *   查询:查询两种形式
 *       查询表中数据:以findXxx()形式命名，例如:findById(),findByName(),findAll()
 *       统计表中数据：以getXxx()形式命名,例如getAllCount()
 * 数据层实现类:数据层的打开和关闭操作应该由业务层控制会比较好，所有的数据层实现类要求保存在dao.impl子包下
 */
}
