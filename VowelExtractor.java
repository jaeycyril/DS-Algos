import java.util.Scanner;

public class VowelExtractor{

	public static String vowelOnly(String input){

		String sb = input.toLowerCase();
		StringBuilder vowel_bag = new StringBuilder();

		for(int i = 0; i < sb.length(); i++){
			if((sb.charAt(i) == 'a') || (sb.charAt(i) == 'e') || (sb.charAt(i) == 'i') || (sb.charAt(i) == 'o') || (sb.charAt(i) == 'u') ){
				vowel_bag.append(sb.charAt(i));
			}
		}

		return vowel_bag.toString();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		String vowels = vowelOnly(word);
		
		if(vowels.length() > 0){
			System.out.println(vowels);
		}else{
			System.out.println("No vowels");
		}
		
	}
}