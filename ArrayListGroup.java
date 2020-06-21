import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListGroup{
	public static void main(String[] args){
		String[] arrs = {"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee"};
		List<String> input = new ArrayList<String>();
		for(String j : arrs){
			input.add(j);
		}

		System.out.println(groupString(input));

	}

	public static List<String>[] groupString(List<String> input) {
		List<String> first = new ArrayList<String>();
		List<String> second = new ArrayList<String>();
		List<String> third = new ArrayList<String>();
		List<String>[] container = new List<String>[3];
		

		for(String i : input){
			if(i.charAt(0)=='a'){
				first.add(i);
			}else if(i.charAt(0)=='b'){
				second.add(i);
			}else{
				third.add(i);
			}
		}

		
		container[0] = first;
		container[1] = second;
		container[2] = third;

		return container;
		//System.out.println(first);
		//System.out.println(second);
		//System.out.println(third);
	}

}