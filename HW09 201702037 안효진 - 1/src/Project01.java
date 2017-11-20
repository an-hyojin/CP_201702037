import java.util.Scanner;

public class Project01 {
	private static Scanner aScanner = new Scanner(System.in);

	private static int inputScore() {
		int scoreFromScanner;

		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}

	private static int calcMax(int[] elements, int aSize) {
		int i, max;
		max = elements[0];
		i = 1;
		while (i < aSize) {
			if (max < elements[i]) {
				max = elements[i];
			}
			i++;
		}
		return max;
	}

	private static int calcMin(int[] elements, int aSize) {
		int i, min;
		min = elements[0];
		i = 1;
		while (i < aSize) {
			if (min > elements[i]) {
				min = elements[i];
			}
			i++;
		}
		return min;
	}

	private static final int MAX_SIZE = 100;

	private static void selectionSort(int[] elements, int aSize) {
		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue;
		int selectionLoc = 0;
		int curLoc;
		while (selectionLoc < lastLoc) {
			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc) {
				if (elements[curLoc] > maxValue) {
					maxLoc = curLoc;
					maxValue = elements[maxLoc];
				}
				curLoc++;

			}
			elements[maxLoc] = elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			selectionLoc++;

		}

	}

	private static double calcAverage(int[] elements, int aSize) {
		int i;
		int sum;
		double average;
		i = 0;
		sum = 0;
		while (i < aSize) {
			sum = sum + elements[i];
			i++;
		}
		average = (double) sum / (double) aSize;
		return average;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Scores = new int[MAX_SIZE];
		int peoplenumber = 0;
		int above_average = 0;
		int Score;
		int maxScore;
		int minScore;

		double average;

		System.out.print("> ������ �Է��Ͻÿ� :  ");
		Score = inputScore();

		while (Score >= 0) {
			if (Score > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				Scores[peoplenumber] = Score;

				peoplenumber++;

			}
			System.out.print("> ������ �Է��Ͻÿ� :  ");
			Score = inputScore();

		}
		average = calcAverage(Scores, peoplenumber);

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + peoplenumber + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int count = 0;

		while (count < (peoplenumber)) {
			if (average > Scores[count]) {
				System.out.println("[" + count + "] " + Scores[count] + "(��� �̸��Դϴ�.)");
			} else {
				System.out.println("[" + count + "] " + Scores[count] + "(��� �̻��Դϴ�.)");
				above_average++;
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� " + above_average + "�� �Դϴ�.");
		System.out.println();
		maxScore = calcMax(Scores, peoplenumber);
		minScore = calcMin(Scores, peoplenumber);
		System.out.println("�ְ����� " + maxScore + "�� �Դϴ�.");
		System.out.println("�������� " + minScore + "�� �Դϴ�.");
		System.out.println();
		selectionSort(Scores, peoplenumber);
		System.out.println("�������� ������ �����ϴ�.");
		count = 0;
		while (count < peoplenumber) {
			System.out.println("[" + count + "] " + Scores[count]);
			count++;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
