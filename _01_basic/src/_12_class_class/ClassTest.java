package _12_class_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
						ClassNotFoundException, NoSuchMethodException, SecurityException {
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("_12_class_class.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		System.out.println(Arrays.toString(parameterTypes));
		Constructor cons = c1.getConstructor(parameterTypes);
		System.out.println(cons);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
		
		Class c2 = Class.forName("_12_class_class.Person");
		Class[] parameterType = {String.class, int.class};
		Person me = (Person) c2.getConstructor(parameterType).newInstance("Minseo", 25);
		System.out.println(me.toString());
	}
}