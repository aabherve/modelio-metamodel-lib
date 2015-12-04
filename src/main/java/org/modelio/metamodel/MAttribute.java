package org.modelio.metamodel;

/**
 * Attribute of Modleio 3.4.1 metamodel
 * Class generated with  ModelioMetaGenerator 1.0.0 Tool
 *
 * @author Antonin Abhervé
 */
public class MAttribute {
    private String id;

    private String name;

    private String exml;

    private Boolean isMany;

    private Boolean isUnique;

    private Boolean isOrdered;

    private MDataType mBaseType;

    public MAttribute(String id, String name, String exml, MDataType mBaseType, Boolean isMany, Boolean isUnique, Boolean isOrdered) {
        this.id = id;
        this.name = name;
        this.exml = exml;
        this.mBaseType = mBaseType;
        this.isMany = isMany;
        this.isUnique = isUnique;
        this.isOrdered = isOrdered;
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getExml() {

        return exml;
    }

    public MDataType getMDataType() {

        return mBaseType;
    }

    public Boolean getIsMany() {

        return isMany;
    }

    public Boolean getIsUnique() {

        return isUnique;
    }

    public Boolean getIsOrdered() {

        return isOrdered;
    }

}
