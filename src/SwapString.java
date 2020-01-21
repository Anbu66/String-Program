
public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "def";

		s1 = s1.concat(s2);
		System.out.println("s1="+s1);
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}

}
