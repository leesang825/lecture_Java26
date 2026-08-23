package start2;
/*
 * github, ai 참조
 */
public class Count {
	
	public int getCount(int[] numlist, int target) {
		int i;
		int count = 0;
		for (i=0; i<numlist.length; i++) {
			if (numlist[i]>target) {
				count++;
				
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		int numlist[] = {85, 95, 65, 75, 55, 40};
		int target = 45;
		Count num = new Count();
		int count = num.getCount(numlist,target);
		System.out.println(count);
		
		
		

	

 }
}
