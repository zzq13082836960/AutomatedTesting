package com.course.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String type;
    private String mobile;
    private String password;
    private String payPassword;
    private String name;
    private String idCard;
    private String createDate;
    private String modifyDate;
    private String remark;

}
