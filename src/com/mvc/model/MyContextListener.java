package com.mvc.model;

import java.awt.image.renderable.ContextualRenderedImageFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//javaEE 의 api 중에서는 톰켓과 같은 웹서버가 가동될때, 혹은 중단될때를 감지하는
//리스너 객체가 있다...
public class MyContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("톰켓 가동 햇꾼요??");	
		String path=e.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println(path);
	}
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// TODO Auto-generated method stub
		
	}


}
