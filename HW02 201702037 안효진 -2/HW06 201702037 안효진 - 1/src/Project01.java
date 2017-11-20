import java.util.Scanner;

public class Project01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;

		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다.>>");
		System.out.println();
		x = inputNumber();
		while (x >= 0) {
			printAsterisks(x);
			System.out.println();
			x = inputNumber();
		}
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다.>>");
	}

	private static Scanner aScanner = new Scanner(System.in);

	private static int inputNumber() {

		System.out.print("양의 정수 (종료하려면 음수)를 입력하시오: ");
		int a;
		a = aScanner.nextInt();
		return a;

	}

	private static void printAsterisks(int n) {

		int i = 0;
		while (n > i) {
			System.out.print("*");
			i++;
		}

	}

}
