package com.cg.mapper;

import com.cg.entity.Account;
import org.apache.ibatis.annotations.Param;

/**
 * 账户Mapper接口
 */
public interface AccountMapper {

	/**
	 * 更新账户
	 * @param accountNo 账户编号
	 * @param money 金额
	 * @return 影响行数
	 */
	int updateMoney(@Param("accountNo")String accountNo,
					@Param("money")double money);

	/**
	 * 根据银行账号查询账户详情
	 * @param accountNo 账户编号
	 * @return 账户详情
	 */
	Account selectAccount(String accountNo);
	
}
