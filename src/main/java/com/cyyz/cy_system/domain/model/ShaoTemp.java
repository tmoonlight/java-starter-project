package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "shao_temp")
public class ShaoTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shao_tempcol1")
    private String shaoTempcol1;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return shao_tempcol1
     */
    public String getShaoTempcol1() {
        return shaoTempcol1;
    }

    /**
     * @param shaoTempcol1
     */
    public void setShaoTempcol1(String shaoTempcol1) {
        this.shaoTempcol1 = shaoTempcol1;
    }
}