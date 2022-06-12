package com.cooper.core.controller;

import com.cooper.core.bean.BeanA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BeanAController {

    private final BeanA beanA;

    @GetMapping("/bean-a")
    public String methodA() {
        return beanA.methodA();
    }

}
