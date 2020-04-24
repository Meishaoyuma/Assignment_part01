package Solution;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testCase= new int[] {3,8,9,7,6};
		int[] result=Rotate(testCase,testCase.length,3);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	private static int[] Rotate(int[] A, int N, int K) {
		if(A==null || N==0) {
			return A;
		}
		int[] ans = new int[N];
		int moved = K%N;
		for(int i=0;i<N-moved;i++) {
			ans[i+moved]= A[i];
		}
		for(int i=N-moved;i<N;i++) {
			ans[i-N+moved]=A[i];
		}
		return ans;
	}

}
