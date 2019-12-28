package Assingments.Dec28;

import java.util.Scanner;

public class CircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			System.out.println(circularSum(arr));

		}
	}

	public static int maxSum(int[] arr) {

		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			curr_sum += arr[i];
			max_sum = Math.max(max_sum, curr_sum);
			curr_sum = Math.max(curr_sum, 0);

		}

		return max_sum;

	}

	public static int circularSum(int[] arr) {

		int normal_sum = maxSum(arr);

		int total_sum = 0;

		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];

			arr[i] = -arr[i];
		}

		int non_wrap_sum = maxSum(arr);

		int wrap_sum = total_sum + non_wrap_sum;

		return Math.max(normal_sum, wrap_sum);

	}

}
