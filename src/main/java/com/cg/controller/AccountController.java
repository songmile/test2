package com.cg.controller;

import com.cg.common.Result;
import com.cg.entity.TransferParam;
import com.cg.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 银行转账接口
     * @param param 转账参数
     * @return 统一返回结果
     */
    @RequestMapping("/account/transfer")
    @CrossOrigin
    public Result<String> hello(@RequestBody TransferParam param){
        //执行转账操作
        String result=accountService.moneyTransfer(param.getAccountA(), param.getAccountB(),param.getMoney());
        if(result.equals("success")){
            return new Result<>(1,"转账成功",result);
        }else{
            return new Result<>(0,"转账失败",result);
        }
    }
}
