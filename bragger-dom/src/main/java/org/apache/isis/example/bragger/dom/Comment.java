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
import org.apache.isis.applib.annotation.Hidden;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.value.Date;

/**
 * Domain class for comments on brags.  
 * 
 * @author misl (Minto van der Sluis)
 */
public class Comment extends AbstractDomainObject {

    // {{ Title
    public String title() {
        return getName();
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
    private String author;

    @MemberOrder(sequence = "2")
    public String getName() {
        return author;
    }

    public void setName(final String author) {
        this.author = author;
    }
    // }}

    // {{ email
    private String email;

    @MemberOrder(sequence = "3")
    @Hidden
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
    // }}

    // {{ content
    private String content;

    @MemberOrder(sequence = "4")
    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
    // }}
}
