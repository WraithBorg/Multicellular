package org.ac.api;

import com.ac.constant.ModulePrePath;
import org.ac.domain.SysUser;
import org.ac.service.ISysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(ModulePrePath.API+"/users")
public class SysUserApi {

    @Resource
    ISysUserService sysUserService;

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public SysUser getUser(@PathVariable String userId){
        return sysUserService.getUser(userId);
    }

    /**
     * 下单扣减余额
     * @param userId
     * @param amount
     */
    @PutMapping("/deduction_balance/{userId}/{amount}")
    void deductionBalance(@PathVariable int userId,@PathVariable double amount){
        sysUserService.deductionBalance(userId,amount);
    }
}
