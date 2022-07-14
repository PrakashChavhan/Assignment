package com.yash.tddexample;

public class AssignQ4 {
	int digit = 0;
	int sum = 0;

	public boolean checkArmstrong(int i) {
		int temp = i;

		while (i != 0) {
			digit++;
			i--;
		}
		i = temp;
		while (i != 0) {
			int dig = i % 10;
			sum = sum + (dig * dig * dig);
			i = i / 10;
		}

		if (temp == sum) {

			return true;
		}
		return false;

	}

}
