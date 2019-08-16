package บฺยํื๗าต;

import java.io.File;

public class Test4 {
	private void mian() {
		File file = new File("D:\\");
			String[] list = file.list();
			for (String string : list) {
				System.out.println(string);
			}
;	}
}
