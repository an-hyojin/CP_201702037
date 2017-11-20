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

		System.out.print("> 점수를 입력하시오 :  ");
		Score = inputScore();

		while (Score >= 0) {
			if (Score > 100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				Scores[peoplenumber] = Score;

				peoplenumber++;

			}
			System.out.print("> 점수를 입력하시오 :  ");
			Score = inputScore();

		}
		average = calcAverage(Scores, peoplenumber);

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + peoplenumber + "명의 성적이 입력되었습니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		int count = 0;

		while (count < (peoplenumber)) {
			if (average > Scores[count]) {
				System.out.println("[" + count + "] " + Scores[count] + "(평균 미만입니다.)");
			} else {
				System.out.println("[" + count + "] " + Scores[count] + "(평균 이상입니다.)");
				above_average++;
			}
			count++;
		}
		System.out.println("평균 이상인 학생의 수는 " + above_average + "명 입니다.");
		System.out.println();
		maxScore = calcMax(Scores, peoplenumber);
		minScore = calcMin(Scores, peoplenumber);
		System.out.println("최고점은 " + maxScore + "점 입니다.");
		System.out.println("최저점은 " + minScore + "점 입니다.");
		System.out.println();
		selectionSort(Scores, peoplenumber);
		System.out.println("성적순은 다음과 같습니다.");
		count = 0;
		while (count < peoplenumber) {
			System.out.println("[" + count + "] " + Scores[count]);
			count++;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
