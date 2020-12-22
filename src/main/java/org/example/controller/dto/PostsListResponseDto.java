package org.example.controller.dto;

import lombok.Getter;
import org.example.domain.posts.Posts;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
}