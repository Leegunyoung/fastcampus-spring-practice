package org.example;

import org.example.config.Config;
import org.example.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));
    }
}