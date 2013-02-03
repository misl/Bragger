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
import org.joda.time.DateTime;

@Named("Users")
public class Users extends AbstractFactoryAndRepository {

    // {{ Id, iconName
    @Override
    public String getId() {
        return "users";
    }

    public String iconName() {
        return "users";
    }
    // }}

    // {{ newUser (action)
    public User newUser(@Named("Firstname") String firstName, @Named("Lastname") String lastName, @Named("E-mail") String email, @Named("Password") String password) {
        final User user = newTransientInstance(User.class);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setDateCreated(DateTime.now());
        persist(user);
        return user;
    }
    // }}
    
    // {{ deleteUser (action)
    @MemberOrder(sequence = "1")
    public void deleteUser(final User user) {
        remove( user );
    }
    // }}

    // {{ countUsers (action)
    @MemberOrder(sequence = "1")
    public int countUsers() {
        return allInstances(User.class).size();
    }
    // }}

    // {{ findUserByEmail (action)
    @MemberOrder(sequence = "1")
    public User findUserByEmail(final String email) {
        if (email == null || email.trim().isEmpty()) {
            return null;
        }
        User user = new User();
        user.setEmail( email );
        List<User> users = allMatches(User.class, user);
        if ( users.isEmpty() ) {
            user = null;
        } else {
            user = users.get(0);
        }
        return user;
    }
    // }}
}
