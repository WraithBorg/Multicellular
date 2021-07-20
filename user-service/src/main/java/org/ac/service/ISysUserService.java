package org.ac.service;

import org.ac.domain.SysUser;

public interface ISysUserService {
    SysUser getUser(String id);

    public void deductionBalance (int userId, double amount);
}
