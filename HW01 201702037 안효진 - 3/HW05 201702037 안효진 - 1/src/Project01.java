import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int score;
		int peoplenumber; // 학생 수를 세기 위한 변수
		double average;
		int sum;
		int Agrade;
		int Bgrade;
		int Cgrade;
		int Dgrade;
		int Fgrade;
		Agrade = 0;
		Bgrade = 0;
		Cgrade = 0;
		Dgrade = 0;
		Fgrade = 0;
		char grade;
		sum = 0;
		peoplenumber = 0;
		System.out.println("<<성적 처리 프로그램을 시작합니다.>>");
		System.out.println();
		System.out.print("성적을 입력하세요 : ");
		score = aScanner.nextInt();
		while (score >= 0) {
			if (score > 100) {
				// 성적이 100이 넘은 경우 :
				System.out.println("오류 : 100이 넘는 성적이 입력되었습니다.");
			} else {
				// 성적이 100이하로 정상인 경우:
				if (score >= 90 && score <= 100) {
					grade = 'A';
					Agrade = Agrade + 1;
				} else if ((score >= 80) && (score < 90)) {
					grade = 'B';
					Bgrade = Bgrade + 1;
				} else if (score >= 70 && score < 79) {
					grade = 'C';
					Cgrade = Cgrade + 1;
				} else if (score >= 60 && score < 69) {
					grade = 'D';
					Dgrade = Dgrade + 1;
				} else {
					grade = 'F';
					Fgrade = Fgrade + 1;
				}
				System.out.println("(성적 : " + score + ", 학점 : " + grade + ")");
				peoplenumber = peoplenumber + 1;
				sum = score + sum;

			}
			System.out.print("성적을 입력하세요 : ");
			score = aScanner.nextInt();
		}

		average = (double) sum / (double) peoplenumber;
		System.out.println("학생수는 " + peoplenumber + "명 입니다.");
		System.out.println("A는 " + Agrade + "명 입니다.");
		System.out.println("B는 " + Bgrade + "명 입니다.");
		System.out.println("C는 " + Cgrade + "명 입니다.");
		System.out.println("D는 " + Dgrade + "명 입니다.");
		System.out.println("F는 " + Fgrade + "명 입니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		System.out.println("<<성적 처리 프로그램을 종료합니다.>>");
		aScanner.close();
	}

}
