package com.company.project.model;

import javax.persistence.*;

@Table(name = "discount_belong")
public class DiscountBelong {
    /**
     * 外键，用户id
     */
    private Integer uid;

    /**
     * 外键，折扣id
     */
    @Id
    private Integer did;

    /**
     * 获取外键，用户id
     *
     * @return uid - 外键，用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置外键，用户id
     *
     * @param uid 外键，用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取外键，折扣id
     *
     * @return did - 外键，折扣id
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置外键，折扣id
     *
     * @param did 外键，折扣id
     */
    public void setDid(Integer did) {
        this.did = did;
    }
}