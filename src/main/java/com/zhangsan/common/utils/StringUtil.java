package com.zhangsan.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @作者:马豪伟NB
 * @时间:2019年4月22日
 */
public class StringUtil {

	@Test
	public void test1() {
		System.out.println("方法一："+hasLength(""));
	}
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值
	public boolean hasLength(String src) {
		if(src.length() == 0 || src.equals(""))
			return false;
		return true;
	}
	
	@Test
	public void test2() {
		System.out.println("方法二："+hasText(""));
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public boolean hasText(String src){
		if(src.length() == 0 || src.trim().length() == 0)
			return false;
		return true;
	}
	
	@Test
	public void test3() {
		System.out.println("方法三："+isMobile("10111111111"));
	}
	
	//方法3：判断是否为手机号码
	public boolean isMobile(String src){
		if(null == src || src.length() == 0 || src.length() != 11)
			return false;
		String[] split = src.split("");
		if(split[0].hashCode() != 49 || split[1].hashCode() == 48)
			return false;
		for (int i = 0; i < src.length(); i++) {
			if(split[i].hashCode() < 48 || split[i].hashCode() > 57)
				return false;
		}
		return true;
	}
	
	@Test
	public void test4() {
		System.out.println("方法四："+isEmail("dasda@da*s.com"));
	}
	
	//方法4：判断是否为邮箱
	public boolean isEmail(String src){
		if(!src.contains("@") || !src.endsWith(".com"))
			return false;
		String sub = src.substring(src.indexOf("@")+1,src.indexOf("."));
		String[] split = sub.split("");
		for (int i = 0; i < sub.length(); i++) {
			if(!(split[i].hashCode() >= 48 && split[i].hashCode() <= 57))
				return false;
			if(!(split[i].hashCode() >= 65 && split[i].hashCode() <= 90))
				return false;
			if(!(split[i].hashCode() >= 97 && split[i].hashCode() <= 122))
				return false;
		}
		return true;
	}
	
	@Test
	public void test5() {
		System.out.println("方法五："+reverse("dasda@da*s.com"));
	}
	
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba”
	public String reverse(String src){
		if(null == src || src.length() == 0 || src.trim().length() == 0)
			return "字符串为空，无法反转";
		return StringUtils.reverse(src);
	}
	
}
