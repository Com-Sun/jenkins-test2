package com.example.jenkinstest2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTest2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testMethod() {
        String test = "test";
        assertThat(test).isEqualTo("test");
    }
}
