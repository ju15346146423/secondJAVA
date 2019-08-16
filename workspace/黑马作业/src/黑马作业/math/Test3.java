package 黑马作业.math;
/**
* 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
 */
public class Test3 {
	private static int indexOf;

	public static void main(String[] args) {
		double d1 = Math.random()*100;
		String s = d1+"";
		int i = s.indexOf(".");
		String substring = s.substring(0, i+3);
		System.out.println(substring);
	}
}
