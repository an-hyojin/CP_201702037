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
		System.out.print("두 과목 (국어 , 컴퓨터)의 점수를 차례로 입력하시오 : ");
		KoreanScore = inputScore();
		ComputerScore = inputScore();

		while (KoreanScore >= 0 && ComputerScore >= 0) {
			if (KoreanScore > 100 || ComputerScore > 100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				KoreanScores[peoplenumber] = KoreanScore;
				ComputerScores[peoplenumber] = ComputerScore;
				StudentAverages[peoplenumber] = (double) ((KoreanScore + ComputerScore) / 2.0);
				total = StudentAverages[peoplenumber] + total;
				peoplenumber++;

			}
			System.out.print("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			KoreanScore = inputScore();
			ComputerScore = inputScore();
		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + peoplenumber + "명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		int count = 0;
		total_average = total / (double) peoplenumber;
		while (count < (peoplenumber)) {
			System.out.println("[" + count + "] " + KoreanScores[count] + " " + ComputerScores[count] + " (평균 "
					+ StudentAverages[count] + ")");

			if (StudentAverages[count] >= total_average) {
				above_average++;
			}
			count++;
		}

		System.out.println("학급 평균은 " + total_average + "입니다.");
		System.out.println("평균이상인 학생의 수는 " + above_average + "명 입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
