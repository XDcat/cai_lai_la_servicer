package com.company.project.model;

import javax.persistence.*;

public class User {
    /**
     * id
     */
    @Id
    private Integer uid;

    /**
     * 外键，性别id
     */
    private Integer gid;

    /**
     * 昵称
     */
    @Column(name = "nickName")
    private String nickname;

    /**
     * 电话
     */
    @Column(name = "userTel")
    private String usertel;

    /**
     * e-mail
     */
    private String email;

    /**
     * 获取id
     *
     * @return uid - id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置id
     *
     * @param uid id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取外键，性别id
     *
     * @return gid - 外键，性别id
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * 设置外键，性别id
     *
     * @param gid 外键，性别id
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * 获取昵称
     *
     * @return nickName - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取电话
     *
     * @return userTel - 电话
     */
    public String getUsertel() {
        return usertel;
    }

    /**
     * 设置电话
     *
     * @param usertel 电话
     */
    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    /**
     * 获取e-mail
     *
     * @return email - e-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置e-mail
     *
     * @param email e-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }
}