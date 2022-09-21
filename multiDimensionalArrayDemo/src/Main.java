
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "kayseri";
		sehirler[0][2] = "urfa";
		sehirler[1][0] = "giresun";
		sehirler[1][1] = "mersin ";
		sehirler[1][2] = "izmir";
		sehirler[2][0] = "aydın";
		sehirler[2][1] = "balıkesir";
		sehirler[2][2] = "mugla";
		
		for(int i = 0; i<=2;i++) {	
			for(int j = 0; j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("------------");
		}
		
		
		
	}

}
