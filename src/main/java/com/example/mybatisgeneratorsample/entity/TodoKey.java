package com.example.mybatisgeneratorsample.entity;

import java.util.Date;

public class TodoKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todos.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todos.target_date
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private Date targetDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todos.id
     *
     * @return the value of todos.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todos.id
     *
     * @param id the value for todos.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todos.target_date
     *
     * @return the value of todos.target_date
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public Date getTargetDate() {
        return targetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todos.target_date
     *
     * @param targetDate the value for todos.target_date
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}