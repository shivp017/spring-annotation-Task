package com.stackroute.domain;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeabLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After property set method");
    }

    public  void custInit() {
        System.out.println("Custom init method");
    }

    public void customDestroy() {
        System.out.println("Custom destroy method");
    }
}
