package aggregate;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2==0).count();
		System.out.println("2�� ��� ���� : "+ count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(n-> n%2==0).sum();
		System.out.println("2�� ����� �� ; " + sum);
		
		double avg = Arrays.stream(new double[] {2,3,4,5,6,7,8}).filter(n -> n%2==0).average().getAsDouble();
		System.out.println("2�� ����� ��� �� : " + avg);

		int max = Arrays.stream(new int[] {2,3,4,5,6,7,8,9,10}).filter(n -> n%3==0).max().getAsInt();
		System.out.println("3�� ����� ���� ū �� : " + max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,12,33,43}).filter(n -> n%3==0).min().getAsInt();
		System.out.println("3�� ����� ���� ���� �� : "+min);
		
		int first = Arrays.stream(new int[] {2,3,4,5,6,7,12,322,342}).filter(n -> n%5==0).findFirst().getAsInt();
		System.out.println("5�� ����� ù��° �� : " + first);
	}

}
