package org.simplon.service;

import org.simplon.models.Post;

import java.util.ArrayList;
import java.util.List;

public abstract class PostService {

    private static List<Post> posts = new ArrayList<>();

    public static Post getById(String uuid){
        return posts.stream().filter((post)->post.getId().equals(uuid)).findFirst().orElse(null);
    }

    public static List<Post> getPosts() {
        return posts;
    }
    public static void addPost(Post post){
        posts.add(post);
    }

}
