import java.util.Arrays;

public class Check2StringhasSameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="anbu";
		String b="nbua";
		char[] a1 = a.toCharArray();
		Arrays.sort(a1);
		System.out.println(a1);
		
		char[] b1=b.toCharArray();
		Arrays.sort(b1);
		System.out.println(b1);
		
		if(Arrays.equals(a1, b1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	
		//System.out.println(a2.equals(b2));
	}
}
