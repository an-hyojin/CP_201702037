import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int score;
		int peoplenumber; // �л� ���� ���� ���� ����
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
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�.>>");
		System.out.println();
		System.out.print("������ �Է��ϼ��� : ");
		score = aScanner.nextInt();
		while (score >= 0) {
			if (score > 100) {
				// ������ 100�� ���� ��� :
				System.out.println("���� : 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
			} else {
				// ������ 100���Ϸ� ������ ���:
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
				System.out.println("(���� : " + score + ", ���� : " + grade + ")");
				peoplenumber = peoplenumber + 1;
				sum = score + sum;

			}
			System.out.print("������ �Է��ϼ��� : ");
			score = aScanner.nextInt();
		}

		average = (double) sum / (double) peoplenumber;
		System.out.println("�л����� " + peoplenumber + "�� �Դϴ�.");
		System.out.println("A�� " + Agrade + "�� �Դϴ�.");
		System.out.println("B�� " + Bgrade + "�� �Դϴ�.");
		System.out.println("C�� " + Cgrade + "�� �Դϴ�.");
		System.out.println("D�� " + Dgrade + "�� �Դϴ�.");
		System.out.println("F�� " + Fgrade + "�� �Դϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println();
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�.>>");
		aScanner.close();
	}

}
