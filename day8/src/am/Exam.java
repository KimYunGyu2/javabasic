package am;

public class Exam {

	public static void main(String[] args) {
		// 배열, 반복, 조건,
		// 주석, 클래스, 객체
		
		// Q1 첫 수부터 숫자 2개씩을 나누어 출력하세요 
		
		// Q2 첫 수부터 숫자 2개씩 더한 값이 짝수인 그 해당 숫자 2개의 인데스 번호를 배열로 
		// 만들어 출력하시오
		
		int[] a = {1,3,4,5,6};
		
		for(int i = 0; i<a.length-1; i++) {
		
				System.out.println(a[i]+", "+a[i+1]);
			
		}
		
		int[] b = new int[2];
		for(int j = 0; j<a.length-1;j++) {
			if(a[j]+a[j+1]%2==0) {
				b[0]=j;
				b[1]=j+1;
				System.out.println(a[j] + ", " + a[j+1]);
			}
			
		}
		

	}

}
