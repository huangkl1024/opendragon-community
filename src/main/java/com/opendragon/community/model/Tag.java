package com.opendragon.community.model;

public class Tag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.name
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.class_id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    private Integer classId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.name
     *
     * @return the value of tag.name
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.name
     *
     * @param name the value for tag.name
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.class_id
     *
     * @return the value of tag.class_id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.class_id
     *
     * @param classId the value for tag.class_id
     *
     * @mbg.generated Sat Aug 31 14:25:57 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}