import java.util.Scanner;

public class UserInput {

	private static String searchString;
	private static String releaseTag;
	private static Scanner user_input = new Scanner(System.in);
	
	public String getUserInput_searchString(){
		System.out.print("Enter the search string: ");
		searchString = user_input.next();
		
		return searchString;
		
	}
	
	public String getUserInput_releaseTag(){
		System.out.print("Enter the release tag: ");
		releaseTag = user_input.next();
		
		return releaseTag;
		
	}
}
