import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Algorithm to check if a string has all unique characters
 */

public class UniqueElements {
	public static String elementToBeChecked;
	//
	public UniqueElements(){
		elementToBeChecked = new String();
	}
	//
	public static void main(String[] args){
		elementToBeChecked = "SHARAD";
		Boolean answer = getUniqueElements();
		
		if(answer){
			System.out.println("The string has unique elements");
		}
		else 
			System.out.println("The string has duplicates");
	}
	//
	public static boolean getUniqueElements(){
		HashSet s = new HashSet();
		Boolean result = true;
		for(char ch:elementToBeChecked.toCharArray()){
			 result = s.add(ch);
			 if(result == false){
					break;
				}
		}
		return result;
	}
}
