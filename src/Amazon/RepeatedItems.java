package Amazon;

import java.util.HashMap;

public class RepeatedItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "asdasdsa";
		for(int i=1;i<=s.length();i++)
		{
			HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
			char c = s.charAt(i);
			if(map.containsKey(c))
			{
				int cnt = map.get(c);
				map.put(c,cnt++);
			}
			else
			{
				map.put(c, 1);
			}
			

			System.out.println(map);
		}

	}

}
