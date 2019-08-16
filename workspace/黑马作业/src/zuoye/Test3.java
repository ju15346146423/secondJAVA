package zuoye;

import java.util.Arrays;
import java.util.Random;

/**
 定义getNumList方法，随机生成100个数字，数字范围从1到10。
  * 定义printCount方法，统计每个数字出现的次数并打印到控制台。
 */
public class Test3 {

	public static void main(String[] args) {
		int i1[]= getNumList();
		int i2[]= printCount(i1);
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
	}

	private static int[] printCount(int[] i1) {
		int[] com = new int[10];
		int count=0;
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j <i1.length; j++) {
				if (i1[j]==i) {
					count++;
				}
			}
			//System.out.println(count);
			com[i]=count;
			count=0;
		}
		return com;
	}

	private static int[] getNumList() {
		Random random = new Random();
		int[] i1 = new int[100];
		for (int i = 0; i < 100; i++) {
			i1[i] =random.nextInt(10)+1;
		}
		return i1;
	}

}
