import java.util.HashMap;
import java.util.Map;

public class OccuranceString {

	public static void main(String[] args) {
		String a="abc abc abc abc";
		char[] ch = a.toCharArray();
		Map<String,Integer> mp=new HashMap();
		for (String c : ch) {
			if(mp.containsKey(c))
			{
				int count=mp.get(c);
				mp.put(c, count+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}
}