
public class CheckStringgasdigitsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="12a345";
		try
		{
			int b=Integer.parseInt(a);
			System.out.println("Yes");
		}
		catch(Exception e)
		{
			System.out.println("No");
		}
	}

}
