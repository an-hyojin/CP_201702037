import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		char answer;
		System.out.println("������������ Ǫ�ðڽ��ϱ�? Ǯ�⸦ ���ϸ� Y�� �Է��ϼ���.");
		answer = aScanner.next().charAt(0);
		while (answer == 'Y' || answer == 'y') {
			double a, b, c;
			System.out.print("a�� ���� �Է��ϼ��� : ");
			a = aScanner.nextDouble();
			System.out.print("b�� ���� �Է��ϼ��� : ");
			b = aScanner.nextDouble();
			System.out.print("c�� ���� �Է��ϼ��� : ");
			c = aScanner.nextDouble();

			double determinant;
			double x1, x2;

			System.out.println("a = " + a + " b = " + b + " c = " + c);
			determinant = b * b - 4.0 * a * c;
			if ((-0.0000001 < a) && (a < 0.0000001)) {
				System.out.println("���� : �������ǰ���� 0�̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
			} else {
				if (determinant < 0) {
					System.out.println("�Ǳ��� �������� �ʽ��ϴ�.");
				} else {
					x1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
					x2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
					System.out.println("The solution is either " + x1 + " or " + x2);
				}

			}
			System.out.println("������������ Ǫ�ðڽ��ϱ�? Ǯ�⸦ ���ϸ� Y�� �Է��ϼ���.");
			answer = aScanner.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");
		aScanner.close();
	}

}
