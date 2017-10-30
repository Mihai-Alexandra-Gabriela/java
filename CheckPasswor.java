import java.util.*;

public class CheckPasswor {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String password = "java";
		String userInput;
		System.out.println("Care e parola?");
		userInput = s.next();
		
		System.out.println("Ai tastat: ");
		System.out.println(userInput);
		System.out.println("Dar parola este: ");	
		System.out.println(password);
		
		if(password == userInput){
			System.out.println("Ai trecut mai departe!"); 
		}
		else{
			System.out.println("NU ai trecut mai departe!");
		}
	}
}
