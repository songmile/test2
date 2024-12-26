package com.cg.service;

import com.cg.entity.Account;
import com.cg.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;

	/**
	 * 转账操作，用户A账户向用户B账户转账
	 *
	 * @param accountA
	 *            用户A账户编号
	 * @param accountB
	 *            用户B账户编号
	 * @param money
	 *            转账金额
	 * @return 转账结果
	 */
	public String moneyTransfer(String accountA, String accountB, double money) {
		System.out.println("开始转账");
		// 获取A和B账户的详情
		Account A = accountMapper.selectAccount(accountA);
		Account B = accountMapper.selectAccount(accountB);
		//用户A账户减少相应金额
		accountMapper.updateMoney(accountA, A.getMoney() - money);
		//用户B账户增加相应金额
		accountMapper.updateMoney(accountB, B.getMoney() + money);
		return "success";
	}
}
