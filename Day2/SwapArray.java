package start2;
/*
 * github, ai참조
 */


public class SwapArray {
	int i;
	int[] swapArray (int numList[]) {
		for (i=0; i<numList.length/2; i++) {
			int cha = numList[i];
			numList[i] = numList[numList.length-1-i];
			numList[numList.length-1-i] = cha;
		}
		return numList;
	}
	
	
	

	public static void main(String[] args) {
		int numList[] = {98,24,10,97,26};
		SwapArray swap = new SwapArray();
		int seq[] = swap.swapArray(numList);
		for(int i=0; i<seq.length; i++) {
			System.out.print("["+seq[i]+"]");
		}
		

	}

}
