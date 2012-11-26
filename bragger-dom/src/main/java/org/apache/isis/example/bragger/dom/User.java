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

package org.apache.isis.example.bragger.dom;

import org.apache.isis.applib.AbstractDomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.value.Date;

public class User extends AbstractDomainObject {

    // {{ Title
    public String title() {
        return getUsername();
    }
    // }}
    
    // {{ iconName
    public String iconName() {
        return "User";
    }
    // }}

    // {{ DateCreated
    private Date dateCreated;

    @MemberOrder(sequence = "1")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    // }}

    // {{ Username
    private String username;

    @MemberOrder(sequence = "2")
    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }
    // }}

    // {{ password
    private String password;

    @MemberOrder(sequence = "3")
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
    // }}

    // {{ email
    private String email;

    @MemberOrder(sequence = "4")
    public String getEmail() {
        return email;
    }

    public void setEmail(final String password) {
        this.email = password;
    }
    // }}
}
