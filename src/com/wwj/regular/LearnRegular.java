package com.wwj.regular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegular {

	public static void main(String[] args) {
		
		
//		checkoutPhone();
//		
//		checkoutQQ();
		
//		strSplit();
//		
//		strReplace();
//	
//		strRegex();
//		
//		strRegexGet();
		
//		strKouChi();
//		
//		strPhoneHide();
//		
//		checkoutEmail();
		
		spiders();
		
	}
	
	

	/**
	 * 网页爬虫
	 * 把所有的电子邮件弄过了
	 * 输入指定规则,满足规则,放到容器中
	 */
	private static void spiders() {
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		File file=new File("C:\\Users\\Administrator\\Desktop\\(3封未读) 网易邮箱6.0版.html");
		BufferedReader bufferedReader = null;
		try {
			bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String content=null;
			while(null!=(content=bufferedReader.readLine())){
				
//				[a-zA-Z_0-9]
				String regex="\\w+@\\w+(\\.\\w+)+";  // 1@1.1
				Pattern pattern=Pattern.compile(regex);
				Matcher matcher=pattern.matcher(content);
				while(matcher.find()){
					System.out.println(matcher.group());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(null!=bufferedReader){
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}



	private static void checkoutEmail() {
		
		String eamil="wwj_computeryes@163.com";
		//wwj@sina.com.kj
		
//		[a-zA-Z_0-9]
		String regex="\\w+@\\w+(\\.\\w+)+";  
		
		boolean b=eamil.matches(regex);
		if(b){
			System.out.println("====输入的电子邮件正确======");
		}else{
			System.out.println("======输入的电子邮件错误==========");
		}
		
	}



	private static void strPhoneHide() {
		String phoneHide="15194638329" ;  // 151****8329
		
		String regex="(\\d{3})\\d{4}(\\d{4})";
		
		phoneHide=phoneHide.replaceAll(regex, "$1****$2");
		System.out.println("====你看不见我吧====="+phoneHide);
		
	}



	/**
	 * 治疗口吃
	 */
	private static void strKouChi() {
		String str="我我我我我我....想想想想想想想......出出出出..去去去去去....玩玩玩玩玩玩玩...";
		
		String regex="\\.+";
		str=str.replaceAll(regex, "");
		
		regex="(.)\\1+";
		str=str.replaceAll(regex, "$1");
		
		System.out.println("========"+str);
		
	}



	/**
	 * 正则表达式获取
	 */
	private static void strRegexGet() {
		String str="jin tian tian bu cuo,ming tian hui geng hao!";
		String regex="\\b[a-z]{3}\\b";
		
		//1 获取正则表达式对象
		Pattern pattern=Pattern.compile(regex);
		
		//2 获取匹配器对象
		Matcher matcher=pattern.matcher(str);
		
		while(matcher.find()){
			System.out.println("===找到了=="+matcher.group());
		}
		
		
	}


	private static void strRegex() {
		//创建正则表达式对象
		Pattern p = Pattern.compile("a*b");
		
		//创建匹配器对象
		Matcher m = p.matcher("aaaaab");
		
		//通过匹配器去匹配
		boolean b = m.matches();
		System.out.println("strRegex=="+b);
	}



	/**
	 * 字符串替换
	 */
	private static void strReplace() {
//		String str="how";
//		str=str.replace("how", "he");
//		System.out.println(str);
		
		String str="zhangsanttttttlisissssswangwu";
		str=str.replaceAll("(.)\\1+", "#");
		System.out.println(str);
		
	}

	/**
	 * 字符串拆分
	 */
	private static void strSplit() {
		
//		String str="zhangsan      lisi     wangwu";
//		String[] nameStr=str.split(" +");
		
//		String str="zhangsan.lisi.wangwu";
//		String[] nameStr=str.split("\\.");
		
		String str="zhangsanttttttlisissssswangwu";
		String[] nameStr=str.split("(.)\\1+");
		for(int n=0;n<nameStr.length;n++){
			System.out.println(nameStr[n]);
		}
		
	}

	/**
	 * 正则表达式的匹配
	 * 验证QQ是否合法
	 * 长度5-15
	 * 1 不是0  
	 */
	private static void checkoutQQ() {
		String qq="13423";
		
		String regex="[1-9][0-9]{4,14}";
		boolean b=qq.matches(regex);
		if(b){
			System.out.println("=====QQ号输入正确=====");
		}else{
			System.out.println("============QQ号输入错误======");
		}
		
	}


	private static void checkoutPhone() {
		
		
		/**
		 * 正则表达式的匹配
		 * 验证电话号码是否正确
		 * 第一个数字必须是1,长度11位,第二位必须是358
		 */
		String phone="15584538443";
		
		String  regex="[1][358][0-9]{9}";
		
		
		boolean b=phone.matches(regex);
		if(b){
			System.out.println("=====电话号码合法======"+phone.length());
		}else{
			System.out.println("===========输入的电话号码错误=========="+phone.length());
		}
		
	}

}
