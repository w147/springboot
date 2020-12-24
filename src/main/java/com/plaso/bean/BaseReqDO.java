package com.plaso.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BaseReqDO implements Serializable {
    private static final long serialVersionUID = 8706843673978981262L;

    private String name;

    private Integer age;

    private List<Integer> uIds;
}