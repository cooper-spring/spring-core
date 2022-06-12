package com.cooper.core.config;

import com.cooper.core.bean.BeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        /*
         * - default 로는 프로젝트 전체를 스캔하기 때문에 프로젝트 스케일이 커질수록 어플리케이션 로딩 속도가 늦어진다.
         * - 그러므로 basePackages 를 통해 탐색 범위를 지정해서 워하는 범위에서만 빈을 탐색할 수 있도록 옵션을 추가할 수 있다.
         */
        basePackages = {"com.cooper.core.bean", "com.cooper.core.config"},

        /*
         * - includeFilters: 특정 조건을 만족하는 클래스만을 스캔하도록 지정한다
         * - excludeFilters: 특정 조건을 만족하는 클래스만을 스캔을 제외하겠다.
         *
         * @Animal annotation 을 탐색해서 빈으로 등록하는 필터 옵션 등록하는 것도 가능하다.
         *
        */
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = com.cooper.core.bean.animal.Animal.class
                )
        }
)
public class BeansConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

}
