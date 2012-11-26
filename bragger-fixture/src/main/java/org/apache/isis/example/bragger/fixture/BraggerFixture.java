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

package org.apache.isis.example.bragger.fixture;

import org.apache.isis.applib.fixtures.AbstractFixture;
import org.apache.isis.applib.value.Date;
import org.apache.isis.example.bragger.dom.Brag;
import org.apache.isis.example.bragger.dom.Tag;
import org.apache.isis.example.bragger.dom.User;

public class BraggerFixture extends AbstractFixture {

    @Override
    public void install() {
        final User fred = createUser("Fred Smith", "fred.smith@example.com" , "secret");
        final User tom = createUser("Tom Brown", "tom.brown@example.com", "geheim");
        createUser("Sam Jones", "sam.jones@example.com", "myaccesscode");
        
        final Tag fish = createTag("fish");
        final Tag burger = createTag("burger");
        final Tag biggest = createTag("biggest");
        final Tag most = createTag("most");
        createTag("longest");

        Brag brag = createBrag(tom, "Gonne fishing", "I have been fishing and did not only catch the most fish ever, but also the largest one.");
        brag.addToTags(fish);
        brag.addToTags(most);
        brag.addToTags(biggest);
        brag.addComment("Sam Jones", "sam.jones@example.com", "You're kidding.");
        brag.addComment("Bill Green", "bill.green@example.com", "Can't be true.");

        brag = createBrag(tom, "Barbeque", "On my summer evening barbeque I cooked the biggest burger ever.");
        brag.addToTags(burger);
        brag.addToTags(biggest);
        brag.addComment("Angela Baker", "sam.jones@example.com", "Pfffft, men!");
        brag.addComment("Sam Jones", "bill.green@example.com", "Sure, what size was it?");
        brag.addComment("Tom Brown", "sam.jones@example.com", "Why wasn't I invited?");

        brag = createBrag(fred, "Exam", "On my latest exam I not only had the best score but I was also first to finish the test.");
    }

    private User createUser(final String username, final String email, final String password) {
        User user;
        user = newTransientInstance(User.class);
        user.setDateCreated(new Date());
        user.setEmail(email);
        user.setPassword(password);
        persist(user);
        return user;
    }

    private Tag createTag(final String name) {
        Tag tag;
        tag = newTransientInstance(Tag.class);
        tag.setDateCreated(new Date());
        tag.setName(name);
        persist(tag);
        return tag;
    }

    private Brag createBrag(final User author, final String title, final String content) {
        Brag brag;
        brag = newTransientInstance(Brag.class);
        brag.setDateCreated(new Date());
        brag.setAuthor(author);
        brag.setTitle(title);
        brag.setContent(content);
        persist(brag);
        return brag;
    }
}
