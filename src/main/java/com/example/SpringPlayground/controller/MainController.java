package com.example.SpringPlayground.controller;

import com.example.SpringPlayground.model.TestModel;
import com.example.SpringPlayground.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@Rest controller will include @ResponseBody annotation
@RequestMapping("test")
public class MainController {

    @Autowired
    @Qualifier("bean1")
    TestModel testBean;

    @Autowired
    MainService mainService;

    @GetMapping(path = "/{newValue}",produces = "application/json")
    public ResponseEntity<Integer> helloWorld(@PathVariable int newValue) {
        mainService.changeBeanValue(newValue);
        return ResponseEntity.ok(testBean.value);
    }
    @GetMapping(path = "/fib/{newValue}",produces = "application/json")
    public ResponseEntity<Integer> fibbonnacci(@PathVariable int newValue) {
        mainService.testFibLogicBean(newValue);
        return ResponseEntity.ok(1);
    }
}
