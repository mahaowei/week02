package com.zhangsan.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * @作者:马豪伟NB
 * @时间:2019年4月22日
 */
public class CollectionUtil {

	@Test
	public void test1() {
		Collection<Object> l = new ArrayList<>();
		l.add("454");
		l.add("454");
		System.out.println(notEmpty(l));
		Collection<Object> se = new HashSet<>();
		se.add("45");
		se.add("45");
		System.out.println(notEmpty(se));
	}
	
//	方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Collection<Object> co){
	    if(null == co || co.contains(null))
	    	return false;
	    return true;
	}
	
	@Test
	public void test2() {
		Map<Object, Object> hm = new HashMap<>();
		hm.put(null,"4546");
//		hm = null;
		System.out.println(notEmpty(hm));
	}
	
//	方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<Object,Object> ma){
		if(null == ma)
	    	return false;
	    for(Object o : ma.keySet()) {
	    	if(null == o || null == ma.get(o))
	    		return false;
	    }
		return true;
	}
	
}
