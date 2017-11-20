import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		double a, b, c;
		System.out.print("a의 값을 입력하세요 : ");
		a = aScanner.nextDouble();
		System.out.print("b의 값을 입력하세요 : ");
		b = aScanner.nextDouble();
		System.out.print("c의 값을 입력하세요 : ");
		c = aScanner.nextDouble();

		double determinant;
		double x1, x2;

		System.out.println("a = " + a + " b = " + b + " c = " + c);
		determinant = b * b - 4.0 * a * c;
		if ((-0.0000001 < a) && (a < 0.0000001))
			System.out.println("오류 : 이차항의계수가 0이므로, 이차방정식을 풀 수 없습니다.");
		else {
			if (determinant < 0)
				System.out.println("실근이 존재하지 않습니다.");
			else {
				x1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
				x2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
				System.out.println("The solution is either " + x1 + " or " + x2);
			}

		}
		aScanner.close();
	}

}
