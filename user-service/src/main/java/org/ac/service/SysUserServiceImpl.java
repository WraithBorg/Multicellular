package org.ac.service;

import org.ac.dao.SysUserDao;
import org.ac.domain.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Resource
    SysUserDao userDao;

    @Override
    public SysUser getUser (String id) {
        System.out.println("获取用户信息");
        return userDao.selectById(id);
    }

    /**
     * 下单扣减余额
     *
     * @param userId
     * @param amount
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deductionBalance (int userId, double amount) {
        SysUser user = userDao.selectById(userId);
        double newBalance = user.getBalance() - amount;
        user.setBalance(newBalance);

        userDao.updateById(user);

        System.out.println("下单扣减余额成功!");
    }
}
