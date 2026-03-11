package org.simplon.models;

import java.util.Date;

public class Commentary extends Message{

    public Commentary(int id, String description, Date timestamp) {
        super(id, description, timestamp);
    }
    
}
