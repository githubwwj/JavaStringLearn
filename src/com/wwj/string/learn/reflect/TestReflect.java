package com.wwj.string.learn.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflect {

	public static void main(String[] args) {
		
//		testReflect();
		try {
			File file=new File("reflat.property");
			if(!file.exists()){
				System.out.println("========文件不存在=====");
				return ;
			}
			FileInputStream fileInputStream=new FileInputStream(file);
			
			Properties properties=new Properties();
			properties.load(fileInputStream);
			
			Class clazz=Class.forName(properties.getProperty("stu"));
			Constructor constructor=clazz.getDeclaredConstructor();
			Object obj=constructor.newInstance();
			
			
			System.out.println("====obj="+obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	private static void testReflect() {
		try {
			
			Class clazz=Class.forName("com.wwj.string.learn.reflect.Person");
			System.out.println(clazz);
			
			Constructor[] conArr=clazz.getConstructors();
			for(int i=0;i<conArr.length;i++){
				System.out.println(conArr[i]);
			}
			
//			Constructor person=clazz.getConstructor(String.class,int.class);  //只能获取public构造函数
			Constructor person=clazz.getDeclaredConstructor(String.class,int.class);
			
			person.setAccessible(true);   //可以访问私有构造函数
			Person per=(Person) person.newInstance("wwj",24);
			
			
			Field[] fieldArr=clazz.getDeclaredFields();  //获取所有字段/属性 ,无论私有还是共有
			
			clazz.getFields();  //只能获取共有属性
			
			Field statusField=clazz.getField("status");
			statusField.set(per, "有点失落,但是一切都会好的");
			System.out.println("========statusField==="+statusField);
			
			
			for(int f=0;f<fieldArr.length;f++){
				System.out.println(fieldArr[f]);
			}
			
			
			System.out.println(per.getName()+"===run="+per.getAge()+"========"+per.getStatus());
			
			Method[] methodArr=clazz.getMethods(); 
			for(int m=0;m<methodArr.length;m++){
				System.out.println(methodArr[m]);
			}
			
			Method nameMeth=clazz.getMethod("setName", String.class);
			nameMeth.invoke(per, "bob");
			System.out.println("====nameMeth="+nameMeth+"==name="+per.getName());
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
