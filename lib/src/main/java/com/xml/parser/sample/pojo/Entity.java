package com.xml.parser.sample.pojo;

import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"name", "table", "column"})
public class Entity
{

    private String name;
    private String table;
    private Set<Column> column;

    public String getName()
    {
        return name;
    }


    @XmlAttribute(name = "name")
    public void setName(String name)
    {
        this.name = name;
    }


    public String getTable()
    {
        return table;
    }


    @XmlAttribute(name = "table")
    public void setTable(String table)
    {
        this.table = table;
    }


    @Override
    public String toString()
    {
        return "{ name:" + name + ", column:" + getColumn() + "}";
    }


    public Set<Column> getColumn()
    {
        return column;
    }


    @XmlElement(name = "column")
    public void setColumn(Set<Column> column)
    {
        this.column = column;
    }
}
