/**
 * @author : 221213
 * @date : 2023. 01. 15
 */
public class ThridCalc {
	public static void main(String[] args) {
		int[] testArr = {
				1, 2, 3, 4, 5, 6, 7, 8
				, 9, 10, 11, 12, 13, 14, 15, 16
				, 9, 10, 11, 12, 13, 14, 15, 16};
		int toteAssgNoCnt = 0;
		int astTaskGrpCnt = 0;
		for (int i = 0; i < testArr.length; i++) {
			int i1 = testArr[i];
			if (i % 2 == 0) {
				if (toteAssgNoCnt % 4 == 0) {
					astTaskGrpCnt++;
					System.out.println("astTaskGrpCnt : " + astTaskGrpCnt);
				}
				toteAssgNoCnt++;
				System.out.println("	toteAssgNoCnt : " + toteAssgNoCnt);
			}

		}

		System.out.println("ordCnt : " + testArr.length);
		System.out.println("toteAssgNoCnt : " + toteAssgNoCnt);
		System.out.println("astTaskGrpCnt : " + astTaskGrpCnt);
	}
}
