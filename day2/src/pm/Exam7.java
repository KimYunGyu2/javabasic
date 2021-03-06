package pm;

public class Exam7 {

	public static void main(String[] args) {
		// 1부터 1000까지의 자연수 중 3의 배수의 합을 계산 하시오 for
		
//		int sum = 0;
//		for(int i = 1; i<=1000; i++) {
//			if (i % 3 ==0) {
//				sum += i;
//			}
//		}
//		System.out.println("1부터 1000까지의 자연수 중 3의 배수의 합: " + sum);
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		70, 60, 55, 75, 95, 90, 80, 80, 85, 100
//		학생들 점수의 합계와 평균과 최고점수와 최저점수를 for each를 사용하여 구하세요
		
		int scores[] = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		
		int sum = 0;
		int max = 0;
		int min = scores[0];
		double avg = 0;
		
		for(int score: scores) {			
			sum += score;
			avg = sum / scores.length;
			if (score > max) {			
				max = score;				
			}
			if (score < min) {				
				min = score;		
			}
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);

	}

}
