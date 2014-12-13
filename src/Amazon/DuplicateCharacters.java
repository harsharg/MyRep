package Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class DuplicateCharacters {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s= "asashjhfhdkhkhdhkabcbjcbjaa";
		
		char[] characters = s.toCharArray();
		HashMap<Character,Integer>  hmap = new HashMap<Character,Integer>();
		
		for(Character ch:characters)
		{
			
            if(hmap.containsKey(ch))
            {
            	hmap.put(ch,hmap.get(ch) + 1);
            }
            else
            {
            	hmap.put(ch, 1);
            }
			
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = hmap.entrySet();
        System.out.printf("List of duplicate characters in String '5%s' %n", s);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }

	}

}
