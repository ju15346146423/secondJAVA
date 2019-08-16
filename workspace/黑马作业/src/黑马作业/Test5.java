package ºÚÂí×÷Òµ;

public class Test5 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("°¢Ðñ",18);
		System.out.println(person);
			Person clone = person.clone();
			System.out.println(clone);
			person.setAge(30);
			System.out.println(person.getAge());
			System.out.println(clone.getAge());
			
	}
}
