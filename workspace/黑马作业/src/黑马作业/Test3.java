package 黑马作业;

import java.io.File;
import java.io.IOException;

/**
 * 获取D盘aaa文件夹中b.txt文件的
 * 文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		if(file.exists()) {
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
	}
	
}
}