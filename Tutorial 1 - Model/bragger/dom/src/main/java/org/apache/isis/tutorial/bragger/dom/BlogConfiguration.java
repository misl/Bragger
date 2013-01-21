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
 * Domain class representing the configuration for a particular blog.
 *
 * @author misl (Minto van der Sluis)
 */
public class BlogConfiguration extends BraggerDomainObject {

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------

    // {{ AllowComments (property)
    private Boolean allowComments;

    @MemberOrder(sequence = "1")
    public Boolean getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(final Boolean allowComments) {
        this.allowComments = allowComments;
    }
    // }}

    // {{ AllowPingbacks (property)
    private Boolean allowPingbacks;

    @MemberOrder(sequence = "1")
    public Boolean getAllowPingbacks() {
        return allowPingbacks;
    }

    public void setAllowPingbacks(final Boolean allowPingbacks) {
        this.allowPingbacks = allowPingbacks;
    }
    // }}

    // {{ AllowTrackbacks (property)
    private Boolean allowTrackbacks;

    @MemberOrder(sequence = "1")
    public Boolean getAllowTrackbacks() {
        return allowTrackbacks;
    }

    public void setAllowTrackbacks(final Boolean allowTrackbacks) {
        this.allowTrackbacks = allowTrackbacks;
    }
    // }}

    // {{ PostsOnFrontPage (property)
    private Integer postsOnFrontPage;

    @MemberOrder(sequence = "1")
    public Integer getPostsOnFrontPage() {
        return postsOnFrontPage;
    }

    public void setPostsOnFrontPage(final Integer postsOnFrontPage) {
        this.postsOnFrontPage = postsOnFrontPage;
    }
    // }}

    // {{ Theme (property)
    private String theme;

    @MemberOrder(sequence = "1")
    public String getTheme() {
        return theme;
    }

    public void setTheme(final String theme) {
        this.theme = theme;
    }
    // }}
    
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

    // -----------------------------------------------------------------------
    // Actions
    // -----------------------------------------------------------------------
}
