package 黑马作业.math;
/*
 * 分析以下需求，并用代码实现
    1.键盘录入一个大字符串,再录入一个小字符串
    2.统计小字符串在大字符串中出现的次数
    3.代码运行打印格式:
        请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        请输入小字符串:heima
        控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
 */
public class Test2 {

	public static void main(String[] args) {
		String s1 ="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		String s2 ="heima";
		int count = getcount(s1,s2);
		System.out.println( count);
	}

	private static int getcount(String s1, String s2) {
		int count=0;
		int index=0;
		while (!((index=s1.indexOf(s2, index))==-1)) {
			count++;
			index++;
		}
		return count;
	}

}
