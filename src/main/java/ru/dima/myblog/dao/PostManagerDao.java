package ru.dima.myblog.dao;

import ru.dima.myblog.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostManagerDao {

    List<Post> findAll();

    Optional<Post> findById(long id);

    long create(Post post);

    void update(long id, Post updatedPost);

    void deleteById(long id);

    List<Post> findByTag(String tag);
}
