package String_Char;

public class StringCharExample {

	public static void main(String[] args) {

		String ssn = "010624-4330123";
		
		//7번째 인덱스의 숫자를 구별함
		char sex = ssn.charAt(7);

		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("That is man");
			break;
		case '2' :
		case '4' :
			System.out.println("That is woman");
			break;
					
		}
	}

}
