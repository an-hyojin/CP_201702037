import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int count;
		int sum;

		System.out.print("1부터 N까지 합계를 구하려고 합니다. N값을 입력하십시오 : ");
		int givenN = aScanner.nextInt();

		sum = 0;

		count = 1;

		while (count <= givenN) {
			sum = sum + count;
			count = count + 1;
		}
		System.out.println("합계 : " + sum);
		aScanner.close();
	}

}
