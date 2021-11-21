package com.xml.parser.sample.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"name", "finderColumn", "returnType"})
public class Finder
{

    private String name;
    private FinderColumn finderColumn;
    private String returnType;

    public String getName()
    {
        return name;
    }


    @XmlAttribute(name = "name")
    public void setName(String name)
    {
        this.name = name;
    }


    public FinderColumn getFinderColumn()
    {
        return finderColumn;
    }


    @XmlAttribute(name = "finder-column")
    public void setFinderColumn(FinderColumn finderColumn)
    {
        this.finderColumn = finderColumn;
    }


    public String getReturnType()
    {
        return returnType;
    }


    @XmlAttribute(name = "return-type")
    public void setReturnType(String returnType)
    {
        this.returnType = returnType;
    }


    @Override
    public String toString()
    {
        return "{name: " + name + ", finderColumn:" + finderColumn + ", returnType: " + returnType + " }";
    }
}
