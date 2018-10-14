package com.csy.code007.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class User {
    @Id
    private String id;
    @NotEmpty(message = "请输入用户名")
    private String name;
    @NotEmpty(message = "请输入密码")
    private Integer password;
    @NotEmpty(message = "请输入邮箱")
    private String email;
    private String pohtop;
    private BigDecimal intergral;
    private Integer vip;
    private Integer status;
    private String roleName;
    private Date regiesterDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPohtop() {
        return pohtop;
    }

    public void setPohtop(String pohtop) {
        this.pohtop = pohtop;
    }

    public BigDecimal getIntergral() {
        return intergral;
    }

    public void setIntergral(BigDecimal intergral) {
        this.intergral = intergral;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getRegiesterDate() {
        return regiesterDate;
    }

    public void setRegiesterDate(Date regiesterDate) {
        this.regiesterDate = regiesterDate;
    }
}
