
public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sineValue;
		int degree = 1;
		double radian;
		while (0 < degree && degree < 180) {
			radian = ((double) degree / 180.0) * 3.141592;
			sineValue = mySine(radian);
			int numberOfAsterisks;
			numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5);
			System.out.print("sine(" + degree + ")µµ :");
			printAsterisks(numberOfAsterisks);
			System.out.println();
			degree = degree + 5;
		}
	}

	private static void printAsterisks(int n) {
		

		int i = 0;
		while (n > i) {
			System.out.print("*");
			i++;
		}
	}

	private static double mySine(double x) {
		double xSquare = x * x;
		double currentTerm = x;
		int n = 2;
		double sineValue = currentTerm;
		while (Math.abs(currentTerm) >= 0.000001) {
			currentTerm = -currentTerm * xSquare / (double) (n * (n + 1));
			sineValue = sineValue + currentTerm;
			n = n + 2;
		}
		return sineValue;
	}
}