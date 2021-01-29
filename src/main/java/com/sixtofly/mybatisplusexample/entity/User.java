package com.sixtofly.mybatisplusexample.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sixtofly.mybatisplusexample.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xieyuanbing
 * @since 2021-01-28
 */
@TableName("user")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 账户
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 微信-openId
     */
    private String openId;

    /**
     * 微信-用户昵称
     */
    private String nickName;

    /**
     * 微信-用户性别 0: 未知, 1: 男性, 2:女性
     */
    private String gender;

    /**
     * en: 英文, zh_CN: 简体中文, zh_TW: 繁体中文
     */
    private String language;

    /**
     * 微信-用户所在国家
     */
    private String country;

    /**
     * 微信-用户所在省份
     */
    private String province;

    /**
     * 微信-用户所在城市
     */
    private String city;

    /**
     * 微信-用户头像
     */
    private String avatarUrl;

    /**
     * 微信-unionId
     */
    private String unionId;

    /**
     * 账户过期状态
     */
    private Boolean accountNonExpired;

    /**
     * 账户锁定状态
     */
    private Boolean accountNonLocked;

    /**
     * 凭证过期状态
     */
    private Boolean credentialsNonExpired;

    private Boolean enabled;


}
