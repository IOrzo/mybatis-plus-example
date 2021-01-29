package com.sixtofly.mybatisplusexample.entity;

import com.sixtofly.mybatisplusexample.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 功能：customize_template表的映射类
 * 说明：
 * </p>
 *
 * @author xieyuanbing
 * @since 2021-01-28 11:03:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CustomizeTemplate extends BaseEntity {

    private static final long serialVersionUID = 267306174456160L;

    /**
     *分库字段标志，true代表是分库的表，false代表非分库的表
     */
    private static final boolean DB_D_FLAG = false;

    /**
     *分库字段名称
    */
    private static final String DB_D_NAME="dBNAME";

    /**
     *分表字段标志，true代表是分表的表，false代表非分表的表
     */
    private static final boolean DB_T_FLAG = false;

    /**
     *分表字段名称
     */
    private static final String DB_T_NAME="dTNAME";

    /**
     * 账户
     */
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
