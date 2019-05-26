import java.util.Arrays;
import java.util.List;

public class MapandReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = Arrays.asList(new Student("������", 100), new Student("�ʿ���", 99), new Student("�����B", 98));
		
		double avg = studentList.stream().
				//�߰�ó��
				mapToInt(Student :: getScore).
				//���� ó��(��� ó��)
				average().getAsDouble();
		
		System.out.println("������� : " + avg);

	}

}
