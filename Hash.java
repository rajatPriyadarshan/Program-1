import java.util.HashMap;
public class Hash {

	
	
	public static void main(String[] args) {
	 // Create a hash map.
	 HashMap<String, Integer> hm = new HashMap<String, Integer>
	();
	 // Put elements into the map
	 hm.put("Rajat", new Integer(55));
	 hm.put("Seema", new Integer(77));
	 hm.put("Amuu", new Integer(99));
	 hm.put("Lue", new Integer(65));
	 System.out.println("Students count :: " + hm.size());
	for(String key : hm.keySet()){
	 System.out.println(key + " score marks :" + hm.get(key));
	 }
	 System.out.println("Amuu score available ::" +
	hm.containsKey("Amuu"));
	 System.out.println("Rahul score available:: " +
	hm.containsKey("Rahul"));
	 }
	}

