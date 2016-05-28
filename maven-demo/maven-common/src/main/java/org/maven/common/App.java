package org.maven.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=0; i<10000; i++) {
			if(i<10)
				list.add(("000"+i));
			else if(i>=10 && i<100) 
				list.add(("00"+i));
			else if(i>=100 && i<1000) 
				list.add(("0"+i));
			else if(i>=1000) 
				list.add(i+"");
		}
		print(list);
		
		List<String> list1 = new ArrayList<>();
		list1 = list.subList(1, 4);
		print(list1);
		
		list.removeAll(list1);
		print(list);
		
	}
	
	public static void print(List<String> list) {
		int i = 0;
		for(String s:list) {
			System.out.print(s+" ");
			if(i%20 ==0)
				System.out.println();
			i++;
		}
		System.out.println();
	}
}
