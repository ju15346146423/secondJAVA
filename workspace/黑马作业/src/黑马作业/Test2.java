package 黑马作业;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection集合集合转数组
 */
public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
