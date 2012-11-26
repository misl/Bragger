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

import java.util.ArrayList;
import java.util.List;

import org.apache.isis.applib.AbstractDomainObject;
import org.apache.isis.applib.annotation.Hidden;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.value.Date;

/**
 * Domain class for indiviual brags.
 * 
 * @author misl (Minto van der Sluis)
 */
public class Brag extends AbstractDomainObject {

    // {{ Title
    public String title() {
        return getTitle();
    }
    // }}
    
    // {{ iconName
    public String iconName() {
        return "Brag";
    }
    // }}

    // {{ dateCreated
    private Date dateCreated;

    @MemberOrder(sequence = "1")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    // }}

    // {{ title
    private String title;

    @MemberOrder(sequence = "2")
    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
    // }}

    // {{ content
    private String content;

    @MemberOrder(sequence = "3")
    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
    // }}

    // {{ author
    private User author;

    @MemberOrder(sequence = "4")
    @Hidden
    public User getAuthor() {
        return author;
    }

    public void setAuthor(final User author) {
        this.author = author;
    }
    // }}

    // {{ Tags
    private final List<Tag> tags = new ArrayList<Tag>();

    @MemberOrder(sequence = "5")
    public List<Tag> getTags() {
        return tags;
    }

    public void addToTags(final Tag tag) {
        tags.add(tag);
    }

    public void removeFromTags(final Tag tag) {
        tags.remove(tag);
    }
    // }}

    // {{ Comments
    private final List<Comment> comments = new ArrayList<Comment>();

    @MemberOrder(sequence = "6")
    public List<Comment> getComments() {
        return comments;
    }

    public void addToComments(final Comment comment) {
        comments.add(comment);
    }

    public void removeFromComments(final Comment comment) {
        comments.remove(comment);
    }
    // }}

    // {{ action: addComment
    @MemberOrder(sequence = "1")
    public void addComment(@Named("Name") final String author, @Named("Email") final String email, @Named("Comment") final String content) {
        final Comment comment = newTransientInstance(Comment.class);
        Date date = new Date();
        comment.setDateCreated(date);
        comment.setName(author);
        comment.setEmail(email);
        comment.setContent(content);
        persist(comment);
        addToComments(comment);
    }
    // }}
}
