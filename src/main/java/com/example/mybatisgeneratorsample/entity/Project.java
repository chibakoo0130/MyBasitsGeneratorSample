package com.example.mybatisgeneratorsample.entity;

import java.util.Date;

public class Project {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.user_id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.name
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.description
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.created_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projects.updated_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.id
     *
     * @return the value of projects.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.id
     *
     * @param id the value for projects.id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.user_id
     *
     * @return the value of projects.user_id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.user_id
     *
     * @param userId the value for projects.user_id
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.name
     *
     * @return the value of projects.name
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.name
     *
     * @param name the value for projects.name
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.description
     *
     * @return the value of projects.description
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.description
     *
     * @param description the value for projects.description
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.created_at
     *
     * @return the value of projects.created_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.created_at
     *
     * @param createdAt the value for projects.created_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projects.updated_at
     *
     * @return the value of projects.updated_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projects.updated_at
     *
     * @param updatedAt the value for projects.updated_at
     *
     * @mbg.generated Fri Mar 28 09:34:52 JST 2025
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}