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
		System.out.print("팩토리얼 계산을 하시겠습니까? 계산하고 싶으면 Y를 입력해주세요.");
		answer = aScanner.next().charAt(0);
		while (answer == 'y' || answer == 'Y') {
			System.out.print("계산하고 싶은 n을 입력하시오 : ");
			givenN = aScanner.nextInt();
			if (givenN < 0) {
				System.out.println("입력이 음수이므로 팩토리얼 값을 계산할 수 없습니다.");
			} else {
				if (givenN == 0) {
					fact = 1;
				} else {
					while (i <= givenN) {
						fact = fact * i;
						i = i + 1;

					}
					
				}System.out.println("팩토리얼 값은 " + fact + "입니다.");
			}
			System.out.print("팩토리얼 계산을 하시겠습니까? 계산하고 싶으면 Y를 입력해주새요.");
			answer = aScanner.next().charAt(0);

		}
		System.out.println("프로그램을 종료합니다.");
		aScanner.close();
	}
}
