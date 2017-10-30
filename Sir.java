import java.util.Scanner;

public class Sir {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Introduce-ti un sirul: ");
		String word = s.nextLine();
		
		System.out.println("Aveti mai multe obtiuni: ");
		System.out.println("1 - afisarea lungimii sirului");
		System.out.println("2 - returnarea ultimii poz a caracterului 'a'");
		System.out.println("3 - numara de cate ori apare secventa 'abc'");
		System.out.println("4 - verificare daca sirul este palindrom");
		System.out.println("5 - stergerea caracterelor de pe pozitii pare");
		int option = s.nextInt();
		switch(option) {
		case 1:
			System.out.println(word.length());
			break;
		case 2:
			int ok = 0;
			for(int i= word.length() - 1; i >= 0; i-- ) { 
				if(word.charAt(i) == 'a') {
					System.out.println(i);
					ok =1;
					break;
				}
			}
			if(ok == 0) {
				System.out.println("Nu exista litera a in cuvant!");
			}
			break;
		case 3:
			int nr = 0;
			for(int i= 0; i < word.length()-2; i++ ) {
				if(word.charAt(i) == 'a' && word.charAt(i + 1) == 'b' && word.charAt(i + 2) == 'c') {
					nr++;
				}	
			}
			System.out.println(nr);
			break;
		case 4:
			int k = 0;
			for(int i= 0; i < word.length() / 2; i++) {
				if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					k = 1;
					break;
				}
			}
			if(k == 0) {
				System.out.println("Cuvantul este palindrom.");
			}
			else {
				System.out.println("Cuvantul NU este palindrom.");
			}
			break;
		case 5:
			for(int i= 0; i < word.length(); i = i + 2) {
				word = word.replace( word.charAt(i), '~');
			}
			int i = 0;
			while(i < word.length()) {
				char ch = word.charAt(i);
				if(ch == '~') {
					String x = word.substring(0,i);			
					String y = word.substring(i+1);
					word = x+y;
				}
				else {
					i++;
				}
			}
			System.out.println(word);
			break;
		}
	}
}
