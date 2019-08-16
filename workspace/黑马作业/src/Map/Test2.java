package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值
 。并使用keySet和entrySet两种方式遍历Map集合。
 */
public class Test2 {
	public static void main(String[] args) {
		HashMap<Car, Integer> hash = new HashMap<>();
		Car c1 = new Car("长安奔奔", "黄色");
        Car c3 = new Car("奇瑞QQ", "黑色");
        Car c2 = new Car("铃木奥拓", "白色");
        hash.put(c1,1000);
        hash.put(c2,100056);
        hash.put(c3,100078);
        Set<Car> keySet = hash.keySet();
        Iterator<Car> iterator = keySet.iterator();
        while (iterator.hasNext()) {
        System.out.println(hash.get(iterator.next()));
		}
        Set<Entry<Car, Integer>> entrySet = hash.entrySet();
        Iterator<Entry<Car, Integer>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
