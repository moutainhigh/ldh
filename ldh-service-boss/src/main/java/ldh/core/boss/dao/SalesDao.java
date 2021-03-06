package ldh.core.boss.dao; 

import java.util.List;
import java.util.Map;

import ldh.common.core.dao.BaseDao;
import ldh.facade.boss.entity.Sales;


/**
 *类描述：销售人员Dao接口
 */
public interface SalesDao extends BaseDao<Sales> {

	/***
	 * 根据条件查询列表
	 */
	@SuppressWarnings("rawtypes")
	List listByCondition(Map<String, Object> paramMap);
	
	/**
	 * 生成销售人员编号
	 */
	String buildSalesNo();

}
 