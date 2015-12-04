
/**

Copyright 2015 Softeam

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

**/


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
