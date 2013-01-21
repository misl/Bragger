/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.isis.tutorial.bragger.dom;

import java.util.List;

import org.apache.isis.applib.annotation.MemberOrder;

/**
 * Domain class representing blogs that can receive posts. 
 *
 * @author misl (Minto van der Sluis)
 */
public class Blog extends BraggerDomainObject {

    // {{ Title
    public String title() {
        return getName();
    }
    // }}

    // {{ iconName
    public String iconName() {
        return "Blog";
    }
    // }}

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------

    // {{ name (property)
    private String name;

    @MemberOrder(sequence = "1")
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
    // }}

    // {{ description (property)
    private String description;

    @MemberOrder(sequence = "1")
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
    // }}

    // {{ Users (property)
    private List<BlogMembership> users;

    @MemberOrder(sequence = "1")
    public List<BlogMembership> getUsers() {
        return users;
    }

    public void setUsers(final List<BlogMembership> users) {
        this.users = users;
    }
    // }}

    // {{ Configuration (property)
    private BlogConfiguration configuration;

    @MemberOrder(sequence = "1")
    public BlogConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final BlogConfiguration configuration) {
        this.configuration = configuration;
    }
    // }}


    // -----------------------------------------------------------------------
    // Actions
    // -----------------------------------------------------------------------
}
