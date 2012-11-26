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

package org.apache.isis.example.bragger.objstore.dflt;

import java.util.List;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.value.Date;
import org.apache.isis.example.bragger.dom.Tag;
import org.apache.isis.example.bragger.dom.TagRepository;

public class TagRepositoryDefault extends AbstractFactoryAndRepository implements TagRepository {

    // {{ Id, iconName
    @Override
    public String getId() {
        return "tags";
    }

    public String iconName() {
        return "TagRepository";
    }
    // }}

    // {{ action: allTags
    @Override
    public List<Tag> allTags() {
        return allInstances(Tag.class);
    }
    // }}

    // {{ action: findTag
    @Override
    public List<Tag> findTag(@Named("Name") String name) {
        return allMatches(Tag.class, name);
    }
    // }}

    // {{ action: newClaim
    @Override
    @MemberOrder(sequence = "5")
    public Tag newTag(@Named("Name") String name) {
        final Tag tag = newTransientInstance(Tag.class);
        tag.setDateCreated(new Date());
        tag.setName(name);
        return tag;
    }
    // }}
}
