package 黑马作业;
/**
 * Collection集合统计元素出现次数
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
	

		System.out.println(list);
		//System.out.println("a有"+ListTest(list,"a")+"个");
		HashSet<String> set = new HashSet<>();
		boolean addAll = set.addAll(list);
		System.out.println(set);

	}
	public static int ListTest(List<String> list,String s) {
		int count=0;
		for (String string : list) {
				if(string.equals(s)) {
					count++;
				}
				
		}
		return count;
	}

}
