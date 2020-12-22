package org.example.controller.dto;

import lombok.Getter;
import org.example.domain.posts.Posts;

import java.io.Serializable;

@Getter
public class PostsResponseDto implements Serializable {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

    /*
    public PostsResponseDto(Posts entity)
    - Posts 객체를 파라미터로 받아 생성자 역할을 수행한다.
     */
}