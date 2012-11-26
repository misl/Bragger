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

package org.apache.isis.example.bragger.objstore.jdo;

import java.util.List;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.value.Date;
import org.apache.isis.example.bragger.dom.Brag;
import org.apache.isis.example.bragger.dom.BragRepository;
import org.apache.isis.example.bragger.dom.User;

public class BragRepositoryDefault extends AbstractFactoryAndRepository implements BragRepository {

    // {{ Id, iconName
    @Override
    public String getId() {
        return "brags";
    }

    public String iconName() {
        return "bragRepository";
    }
    // }}

    // {{ action: bragsByUser
    @Override
    public List<Brag> bragsByUser(@Named("Author") User author) {
        // return allMatches(Brag.class, null); // TODO
        return null;
    }
    // }}

    // {{ action: newClaim
    @Override
    @MemberOrder(sequence = "5")
    public Brag newBrag(@Named("Title") String title, @Named("Content") String content) {
        final Brag brag = newTransientInstance(Brag.class);
        brag.setDateCreated(new Date());
        brag.setTitle(title);
        brag.setContent(content);
        // brag.setAuthor(author);   // TODO
        return brag;
    }
    // }}
}
