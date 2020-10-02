package com.example.SpringPlayground.service;

import com.example.SpringPlayground.common.LogicLibrary;
import com.example.SpringPlayground.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainService {
    @Autowired
    @Qualifier("bean1")
    TestModel testName;

    @Autowired
    LogicLibrary logicLibrary;
    public void changeBeanValue(int newValue) {
        testName.value = newValue;
    }

    public void testFibLogicBean(int num) {
        System.out.println(logicLibrary.fibonnacci(num));
    }
}
