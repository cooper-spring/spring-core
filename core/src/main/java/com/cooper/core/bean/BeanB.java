package com.cooper.core.bean;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanB {

    public String methodB() {
        return String.format("빈 클래스는 %s 입니다", BeanB.class.getName());
    }

}
