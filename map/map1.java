package map;
import java.util.*;
public class map1 {
	public static void main(String[] args) {
		HashMap<String,String> map =new HashMap<>();
		map.put("myname", "actor");
		map.put("actor","John");
		map.put("name", "actor");
		map.put("actor", "deep");
		System.out.println(map);
		System.out.println(map.getClass());
		System.out.println(map.get("actor"));
		System.out.println(map.containsKey("actor"));
		Set <String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		Collection<String> key2=map.values();
		for (String value:key2) {
			System.out.println(map.get(value)+" "+value);
		}
		}
	}
}
