import java.util.Scanner;

public class Project01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;

		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
		System.out.println();
		x = inputNumber();
		while (x >= 0) {
			printAsterisks(x);
			System.out.println();
			x = inputNumber();
		}
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.>>");
	}

	private static Scanner aScanner = new Scanner(System.in);

	private static int inputNumber() {

		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�: ");
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
