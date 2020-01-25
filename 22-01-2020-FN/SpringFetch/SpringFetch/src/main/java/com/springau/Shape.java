package com.springau;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springau.config.AppConfig;
import com.springau.model.Point;

public class Shape {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Point t = context.getBean(Point.class);
		t.draw();
	}
}
