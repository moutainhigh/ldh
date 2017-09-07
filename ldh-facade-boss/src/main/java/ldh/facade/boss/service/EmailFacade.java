package ldh.facade.boss.service;

import java.util.List;
import java.util.Map;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.facade.boss.entity.EmailVerify;
import ldh.facade.boss.exceptions.BossBizException;


/**
 * @描述: 邮件功能（邮箱验证记录表、邮件发送记录表）对外服务接口.
 */
public interface EmailFacade {

	// ////////////// 邮箱验证记录表 EmailVerify ////////////////
	/**
	 * 创建邮箱验证记录.
	 * 
	 * @param param
	 *            .
	 * @return ID .
	 */
	long createEmailVerify(EmailVerify param) throws BossBizException;

	/**
	 * 更新邮箱验证记录.
	 * 
	 * @param param
	 *            .
	 * @return 0或1 .
	 */
	long updateEmailVerify(EmailVerify param) throws BossBizException;

	/**
	 * 批量修改状态
	 * 
	 * @param paramMap
	 * @return
	 */
	long updateStatus(Map<String, Object> paramMap);

	/**
	 * 根据ID获取邮箱验证记录.
	 * 
	 * @param id
	 *            .
	 * @return EmailVerify.
	 */
	EmailVerify getEmailVerifyById(long id) throws BossBizException;

	/**
	 * 根据令牌(token)获取邮箱验证记录.
	 * 
	 * @param id
	 *            .
	 * @return EmailVerify.
	 */
	EmailVerify getEmailVerifyByToken(String token) throws BossBizException;

	/**
	 * 分页查询邮箱验证记录.
	 * 
	 * @param pageParam
	 *            分页参数.
	 * @param paramMap
	 *            查询能数 .
	 * @return EmailVerifyList.
	 */
	PageBean queryEmailVerifyListPage(PageParam pageParam, Map<String, Object> paramMap) throws BossBizException;

	/***
	 * 根据条件查询邮箱验证记录
	 * 
	 * @param paramMap
	 * @return
	 * @throws BossBizException
	 */
	@SuppressWarnings("rawtypes")
	List listModelByCondition(Map<String, Object> paramMap) throws BossBizException;

}
