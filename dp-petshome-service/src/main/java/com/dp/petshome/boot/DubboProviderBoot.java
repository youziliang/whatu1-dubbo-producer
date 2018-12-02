package com.dp.petshome.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description Dubbo启动类
 * @author DU
 */
public class DubboProviderBoot {
	
	/**
	 * @Attention 使用之前请开启数据库
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath*:spring/applicationContext.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
