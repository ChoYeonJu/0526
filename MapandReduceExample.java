import java.util.Arrays;
import java.util.List;

public class MapandReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = Arrays.asList(new Student("조연주", 100), new Student("초연주", 99), new Student("조연줒", 98));
		
		double avg = studentList.stream().
				//중간처리
				mapToInt(Student :: getScore).
				//최정 처리(평균 처리)
				average().getAsDouble();
		
		System.out.println("평균점수 : " + avg);

	}

}
