package com.baar.mavenGithubArtifactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MavenGithubArtifactoryApplication {
    @GetMapping("/")
    public String hello() {
        return "Hellow world";
    }

    public static void main(String[] args) {
        SpringApplication.run(MavenGithubArtifactoryApplication.class, args);
    }

}
