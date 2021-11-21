package com.xml.parser.sample.pojo;

import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement(name = "service-builder")
@XmlType(propOrder = {"created", "dependencyInjector", "packagePath", "nameSpace", "entity"})
public class ServiceBuilder
{

    private String dependencyInjector;
    private String packagePath;
    private Set<Entity> entity;
    private String nameSpace;
    private Date created;

    public String getDependencyInjector()
    {
        return dependencyInjector;
    }


    @XmlAttribute(name = "dependency-injector")
    public void setDependencyInjector(String dependencyInjector)
    {
        this.dependencyInjector = dependencyInjector;
    }


    public String getPackagePath()
    {
        return packagePath;
    }


    @XmlAttribute(name = "package-path")
    public void setPackagePath(String packagePath)
    {
        this.packagePath = packagePath;
    }


    @Override
    public String toString()
    {
        return "{created :" + created + ", dependencyInjector:" + dependencyInjector + ", packagePath:" + packagePath + ", entity:" + getEntity()
                + ", namespace: " + nameSpace + "}";
    }


    public String getNameSpace()
    {
        return nameSpace;
    }


    @XmlElement(name = "namespace")
    public void setNameSpace(String nameSpace)
    {
        this.nameSpace = nameSpace;
    }


    public Set<Entity> getEntity()
    {
        return entity;
    }


    @XmlElement(name = "entity")
    public void setEntity(Set<Entity> entity)
    {
        this.entity = entity;
    }


    public Date getCreated()
    {
        return created;
    }


    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setCreated(Date created)
    {
        this.created = created;
    }
}
