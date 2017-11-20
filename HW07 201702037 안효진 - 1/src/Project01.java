import java.util.Scanner;

public class Project01 {
	private static Scanner aScanner = new Scanner(System.in);

	private static int inputScore() {

		int score;

		score = aScanner.nextInt();
		return score;

	}

	private static double average(double Koreanpoint, double Englishpoint, double Computerpoint) {
		double average;
		average = (Koreanpoint + Englishpoint + Computerpoint) / 3.0;
		return average;
	}

	private static char score2grade(int aScore) {
		char grade;
		if (aScore >= 90 && aScore <= 100) {
			grade = 'A';
		} else if (aScore >= 80 && aScore <= 89) {
			grade = 'B';
		} else if (aScore >= 70 && aScore <= 79) {
			grade = 'C';
		} else if (aScore >= 60 && aScore <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	private static double grade2point(char grade) {
		double point;
		if (grade == 'A') {
			point = 4.0;
		} else if (grade == 'B') {
			point = 3.0;
		} else if (grade == 'C') {
			point = 2.0;
		} else if (grade == 'D') {
			point = 1.0;
		} else {
			point = 0.0;
		}
		return point;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int KoreanScore;
		int EnglishScore;
		int ComputerScore;
		int Anumber = 0;
		int Bnumber = 0;
		int Cnumber = 0;
		int Dnumber = 0;
		int Fnumber = 0;
		double three_average;
		char Koreangrade;
		char Englishgrade;
		char Computergrade;
		double Koreanpoint;
		double Englishpoint;
		double Computerpoint;

		System.out.print("세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
		KoreanScore = inputScore();
		EnglishScore = inputScore();
		ComputerScore = inputScore();

		while (KoreanScore >= 0 && EnglishScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || EnglishScore > 100 || ComputerScore > 100) {
				System.out.println("오류 : 100이 넘어서 정상적인 경우가 아닙니다.");
			} else {
				Koreangrade = score2grade(KoreanScore);
				Koreanpoint = grade2point(Koreangrade);
				Englishgrade = score2grade(EnglishScore);
				Englishpoint = grade2point(Englishgrade);
				Computergrade = score2grade(ComputerScore);
				Computerpoint = grade2point(Computergrade);
				System.out.println("[국  어]점수 :" + KoreanScore + ", 학점 : " + Koreangrade + ", 평점 :" + Koreanpoint);
				System.out.println("[영  어]점수 :" + EnglishScore + ", 학점 : " + Englishgrade + ", 평점 :" + Englishpoint);
				System.out.println("[컴퓨터]점수 :" + ComputerScore + ", 학점 : " + Computergrade + ", 평점 :" + Computerpoint);
				three_average = average(Koreanpoint, Englishpoint, Computerpoint);
				System.out.println("이 학생의 평균 평점은 " + three_average + "입니다.");
				three_average = average(Koreanpoint, Englishpoint, Computerpoint);
				if (three_average >= 4.0) {
					Anumber++;
				} else if (three_average >= 3.0 && three_average > 4.0) {
					Bnumber++;
				} else if (three_average >= 2.0 && three_average > 3.0) {
					Cnumber++;
				} else if (three_average >= 1.0 && three_average > 2.0) {
					Dnumber++;
				} else {
					Fnumber++;
				}

			}
			System.out.print("세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
			KoreanScore = inputScore();
			EnglishScore = inputScore();
			ComputerScore = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 4.0인 학생은 " + Anumber + "명 입니다.");
		System.out.println("평균평점이 3.0이상  4.0미만인 학생은 " + Bnumber + "명 입니다.");
		System.out.println("평균평점이 2.0이상  3.0미만인 학생은 " + Cnumber + "명 입니다.");
		System.out.println("평균평점이 1.0이상  2.0미만인 학생은 " + Dnumber + "명 입니다.");
		System.out.println("평균평점이 1.0미만인 학생은 " + Fnumber + "명 입니다.");
		System.out.println("프로그램을 종료합니다.");

	}
}
