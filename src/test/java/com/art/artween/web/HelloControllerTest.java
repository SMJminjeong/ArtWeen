package com.art.artween.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// Spring Boot test 와 JUnit 연결자 역할
//JUnit 내장된 실행자 외에 다른 실행자 실행
@RunWith(SpringRunner.class)
// @Controller, @ControllerAdvice 과 같은 컨트롤러만 사용 가능
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired // bean 주입
    // 웹 API 테스트시 사용
    private MockMvc mvc;

    @Test
    public void hello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // "/hello" 주소로 GET 요청
                .andExpect(status().isOk()) // mvc.perform 의 결과 검증
                .andExpect(content().string(hello)); // 응답본문 내용 검증
    }


}

