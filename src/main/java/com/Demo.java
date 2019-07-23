package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("1", "2");
		map.put("12", "2");
		
		for(Map.Entry<String, String> entry :map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			  if(key.equals("1")) {
				  
				  map.put("13", "ddd1");
				  map.remove(key);
			  }
		}
		/*Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			  String key = iterator.next().getKey();
			  String value = map.get(key);
			  if(key.equals("1")) {
				  //iterator.remove();
				  map.remove(key);
				 
				  map.put("13", "ddd");
				  
				  //break;
				 
			  }
		}*/
		for(Map.Entry<String, String> entry :map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"--->"+value);
		}
	}
}
