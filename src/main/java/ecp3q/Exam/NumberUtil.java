package ecp3q.Exam;

public class NumberUtil {
	public int sumArray(int[] arr) {
		int sum = 0;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		} else {
			return -1;
		}
	}
}
