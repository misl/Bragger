package org.apache.isis.tutorial.bragger.dom;

public enum CommentStatus {

    OPEN("open"), CLOSED("closed");

    private String commentStatus;

    CommentStatus(String s) {
        this.commentStatus = s;
    }
}
