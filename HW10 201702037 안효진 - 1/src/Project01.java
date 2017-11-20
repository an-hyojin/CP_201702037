import java.util.Scanner;

public class Project01 {
	private static Scanner aScanner = new Scanner(System.in);

	private static int inputScore() {

		return aScanner.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		GpaCounter count = new GpaCounter();
		int KoreanScore;
		int EnglishScore;
		int ComputerScore;
		System.out.print("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
		KoreanScore = inputScore();
		student.setScoreKorean(KoreanScore);
		EnglishScore = inputScore();
		student.setScoreEnglish(EnglishScore);
		ComputerScore = inputScore();
		student.setScoreComputer(ComputerScore);

		while (KoreanScore >= 0 && EnglishScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || EnglishScore > 100 || ComputerScore > 100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				System.out.println("[국   어] 점수 : " + student.scoreKorean() + ", 학점 : " + student.gradeKorean()
						+ ", 평점 : " + student.gradePointKorean());
				System.out.println("[영   어] 점수 : " + student.scoreEnglish() + ", 학점 : " + student.gradeEnglish()
						+ ", 평점 : " + student.gradePointEnglish());
				System.out.println("[컴퓨터] 점수 : " + student.scoreComputer() + ", 학점 : " + student.gradeComputer()
						+ ", 평점 : " + student.gradePointComputer());
				System.out.println("이 학생의 평균 평점은 " + student.gpa());
				count.count(student.gpa());
			}
			System.out.print("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			KoreanScore = inputScore();
			student.setScoreKorean(KoreanScore);
			EnglishScore = inputScore();
			student.setScoreEnglish(EnglishScore);
			ComputerScore = inputScore();
			student.setScoreComputer(ComputerScore);
		}
		System.out.println("음의 정수가 입력되어 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0이상인 학생은 " + count.numberOfGPA3() + "명 입니다.");
		System.out.println("평균평점이 2.0이상 3.0미만인 학생은 " + count.numberOfGPA2() + "명 입니다.");
		System.out.println("평균평점이 1.0이상 2.0미만인 학생은" + count.numberOfGPA1() + "명 입니다.");
		System.out.println("평균평점이 1.0미만인 학생은 " + count.numberOfGPA0() + "명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
}