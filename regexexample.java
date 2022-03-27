import java.util.regex.Pattern;

public class regexexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("____RegularExpression_______");
		  System.out.println(Pattern.matches("[xyz]", "sorav"));//not start with xyz so return false
		  System.out.println(Pattern.matches("[xyz]", "xyz"));
		  System.out.println(Pattern.matches("[xyz]", "xgrdghh"));
		  System.out.println(Pattern.matches("[xyz]", "z"));//true as z comes only one
		  System.out.println("? Quantifiers");//means either ones or not
		  System.out.println(Pattern.matches("[ayz]?", "z"));
		  System.out.println(Pattern.matches("[xyz]?", "zomato"));
		  System.out.println(Pattern.matches("[xyz]?", "y"));
		  System.out.println("+ Quantifiers");//means ones or more times
		  System.out.println(Pattern.matches("[ayz]+", "z"));
		  System.out.println(Pattern.matches("[xyz]+", "zomato"));
		  System.out.println(Pattern.matches("[xyz]+", "yyxzz"));//true as x,y,z more than one times
		  System.out.println("* Quantifiers");//means x,y,z -zero or more times
		  System.out.println(Pattern.matches("[xyz]*", "z"));
		  System.out.println(Pattern.matches("[xyz]*", "sorav"));
		  System.out.println(Pattern.matches("[xyz]*", "yy"));

	}
	

}
