package com.cybage.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybage.model.TextEditor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	TextEditor textEditor=(TextEditor) ctx.getBean("textEditor");
    	System.out.println(textEditor);
    	
    	((ClassPathXmlApplicationContext) ctx).close();
    }
}
