package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "aa_data")
public class Data {
    /**
     * 数据权限Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 表(库名.表名)
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 字段名
     */
    private String field;

    /**
     * 资源是否可用
     */
    private Boolean available;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取数据权限Id
     *
     * @return id - 数据权限Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置数据权限Id
     *
     * @param id 数据权限Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取表(库名.表名)
     *
     * @return table_name - 表(库名.表名)
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表(库名.表名)
     *
     * @param tableName 表(库名.表名)
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取字段名
     *
     * @return field - 字段名
     */
    public String getField() {
        return field;
    }

    /**
     * 设置字段名
     *
     * @param field 字段名
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * 获取资源是否可用
     *
     * @return available - 资源是否可用
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置资源是否可用
     *
     * @param available 资源是否可用
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