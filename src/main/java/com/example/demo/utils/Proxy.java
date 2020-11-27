package com.example.demo.utils;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component("px")
public class Proxy {
    public void print(String t) {
        Consumer<String> f = System.out::println;
        f.accept(t);
    }

    public Boolean equals(String t, String u) {
        BiPredicate<String, String> f = String::equals;
        return f.test(t, u);
    }
}
