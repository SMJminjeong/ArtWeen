package com.art.artween.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Posts 클래스로 Database를 접근하게 해줄 JpaRepository 생성
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
