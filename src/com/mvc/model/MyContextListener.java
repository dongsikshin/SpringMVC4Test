package com.mvc.model;

import java.awt.image.renderable.ContextualRenderedImageFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//javaEE �� api �߿����� ���ϰ� ���� �������� �����ɶ�, Ȥ�� �ߴܵɶ��� �����ϴ�
//������ ��ü�� �ִ�...
public class MyContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("���� ���� �޲ۿ�??");	
		String path=e.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println(path);
	}
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// TODO Auto-generated method stub
		
	}


}
