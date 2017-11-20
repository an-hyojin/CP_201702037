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
		System.out.print("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		KoreanScore = inputScore();
		student.setScoreKorean(KoreanScore);
		EnglishScore = inputScore();
		student.setScoreEnglish(EnglishScore);
		ComputerScore = inputScore();
		student.setScoreComputer(ComputerScore);

		while (KoreanScore >= 0 && EnglishScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || EnglishScore > 100 || ComputerScore > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				System.out.println("[��   ��] ���� : " + student.scoreKorean() + ", ���� : " + student.gradeKorean()
						+ ", ���� : " + student.gradePointKorean());
				System.out.println("[��   ��] ���� : " + student.scoreEnglish() + ", ���� : " + student.gradeEnglish()
						+ ", ���� : " + student.gradePointEnglish());
				System.out.println("[��ǻ��] ���� : " + student.scoreComputer() + ", ���� : " + student.gradeComputer()
						+ ", ���� : " + student.gradePointComputer());
				System.out.println("�� �л��� ��� ������ " + student.gpa());
				count.count(student.gpa());
			}
			System.out.print("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			KoreanScore = inputScore();
			student.setScoreKorean(KoreanScore);
			EnglishScore = inputScore();
			student.setScoreEnglish(EnglishScore);
			ComputerScore = inputScore();
			student.setScoreComputer(ComputerScore);
		}
		System.out.println("���� ������ �ԷµǾ� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0�̻��� �л��� " + count.numberOfGPA3() + "�� �Դϴ�.");
		System.out.println("��������� 2.0�̻� 3.0�̸��� �л��� " + count.numberOfGPA2() + "�� �Դϴ�.");
		System.out.println("��������� 1.0�̻� 2.0�̸��� �л���" + count.numberOfGPA1() + "�� �Դϴ�.");
		System.out.println("��������� 1.0�̸��� �л��� " + count.numberOfGPA0() + "�� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
}