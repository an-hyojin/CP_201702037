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

		System.out.print("�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
		KoreanScore = inputScore();
		EnglishScore = inputScore();
		ComputerScore = inputScore();

		while (KoreanScore >= 0 && EnglishScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || EnglishScore > 100 || ComputerScore > 100) {
				System.out.println("���� : 100�� �Ѿ �������� ��찡 �ƴմϴ�.");
			} else {
				Koreangrade = score2grade(KoreanScore);
				Koreanpoint = grade2point(Koreangrade);
				Englishgrade = score2grade(EnglishScore);
				Englishpoint = grade2point(Englishgrade);
				Computergrade = score2grade(ComputerScore);
				Computerpoint = grade2point(Computergrade);
				System.out.println("[��  ��]���� :" + KoreanScore + ", ���� : " + Koreangrade + ", ���� :" + Koreanpoint);
				System.out.println("[��  ��]���� :" + EnglishScore + ", ���� : " + Englishgrade + ", ���� :" + Englishpoint);
				System.out.println("[��ǻ��]���� :" + ComputerScore + ", ���� : " + Computergrade + ", ���� :" + Computerpoint);
				three_average = average(Koreanpoint, Englishpoint, Computerpoint);
				System.out.println("�� �л��� ��� ������ " + three_average + "�Դϴ�.");
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
			System.out.print("�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
			KoreanScore = inputScore();
			EnglishScore = inputScore();
			ComputerScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 4.0�� �л��� " + Anumber + "�� �Դϴ�.");
		System.out.println("��������� 3.0�̻�  4.0�̸��� �л��� " + Bnumber + "�� �Դϴ�.");
		System.out.println("��������� 2.0�̻�  3.0�̸��� �л��� " + Cnumber + "�� �Դϴ�.");
		System.out.println("��������� 1.0�̻�  2.0�̸��� �л��� " + Dnumber + "�� �Դϴ�.");
		System.out.println("��������� 1.0�̸��� �л��� " + Fnumber + "�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}
}
