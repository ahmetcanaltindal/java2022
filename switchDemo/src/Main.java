
public class Main {

	public static void main (String[]args) {
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Gectiniz");
			
			break;
			
		case 'B':
			System.out.println("cok güzel : Gectiniz");
			
			break;
		case 'C':
			System.out.println("İyi : Gectiniz");
			
			break;
		case 'D':
			System.out.println("Fena degil : Gectiniz");
			
			break;	
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			
			break;	
			
		default:
			System.out.println("Gecersiz not girdiniz");
	
		}
	}
	
}
