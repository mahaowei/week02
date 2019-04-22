package com.zhangsan.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @作者:马豪伟NB
 * @时间:2019年4月22日
 */
public class WebUtil {

	@Test
	public void test1() {
		
	}
	
//	方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public boolean getString(HttpServletRequest request, String name, String defaultValue){
	    String url = request.getRequestURI();
	    if(!url.contains("name")) {
	    	request.setAttribute("name",defaultValue);
	    	return false;
	    }
	    request.setAttribute("name",name);
	    return true;
	}
	
	@Test
	public void test2() {
		
	}
	
//	方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request,int id,int defaultValue){
		String url = request.getRequestURI();
		String sub = url.substring(url.indexOf("="));
		String nsub = "";
		if(sub.contains("&")) {
			nsub = sub.substring(0,sub.indexOf("&"));
			String[] split = nsub.split("");
			for (int i = 0; i < nsub.length(); i++) {
				if(split[i].hashCode() < 48 && split[i].hashCode() > 57) {
					request.setAttribute("id",defaultValue);
		    		return defaultValue;
				}
			}
		}
		if(!url.contains("id")) {
	    	request.setAttribute("id",defaultValue);
	    	return defaultValue;
	    }
		return id;
	}
	
	@Test
	public void test3() {
		
	}
	
//	方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request,boolean flag){
		String url = request.getRequestURI();
	    if(!url.contains("flag"))
			return false;
	    return true;
	}
	
	@Test
	public void test4() {
		
	}
	
//	方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		return request.getRequestURI();
	}
	
	@Test
	public void test5() {
		
	}
	
//	方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(Cookie cookie){
		return cookie.getValue();
	}
	
}
