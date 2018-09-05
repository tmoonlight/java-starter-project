package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "aa_user")
public class User {
    /**
     * 用户Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 员工编号
     */
    @Column(name = "staff_no")
    private String staffNo;

    /**
     * 员工姓名
     */
    @Column(name = "staff_name")
    private String staffName;

    /**
     * 授权代理
     */
    @Column(name = "proxy_user")
    private String proxyUser;

    /**
     * 业务部门
     */
    @Column(name = "dept_no")
    private String deptNo;

    /**
     * 是否在线
     */
    private Boolean loaded;

    /**
     * 是否禁用
     */
    private Boolean disabled;

    /**
     * 是否锁定
     */
    private Boolean locked;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取用户Id
     *
     * @return id - 用户Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户Id
     *
     * @param id 用户Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取员工编号
     *
     * @return staff_no - 员工编号
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * 设置员工编号
     *
     * @param staffNo 员工编号
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * 获取员工姓名
     *
     * @return staff_name - 员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置员工姓名
     *
     * @param staffName 员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取授权代理
     *
     * @return proxy_user - 授权代理
     */
    public String getProxyUser() {
        return proxyUser;
    }

    /**
     * 设置授权代理
     *
     * @param proxyUser 授权代理
     */
    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    /**
     * 获取业务部门
     *
     * @return dept_no - 业务部门
     */
    public String getDeptNo() {
        return deptNo;
    }

    /**
     * 设置业务部门
     *
     * @param deptNo 业务部门
     */
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * 获取是否在线
     *
     * @return loaded - 是否在线
     */
    public Boolean getLoaded() {
        return loaded;
    }

    /**
     * 设置是否在线
     *
     * @param loaded 是否在线
     */
    public void setLoaded(Boolean loaded) {
        this.loaded = loaded;
    }

    /**
     * 获取是否禁用
     *
     * @return disabled - 是否禁用
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 设置是否禁用
     *
     * @param disabled 是否禁用
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 获取是否锁定
     *
     * @return locked - 是否锁定
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置是否锁定
     *
     * @param locked 是否锁定
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
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