import java.util.Map.Entry;

public class HashMap {

	
	static java.util.HashMap<String, Boolean> map = new java.util.HashMap<>();
	
	public static void main(String[] args) {
	map.put("Burhan", true);
	map.put("Ahmed", true);
	map.put("Any Other name is", false);
	System.out.println(map.get("Burhan"));
	if(map.containsKey("kenny"));
	System.out.println(1);
	if(map.containsKey(Boolean.FALSE));
	System.out.println(2);
	for(String s: map.keySet()) {
System.out.println(3);
    	
    }
	for(Boolean b :map.values()) {
	System.out.println(4);	
	}
	
	for(Entry<String, Boolean> ev : map.entrySet()) {
		
		
	}
	map.remove("Burhan");
	}
	
		
	


}
