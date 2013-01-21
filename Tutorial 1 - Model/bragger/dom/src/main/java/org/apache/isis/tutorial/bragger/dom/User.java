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

/**
 * Domain class representing the user that accesses the Bragger application. 
 *
 * @author misl (Minto van der Sluis)
 */
public class User extends BraggerDomainObject {

    // {{ Title
    public String title() {
        return String.format("%s %s", getFirstName(), getLastName()) ;
    }
    // }}

    // {{ iconName
    public String iconName() {
        return "User";
    }
    // }}

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------
    
    // {{ Firstname
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    // }}

    // {{ Lastname
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    // }}

    // {{ password
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    // }}

    // {{ email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String password) {
        this.email = password;
    }
    // }}

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------
}
