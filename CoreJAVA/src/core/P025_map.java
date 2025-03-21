package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P025_map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");
		map.put("java", "java");
		map.put(34.3, "c++");
		map.put(false,456567);
		map.put('r', "php");
		map.put(1, "dart");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
