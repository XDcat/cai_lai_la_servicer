package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "purchase_order")
public class PurchaseOrder {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer oid;

    /**
     * 外键，用户id
     */
    private Integer uid;

    /**
     * 外键，商品id
     */
    private Integer pid;

    /**
     * 成交价格
     */
    @Column(name = "current_price")
    private Float currentPrice;

    /**
     * 成交时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 获取id
     *
     * @return oid - id
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置id
     *
     * @param oid id
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

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

    /**
     * 获取成交价格
     *
     * @return current_price - 成交价格
     */
    public Float getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 设置成交价格
     *
     * @param currentPrice 成交价格
     */
    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 获取成交时间
     *
     * @return order_time - 成交时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置成交时间
     *
     * @param orderTime 成交时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}