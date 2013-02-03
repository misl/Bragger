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

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;

@Named("Blogs")
public class Blogs extends AbstractFactoryAndRepository {

    // {{ Id, iconName
    @Override
    public String getId() {
        return "blogs";
    }

    public String iconName() {
        return "blogs";
    }

    // }}

    // {{ newBlog (action)
    public Blog newBlog(@Named("Name") String name, @Named("Description") String description) {
        final Blog blog = newTransientInstance(Blog.class);
        blog.setName(name);
        blog.setDescription(description);
        persist(blog);
        return blog;
    }

    // }}

    // {{ deleteBlog (action)
    @MemberOrder(sequence = "1")
    public void deleteBlog(final Blog blog) {
        remove(blog);
    }

    // }}

    // {{ countblogs (action)
    @MemberOrder(sequence = "1")
    public int countBlogs() {
        return allInstances(Blog.class).size();
    }

    // }}

    // {{ findByName (action)
    @MemberOrder(sequence = "1")
    public Blog findByName(final String name) {
        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        Blog blog = new Blog();
        blog.setName(name);
        List<Blog> blogs = allMatches(Blog.class, blog);
        if (blogs.isEmpty()) {
            blog = null;
        } else {
            blog = blogs.get(0);
        }
        return blog;
    }
    // }}
}
