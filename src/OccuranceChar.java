import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceChar {

	public static void main(String[] args) {
		String a="anbushenbagam";
		char[] ch = a.toCharArray();
		Map<Character,Integer> mp=new HashMap();
		for (char c : ch) {
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
		
		Set test=new HashSet();
		test.addAll(mp.keySet());
		System.out.println(test);
		
	}

}
