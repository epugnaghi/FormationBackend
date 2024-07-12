package com.ep.Hibernate4All.domain;

public enum Certification
{
    FOR_ALL(1, "Tout public"),
    NOT_UNDER_12(2, "Interdit au moins de 12"),
    NOT_UNDER_16(3, "Interdit au moins de 16"),
    NOT_UNDER_18(4, "Interdit au moins de 18");

    private Integer key;
    private String description;

    Certification(Integer key, String description)
    {
        this.key = key;
        this.description = description;
    }

    public Integer getKey()
    {
        return key;
    }

    public void setKey(Integer key)
    {
        this.key = key;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
