package Start;

public class Array02 {

	public static void main(String[] args) {
		double gradeArr[] = { 90, 70, 82, 90, 85 };
		
		double sum= 0;
		for (int i=0; i<5; i++) {
			
			sum += gradeArr[i];
			
		}
		double average = sum/5.0;
		System.out.println(">>합계:"+sum);
		System.out.println(">>평균:"+average);
		

}
}
