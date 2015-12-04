package org.modelio.metamodel;

/**
 * Dependency of Modleio 3.4.1 metamodel
 * Class generated with  ModelioMetaGenerator 1.0.0 Tool
 *
 * @author Antonin Abhervé
 */
public class MDependency {
    private String id;

    private String name;

    private String exml;

    private Boolean isMany;

    private Boolean isUnique;

    private Boolean isOrdered;

    private Boolean isConposition;

    private MClass mClass;

    public MDependency(String id, String name, String exml, MClass mClass, Boolean isMany, Boolean isUnique, Boolean isOrdered, Boolean isConposition) {
        this.id = id;
        this.name = name;
        this.exml = exml;
        this.mClass = mClass;
        this.isMany = isMany;
        this.isUnique = isUnique;
        this.isOrdered = isOrdered;
        this.isConposition = isConposition;
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

    public MClass getMClass() {

        return mClass;
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

    public Boolean getIsConposition() {

        return isConposition;
    }

}
