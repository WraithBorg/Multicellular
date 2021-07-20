package org.ac.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class SysUser {
    private String id;
    private String userName;
    private double balance;
}
