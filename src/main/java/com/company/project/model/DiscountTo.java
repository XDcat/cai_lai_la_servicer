package com.company.project.model;

import javax.persistence.*;

@Table(name = "discount_to")
public class DiscountTo {
    /**
     * 外键，折扣id
     */
    @Id
    private Integer did;

    /**
     * 外键，商品id
     */
    private Integer pid;

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

    /**
     * 获取外键，商品id
     *
     * @return pid - 外键，商品id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置外键，商品id
     *
     * @param pid 外键，商品id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}