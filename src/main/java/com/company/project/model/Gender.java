package com.company.project.model;

import javax.persistence.*;

public class Gender {
    /**
     * id
     */
    @Id
    private Integer gid;

    /**
     * 名称
     */
    @Column(name = "gName")
    private String gname;

    /**
     * 获取id
     *
     * @return gid - id
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * 设置id
     *
     * @param gid id
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * 获取名称
     *
     * @return gName - 名称
     */
    public String getGname() {
        return gname;
    }

    /**
     * 设置名称
     *
     * @param gname 名称
     */
    public void setGname(String gname) {
        this.gname = gname;
    }
}