package com.example.SpringPlayground.common;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class LogicLibrary {
    public int fibonnacci(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return fibonnacci(num-1) + fibonnacci(num-2);
    }
}
