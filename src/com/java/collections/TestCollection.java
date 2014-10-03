package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollection {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Selenium");
		list.add("QTp");
		list.add("Jmeter");
//		list.get(1);
//		for(String str:list)
//		{
//			System.out.println(str);
//		}
		list.add("soap UI");
		for(Iterator<String> iterator=list.iterator();iterator.hasNext();)
		{			
			System.out.println(iterator.next());
		}
		
		//difference b/w list and set is that set can have only unique elements.
		Set<String>set=new HashSet<String>();
		set.add("Selenium");
		set.add("Selenium");
		set.add("qtp");
		set.add("jmeter");
		for(Iterator<String>iterator=set.iterator();iterator.hasNext();)
		{
			System.out.println("set only contains unique elements");
			System.out.println(iterator.next());
		}
		//defines key value pair-Hash Map
		Map<String,String> map=new HashMap<String,String>();
		map.put("key", "value");
		map.put("Selenium","automation tool");
		map.put("Jmeter", "Performance test tool");
		
		for(String key:map.keySet())//key set returns unique vales of key
		{
			System.out.println("from maps");
			System.out.println(map.get(key));
		}
		
		
	}

}
