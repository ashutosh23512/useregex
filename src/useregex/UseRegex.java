package useregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UseRegex {

		public static void main(String[] args) {
		
			System.out.println("Enter First Name");
			Scanner s=new Scanner(System.in);
			String fname=s.nextLine();
			Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");		
			Matcher matcher=pattern.matcher(fname);
			
			boolean matchFound=matcher.find();
			if(matchFound)
			{
				System.out.println("Matched");
			}
			else
			System.out.println("Not Matched");
			}
		

		}





