package 黑马作业.math;

import java.util.Scanner;

/**
* 反转键盘录入的字符串。
 */
public class Test1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String rs = reverse(string);
		System.out.println("反转的字符串为"+rs);
	}

	private static String reverse(String string) {
		char[] charArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = charArray.length-1; i >=0; i--) {
			stringBuilder.append(charArray[i]);
			
		}
		String string2 = stringBuilder.toString();
		return string2;
	}
}
