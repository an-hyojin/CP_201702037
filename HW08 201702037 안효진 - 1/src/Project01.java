import java.util.Scanner;

public class Project01 {
	private static Scanner aScanner = new Scanner(System.in);

	private static int inputScore() {
		int scoreFromScanner;

		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}

	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] KoreanScores = new int[MAX_SIZE];
		int[] ComputerScores = new int[MAX_SIZE];
		double[] StudentAverages = new double[MAX_SIZE];
		int peoplenumber = 0;
		int above_average = 0;
		double total = 0;
		double total_average;

		int KoreanScore;
		int ComputerScore;
		System.out.print("�� ���� (���� , ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		KoreanScore = inputScore();
		ComputerScore = inputScore();

		while (KoreanScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || ComputerScore > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				KoreanScores[peoplenumber] = KoreanScore;
				ComputerScores[peoplenumber] = ComputerScore;
				StudentAverages[peoplenumber] = (double) ((KoreanScore + ComputerScore) / 2.0);
				total = StudentAverages[peoplenumber] + total;
				peoplenumber++;

			}
			System.out.print("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			KoreanScore = inputScore();
			ComputerScore = inputScore();
		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + peoplenumber + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int count = 0;
		total_average = total / (double) peoplenumber;
		while (count < (peoplenumber)) {
			System.out.println("[" + count + "] " + KoreanScores[count] + " " + ComputerScores[count] + " (��� "
					+ StudentAverages[count] + ")");

			if (StudentAverages[count] >= total_average) {
				above_average++;
			}
			count++;
		}

		System.out.println("�б� ����� " + total_average + "�Դϴ�.");
		System.out.println("����̻��� �л��� ���� " + above_average + "�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
