package com.xml.parser.sample.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"name", "dbName", "type", "primary"})
public class Column
{

    private String name;
    private String dbName;
    private String type;
    private boolean primary;

    public String getDbName()
    {
        return dbName;
    }


    @XmlAttribute(name = "db-name")
    public void setDbName(String dbName)
    {
        this.dbName = dbName;
    }


    public String getType()
    {
        return type;
    }


    @XmlAttribute(name = "type")
    public void setType(String type)
    {
        this.type = type;
    }


    public boolean isPrimary()
    {
        return primary;
    }


    @XmlAttribute(name = "primary")
    public void setPrimary(boolean primary)
    {
        this.primary = primary;
    }


    public String getName()
    {
        return name;
    }


    @XmlAttribute(name = "name")
    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public String toString()
    {
        return "{name:" + name + ", dbName:" + dbName + ", type : " + type + ", primary: " + primary + " }";
    }
}
