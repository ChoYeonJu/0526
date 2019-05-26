package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = Arrays.asList(new Student("홍길동", 23), new Student("조연주", 100));
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name +"="+score);
		});

	}
 //내부 반복자 컬랙션 내부에서 요소들을 반복시키고 처리해야할 코그만 제공하는 코드 패턴
}//외부 반복자 next() 메소드로 컬렉션의 요소를 반복해서 가져오는 코드 패턴
