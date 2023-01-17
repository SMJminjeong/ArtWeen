package com.art.artween.domain.posts;

import com.art.artween.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
// 테이블과 링크될 클래스를 나타냄
@Entity
public class Posts extends BaseTimeEntity {
    //해당 테이블의 PK 필드
    @Id
    //PK 생성 규칙 ( GenerationType.IDENTITY = auto_increment )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
