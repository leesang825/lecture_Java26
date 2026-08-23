package start2;
/*
 * github, ai참조
 */

public class Max {
	
	public int getMax (int[] numlist) {
		int max = numlist[0];
		int i;
		for (i=1; i<numlist.length; i++) {
			if (numlist[i]>max) {
				max = numlist[i];
				
			}
		}
		return max;
		
		
	}
	

	public static void main(String[] args) {
		int Numlist[] = {68,87,78,55,97,98,95};
		Max m = new Max();
		int result = m.getMax(Numlist);
		System.out.println(result);
		

	

}
}
