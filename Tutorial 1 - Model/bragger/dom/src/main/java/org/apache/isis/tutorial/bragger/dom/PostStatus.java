package org.apache.isis.tutorial.bragger.dom;

public enum PostStatus {

    PUBLISHED("published"), DRAFT("draft"), PRIVATE("private"), DELAYED("delayed");

    private String postStatus;

    PostStatus(String s) {
        this.postStatus = s;
    }
}
