package com.cooper.core.controller;

import com.cooper.core.bean.BeanB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BeanBController {

    private final BeanB beanB;

    @GetMapping("/bean-b")
    public String methodB() {
        return beanB.methodB();
    }

}
