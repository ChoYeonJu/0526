package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = Arrays.asList(new Student("ȫ�浿", 23), new Student("������", 100));
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name +"="+score);
		});

	}
 //���� �ݺ��� �÷��� ���ο��� ��ҵ��� �ݺ���Ű�� ó���ؾ��� �ڱ׸� �����ϴ� �ڵ� ����
}//�ܺ� �ݺ��� next() �޼ҵ�� �÷����� ��Ҹ� �ݺ��ؼ� �������� �ڵ� ����
