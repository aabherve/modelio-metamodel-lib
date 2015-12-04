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

import java.util.ArrayList;
import java.util.List;


/**
 * Package of Modleio 3.4.1 metamodel
 * Class generated with  ModelioMetaGenerator 1.0.0 Tool
 *
 * @author Antonin Abherv�
 */
public class MPackage {
    private String id;

    private String name;

    private String exml;

    private List<MPackage> mPackages;

    private List<MClass> mClass;

    public MPackage(String id, String name, String exml) {
        this.mPackages = new ArrayList<>();
        this.mClass = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.exml = exml;
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

    public List<MPackage> getMPackages() {

        return mPackages;
    }

    public List<MClass> getMClass() {

        return mClass;
    }

}
