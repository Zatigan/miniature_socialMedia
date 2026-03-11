package org.simplon.models;

import java.util.Date;
import java.util.List;

public class Post extends Message {
    private int like;
    private List<Commentary> commentaires;

    public Post(int id, String description, Date timestamp, User creator) {
        super(id, description, timestamp, creator);
    }

    public Post(int id, String description, Date timestamp, User creator, int like, List<Commentary> commentaires) {
        super(id, description, timestamp, creator);
        this.like = like;
        this.commentaires = commentaires;
    }

    public String getCreatorName(){
        return this.getCreator().getPseudo();
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<Commentary> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentary> commentaires) {
        this.commentaires = commentaires;
    }

}
