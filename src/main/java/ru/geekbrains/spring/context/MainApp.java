package ru.geekbrains.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        System.out.println(productRepository.getProducts());
        System.out.println();
        System.out.println(productRepository.getProductById(2));
        context.close();
    }
}
