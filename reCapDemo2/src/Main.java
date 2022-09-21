
public class Main {
	public static void main(String[] args) {
		double[] mylist = {1.5,2.5,6.8,2.7};
		double total = 0;
		double max = mylist[0];
		for (double number : mylist) {
			if (max < number) {
				max = number;
				
			}
			total = total + number;
			System.out.println(number);
			
		}
		System.out.println("Toplam =" + total);
		System.out.println("En buyuk =" + max);

	}
	 
	
}
