package ru.oneicon.oneicon_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.repository.CategoryRepository;

import java.util.List;

@SpringBootApplication
public class OneIconBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneIconBackendApplication.class, args);
    }

}
