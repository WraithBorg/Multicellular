package org.ac.feign;

import com.ac.constant.ModulePrePath;
import org.ac.dto.SysUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("user-service")
public interface UserServiceClient {


    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @GetMapping(ModulePrePath.API+"/users/{userId}")
    SysUserDto getUser(@PathVariable("userId") int userId);

    /**
     * 下单扣减余额
     * @param userId
     * @param amount
     */
    @PutMapping(ModulePrePath.API+"/users/deduction_balance/{userId}/{amount}")
    void deductionBalance(@PathVariable("userId") int userId,@PathVariable("amount") double amount);

}
