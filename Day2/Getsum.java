package start2;

/*
 * github, ai 참조
 */
public class Getsum {
	
	public int getSum(int[] numlist) {
		int sum = 0;
		for (int i=0; i<numlist.length; i++) {
			sum += numlist[i];
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int numList [] =  {100, 55, 89,78, 25, 34};
		Getsum intsum = new Getsum();
		int total = intsum.getSum(numList);
		
		System.out.println(total);
		
		

	}

}
