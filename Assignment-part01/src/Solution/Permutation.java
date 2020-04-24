package Solution;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testCase01 = new int[] { 4, 1, 3, 2 };
		int[] testCase02 = new int[] { 4, 1, 3 };
		System.out.println(solution(testCase01, 4));
		System.out.println(solution(testCase02, 3));

	}

	private static int solution(int[] A, int N) {
		int bitMap = 0;
		for (int i = 0; i < N; i++) {
			bitMap ^= A[i];
			bitMap ^= (i + 1);
		}
		return bitMap == 0 ? 1 : 0;
	}
}
