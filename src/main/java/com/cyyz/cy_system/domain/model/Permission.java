package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "aa_permission")
public class Permission {
    /**
     * 资源Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父节点Id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 资源类型:menu,button,api
     */
    private String type;

    /**
     * 显示顺序
     */
    private Integer orders;

    /**
     * 图标标识
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 资源标识
     */
    @Column(name = "permission_url")
    private String permissionUrl;

    /**
     * 资源是否可用
     */
    private Boolean available;

    /**
     * 说明
     */
    private String description;

    /**
     * 获取资源Id
     *
     * @return id - 资源Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置资源Id
     *
     * @param id 资源Id
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
     * 获取父节点Id
     *
     * @return parent_id - 父节点Id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父节点Id
     *
     * @param parentId 父节点Id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取资源类型:menu,button,api
     *
     * @return type - 资源类型:menu,button,api
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型:menu,button,api
     *
     * @param type 资源类型:menu,button,api
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取显示顺序
     *
     * @return orders - 显示顺序
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置显示顺序
     *
     * @param orders 显示顺序
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取图标标识
     *
     * @return image_url - 图标标识
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图标标识
     *
     * @param imageUrl 图标标识
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取资源标识
     *
     * @return permission_url - 资源标识
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * 设置资源标识
     *
     * @param permissionUrl 资源标识
     */
    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
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
     * 获取说明
     *
     * @return description - 说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置说明
     *
     * @param description 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }
}