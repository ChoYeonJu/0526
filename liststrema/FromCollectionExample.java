package liststrema;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 80),
				new Student("조연주", 100),
				new Student("조연줒", 90)
				);
		
		Stream<Student> stream = studentList.stream();
		
		stream.forEachOrdered(s -> System.out.println(s.getName()));
 	}

}
