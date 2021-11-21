package com.xml.parser.sample.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"name"})
public class FinderColumn
{

    private String name;

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
        return "{name=" + name + " }";
    }
}
