package 黑马作业.math;

import java.util.ArrayList;
import java.util.Arrays;

/*自定义MyList类，实现存取元素的功能。

* 定义add方法，可以保存元素，添加MyList尾部。
* 定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
* 定义show方法，可以展示MyList中的元素。*/
public class MyList {
	 ArrayList<Object> list = new ArrayList<>();
	 
	 public void add(Object e){
		 this.list.add(e);
	 }
 
	 public Object remove(){
		 this.list.remove(list.size()-1);
		return list;
		 
	 }
 
	 public void show(){
		 System.out.println(list);
 }
	 
}    
