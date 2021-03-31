package com.yl.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName MiUser
 * @Author yangli
 * @Date 2021/3/29 16:39
 * @Description:
 */
@Data
public class MiUser implements Serializable {

    private static final long serialVersionUID = -1748289340320186418L;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
