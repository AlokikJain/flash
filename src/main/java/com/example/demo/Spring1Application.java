package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(res);
		HelloWorldService hello=(HelloWorldService)bean.getBean("helloWorldService");
		hello.sayHello();
	}

}
