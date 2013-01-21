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
public class Post extends BraggerDomainObject {

    // {{ Title
    public String title() {
        return String.format("%s configuration", getBlog().getName() );
    }
    // }}

    // {{ iconName
    public String iconName() {
        return "blogConfig";
    }
    // }}

    // -----------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------

    // {{ Title (property)
    private String title;

    @MemberOrder(sequence = "1")
    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
    // }}

    // {{ Content (property)
    private String content;

    @MemberOrder(sequence = "1")
    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
    // }}

    // {{ Excerpt (property)
    private String excerpt;

    @MemberOrder(sequence = "1")
    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(final String excerpt) {
        this.excerpt = excerpt;
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

    // {{ CommentStatus (property)
    private CommentStatus commentStatus;

    @MemberOrder(sequence = "1")
    public CommentStatus getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(final CommentStatus commentStatus) {
        this.commentStatus = commentStatus;
    }
    // }}

    // {{ PostStatus (property)
    private PostStatus postStatus;

    @MemberOrder(sequence = "1")
    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(final PostStatus postStatus) {
        this.postStatus = postStatus;
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

    // {{ Comments (property)
    private List<Comment> comments;

    @MemberOrder(sequence = "1")
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(final List<Comment> comments) {
        this.comments = comments;
    }
    // }}

    // -----------------------------------------------------------------------
    // Actions
    // -----------------------------------------------------------------------
}
