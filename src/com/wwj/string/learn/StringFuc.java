package com.wwj.string.learn;


public class StringFuc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
//		strFunOne();
		
		strFunTwo();
		
	}

	private static void strFunTwo() {
		
		String str="   hello    world    ";
		str=str.toUpperCase();
		System.out.println("字符串转换大写="+str);
		
		str=str.toLowerCase();
		System.out.println("字符串转换小写="+str);
		
		str=str.trim();
		System.out.println("截取首尾两端空白="+str);
		
		str="bob,lili,mike,jeney";
		
		str=str.replace("mike", "Autumn");
		String[] arrStr=str.split(",");
		
		for(int i=0;i<arrStr.length;i++){
			System.out.println(arrStr[i]);
		}
		
		
		str="Abc";
		byte[] byteStr=str.getBytes();
		for(byte b=0;b<byteStr.length;b++){
			System.out.println("byte="+byteStr[b]);
		}
		
		boolean contains=str.contains("A");
		System.out.println("===包含="+contains);
		
		str="Abc";
		str=str+"efg"+"world";
		System.out.println(str);
		
		str="Abc";
		str=str.concat("efg").concat("world");
		System.out.println(str);
		
//		Abcef   Abc
		str="Abce"; //e=101-97=4
		int compare=str.compareTo("Abca");
		System.out.println("===字符串比较="+compare);
		
		byte[] byteArr={97,98,99,100};
		//			String arr = new String(byteArr,"utf-8");
		//			String arr = new String(byteArr,"gbk");
		//			String arr = new String(byteArr,"gb2312");
					String arr = new String(byteArr,1,3);
					System.out.println("====arr="+arr);
		
		System.out.println("截取出首尾两端的空格="+trimStr());
		
	}
	
	/**
	 * 截取出首尾两端的空格
	 * -
	 * 
	 */
	
	public static String trimStr(){
		String str="   ab   c  ";
		int head=0;
		int tail=0;
		
		char[] chArr=str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			if(chArr[i]!=' '){
				break;
			}
			head++;
		}
		
		for (int i = chArr.length-1; i>0; i--) {
			if(chArr[i]!=' '){
				break;
			}
			tail++;
		}
		tail=str.length()-tail;
		
		if(tail<head){
			tail=head;
		}
		
		System.out.println("===head="+head+"====tail="+tail);
		
		str=str.substring(head, tail);
		return str;
		
	}
	
	

	private static void strFunOne() {
		String str="java jdk 在线文档";
		
		System.out.println("字符串长度==="+str.length());
		
		System.out.println("字符串搜索==="+str.indexOf("jdk"));
		
		System.out.println("字符串截取==="+str.substring(5, 8));
		
		System.out.println("通过索引获取一个字符===="+str.charAt(7));
		
		System.out.println("一个整串中子串出现的次数==="+findChildStrCount());		
	}	
	
	
	/**
	 * 获取一个整串中子串出现的次数
	 * batsdflkbatllwrdfhbat  整串
	 * bat 				   子串
	 * 
	 * 计数器
	 * 搜索功能
	 * 找到返回出现次数
	 * 没有找到返回0
	 */
	public static int findChildStrCount(){
		int count=0; //字符串出现的次数
		String str="batsdflkbatllwrdfhbat";
		String childStr="s";
		int len=0;
		while((len=str.indexOf(childStr, len))!=-1){
			len=len+childStr.length();
			count++;
		}
		return count;
	}
	

}
