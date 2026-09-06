package Start;

public class Array01 {

	public static void main(String[] args) {
		double[] gradeArr = {90, 70, 80, 79, 82, 50, 70, 90, 89, 89 };
		double sum = 0;
		
		for (int i=0; i<10; i++) {
			sum += gradeArr [i];
			
			
		}
		double average =  sum/5.0;
		
		System.out.println(">>합계:"+sum);
		System.out.println(">>평균:"+average);

}
}
