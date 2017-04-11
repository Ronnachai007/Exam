package ecp3q.Exam;

import java.util.ArrayList;

public class ArrayListExam {
	ArrayList<Object> lst = new ArrayList();

	public int findTen() {
		int count = 0;
		for (int i = 0; i < lst.size(); i++) {
			if ((Integer) lst.get(i) == 10) {
				count++;
			}
		}
		return count;
	}
}
