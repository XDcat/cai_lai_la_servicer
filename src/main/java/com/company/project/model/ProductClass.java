package com.company.project.model;

import javax.persistence.*;

@Table(name = "product_class")
public class ProductClass {
    /**
     * id
     */
    @Id
    private Integer pcid;

    /**
     * 商品类型名称
     */
    @Column(name = "className")
    private String classname;

    /**
     * 获取id
     *
     * @return pcid - id
     */
    public Integer getPcid() {
        return pcid;
    }

    /**
     * 设置id
     *
     * @param pcid id
     */
    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    /**
     * 获取商品类型名称
     *
     * @return className - 商品类型名称
     */
    public String getClassname() {
        return classname;
    }

    /**
     * 设置商品类型名称
     *
     * @param classname 商品类型名称
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }
}