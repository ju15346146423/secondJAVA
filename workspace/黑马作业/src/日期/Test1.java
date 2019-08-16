package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 五、请用代码实现:获取当前的日期,并把这个日期转
 * 换为指定格式的字符串,如2088-08-08 08:08:08。
 */
public class Test1 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY年MM月dd日");
		String s ="2017年07月03日";
		Date parse = format2.parse(s);
		System.out.println(parse);
		System.out.println(simpleDateFormat.format(parse));
	}

}
