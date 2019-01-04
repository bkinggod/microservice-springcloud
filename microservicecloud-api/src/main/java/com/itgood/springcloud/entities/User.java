package com.itgood.springcloud.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by bicheng on 2019/1/4.
 */
public class User implements Serializable{
    private Long id;

    private String username;

    private String cname;

    private Integer age;

    private BigDecimal balance;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
