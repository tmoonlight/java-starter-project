package com.cyyz.cy_system.domain.model;

import javax.persistence.*;

@Table(name = "shao_temp2")
public class ShaoTemp2 {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shao_temp2col")
    private String shaoTemp2col;

    @Column(name = "shao_temp2col1")
    private String shaoTemp2col1;

    @Column(name = "shao_temp2col2")
    private String shaoTemp2col2;

    /**
     * @return ID
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
     * @return shao_temp2col
     */
    public String getShaoTemp2col() {
        return shaoTemp2col;
    }

    /**
     * @param shaoTemp2col
     */
    public void setShaoTemp2col(String shaoTemp2col) {
        this.shaoTemp2col = shaoTemp2col;
    }

    /**
     * @return shao_temp2col1
     */
    public String getShaoTemp2col1() {
        return shaoTemp2col1;
    }

    /**
     * @param shaoTemp2col1
     */
    public void setShaoTemp2col1(String shaoTemp2col1) {
        this.shaoTemp2col1 = shaoTemp2col1;
    }

    /**
     * @return shao_temp2col2
     */
    public String getShaoTemp2col2() {
        return shaoTemp2col2;
    }

    /**
     * @param shaoTemp2col2
     */
    public void setShaoTemp2col2(String shaoTemp2col2) {
        this.shaoTemp2col2 = shaoTemp2col2;
    }
}