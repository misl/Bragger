package org.apache.isis.tutorial.bragger.dom;

public enum BlogRole {

    READ_ONLY("readonly", 0), COMMENTER("commenter", 1), AUTHOR("author", 2), EDITOR("editor", 3), BLOG_ADMIN("blogadmin", 4);

    private String name;
    private int level;

    BlogRole(String blogRole, int level) {
        this.name = blogRole;
        this.level = level;
    }

    public boolean implies(BlogRole role) {
        return role.level <= this.level;
    }

    public String getName() {
        return name;
    }
}
