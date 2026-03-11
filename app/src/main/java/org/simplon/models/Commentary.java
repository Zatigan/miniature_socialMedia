package org.simplon.models;

import java.util.Date;

public class Commentary extends Message{

    public Commentary(String description, Date timestamp, User creator) {
        super(description, timestamp, creator);
    }
    
}
