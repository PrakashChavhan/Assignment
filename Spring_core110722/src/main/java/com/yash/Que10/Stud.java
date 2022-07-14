package com.yash.Que10;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Stud {
	  private Map<String,Integer> maps = new HashMap<String, Integer>();

	

	public Map<String, Integer> getMaps() {
		return maps;
	}



	public void setMaps(Map<String, Integer> maps) {
		this.maps = maps;
	}



	@Override
	public String toString() {
		return "Stud [maps=" + maps + "]";
	}
	  
public void show() {
	System.out.println(maps);
}



public void check() {
	
	Object names=maps.entrySet().stream()
            .max((obj1,obj2)-> obj1.getValue()>obj2.getValue()? 1:-1).get();
       	System.out.println("Maximum Marks:"+names);
       	System.out.println("Ascending Order:");
       	maps.entrySet().stream().map(e->e.getValue()).sorted().forEachOrdered(System.out::println);
       	System.out.println("Descending Order:");
    	maps.entrySet().stream().map(e->e.getValue()).sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
    	
}

}
