package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P024_Set {
	public static void main(String[] args) {
		Set set  = new HashSet();
		set.add(1);
		set.add("java");
		set.add(45.45);
		set.add(false);
		set.add(3446576);
		set.add('t');
		set.add(1);
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
