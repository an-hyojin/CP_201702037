import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int count;
		int sum;

		System.out.print("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ� : ");
		int givenN = aScanner.nextInt();

		sum = 0;

		count = 1;

		while (count <= givenN) {
			sum = sum + count;
			count = count + 1;
		}
		System.out.println("�հ� : " + sum);
		aScanner.close();
	}

}
