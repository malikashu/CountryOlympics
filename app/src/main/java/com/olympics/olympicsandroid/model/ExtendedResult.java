package com.olympics.olympicsandroid.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "extended-result",strict = false)
public class ExtendedResult implements Serializable
{
    @Attribute(required = false)
    private String code;

    @Attribute(required = false)
    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
