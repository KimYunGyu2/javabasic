package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
//		int mon = 3;
//		switch(mon / 3) {
//		case 1: System.out.println("봄입니다."); break;
//		
//		case 2: System.out.println("여름입니다."); break;
//		
//		case 3: System.out.println("가을입니다."); break;
//		
//		default: System.out.println("겨울입니다.");
//		
//		}
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		switch(mon) {
		case 1: System.out.println("Jan"); break;
		case 2: System.out.println("Feb"); break;
		case 3: System.out.println("Mar"); break;
		case 4: System.out.println("Apr"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("Jun"); break;
		case 7: System.out.println("Jul"); break;
		case 8: System.out.println("Aug"); break;
		case 9: System.out.println("Sep"); break;
		case 10: System.out.println("Oct"); break;
		case 11: System.out.println("Nov"); break;
		case 12: System.out.println("Dec"); break;
		default: System.out.println("1~12숫자를 입력해주세요");
		}
		
		
		
	}

}
