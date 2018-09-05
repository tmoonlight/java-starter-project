package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "aa_role")
public class Role {
    /**
     * 角色Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否可用
     */
    private Boolean available;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取角色Id
     *
     * @return id - 角色Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置角色Id
     *
     * @param id 角色Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否可用
     *
     * @return available - 是否可用
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置是否可用
     *
     * @param available 是否可用
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}