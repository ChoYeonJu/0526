package parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��","���ڹ�","������","���ٽ�","�躴��");
		
		//����ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);

		System.out.println();
		
		//����ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
