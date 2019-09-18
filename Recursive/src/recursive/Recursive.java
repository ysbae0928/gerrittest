package recursive;

import java.util.ArrayList;
import java.util.List;

public class Recursive {
	int[] x = null;
	int[] y = null;
	int N;
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		int[] y = {1,2,3,4,5};
		int N = 6;
		System.out.println(mainFunction(x, y, N)); // 우리가 줘야할 값
	}
	
	static public double mainFunction(int[] x, int[] y, int N) {
		if(N > x.length || N > y.length) {
			return -9999;
		}
		if(N <= 0)
			return 0.0;
		
		double result = 0.0;
		for(int i = 1; i <= N; i++) {
			result += functionG(x[i-1], y[i-1]);
		}
		
		return result / N;
	}

	static public double functionG(int xi, int yi) {
		return Math.pow(functionF(xi) - yi, 2);
	}
	
	static public double functionF(int xi) {
		return Math.pow(xi, 2);
	}
}
