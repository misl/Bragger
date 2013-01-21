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

import org.apache.isis.applib.annotation.MemberOrder;

/**
 * Domain class representing membership of users that have specified
 * role on a blog. 
 *
 * @author misl (Minto van der Sluis)
 */
public class BlogMembership extends BraggerDomainObject {

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------

    // {{ Blog (property)
    private Blog blog;

    @MemberOrder(sequence = "1")
    public Blog getBlog() {
        return blog;
    }

    public void setBlog(final Blog blog) {
        this.blog = blog;
    }
    // }}

    // {{ User (property)
    private User user;

    @MemberOrder(sequence = "1")
    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }
    // }}

    // {{ Role (property)
    private BlogRole role;

    @MemberOrder(sequence = "1")
    public BlogRole getRole() {
        return role;
    }

    public void setRole(final BlogRole role) {
        this.role = role;
    }
    // }}

    // -----------------------------------------------------------------------
    // Actions
    // -----------------------------------------------------------------------
}
