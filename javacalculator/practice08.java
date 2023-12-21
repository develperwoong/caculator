package ch05.sec01;


public class practice08 {

	public static void main(String[] args) {
		int[][] array = {
		{95, 86},
		{83,92,96},
		{78,83,93,87,88}
		};
	
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length;k++) {
			sum += array[i][k];
			count ++;
			}
		}
		System.out.println("전체의 합계는 sum:" + sum);
		avg = (double)sum/count;
		System.out.println("전체의 평균은 avg:" + avg);
		
	}
}
