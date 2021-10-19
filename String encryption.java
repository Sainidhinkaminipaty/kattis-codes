import java.util.*;
import java.lang.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		HashMap<Character, String> hm = new HashMap<>();
		
		hm.put('a', "@");
		hm.put('b', "8");
		hm.put('c', "(");
		hm.put('d', "|)");
		hm.put('e', "3");
		hm.put('f', "#");
		hm.put('g', "6");
		hm.put('h', "[-]");
		hm.put('i', "|");
		hm.put('j', "_|");
		hm.put('k', "|<");
		hm.put('l', "1");
		hm.put('m', "[]\\/[]");
		hm.put('n', "[]\\[]");
		hm.put('o', "0");
		hm.put('p', "|D");
		hm.put('q', "(,)");
		hm.put('r', "|Z");
		hm.put('s', "$");
		hm.put('t', "']['");
		hm.put('u', "|_|");
		hm.put('v', "\\/");
		hm.put('w', "\\/\\/");
		hm.put('x', "}{");
		hm.put('y', "`/");
		hm.put('z', "2");
		String line = sc.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i)>= 'a' && line.charAt(i)<= 'z')
				sb.append(hm.get(line.charAt(i)));
			else{
				sb.append(line.charAt(i));
			}
		}
		System.out.println(sb);
	}
	

}
