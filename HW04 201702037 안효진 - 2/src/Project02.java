import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int givenN;
		char answer;
		int fact;
		int i;
		i = 2;
		fact = 1;
		System.out.print("���丮�� ����� �Ͻðڽ��ϱ�? ����ϰ� ������ Y�� �Է����ּ���.");
		answer = aScanner.next().charAt(0);
		while (answer == 'y' || answer == 'Y') {
			System.out.print("����ϰ� ���� n�� �Է��Ͻÿ� : ");
			givenN = aScanner.nextInt();
			if (givenN < 0) {
				System.out.println("�Է��� �����̹Ƿ� ���丮�� ���� ����� �� �����ϴ�.");
			} else {
				if (givenN == 0) {
					fact = 1;
				} else {
					while (i <= givenN) {
						fact = fact * i;
						i = i + 1;

					}
					
				}System.out.println("���丮�� ���� " + fact + "�Դϴ�.");
			}
			System.out.print("���丮�� ����� �Ͻðڽ��ϱ�? ����ϰ� ������ Y�� �Է����ֻ���.");
			answer = aScanner.next().charAt(0);

		}
		System.out.println("���α׷��� �����մϴ�.");
		aScanner.close();
	}
}
