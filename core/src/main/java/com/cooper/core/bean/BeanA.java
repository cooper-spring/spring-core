package com.cooper.core.bean;

public class BeanA {

    public String methodA() {
        return String.format("빈 이름은 %s 입니다", BeanA.class.getName());
    }

}
