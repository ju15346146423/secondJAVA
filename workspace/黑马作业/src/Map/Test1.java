package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("»ÆÏþÃ÷", "Baby");
        map.put("µË³¬", "ËïÙ³");
        map.put("Àî³¿", "·¶±ù±ù");
        map.put("´óºÚÅ£", "·¶±ù±ù");
//        map.remove("Àî³¿");
//        map.put("´óºÚÅ£", "wu");
       
        System.out.println(map);
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
//        while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
       
        
	}

}
