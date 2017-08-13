package pcsettingfirstpj;

import java.io.*; 
import java.util.*;
public class scanf {

	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String Input = buf.readLine();
        String input = Input.toLowerCase();
        System.out.println("type="+input);
        
		int len = input.length();
		Map<Character,Integer> count = new HashMap<Character,Integer>(Math.min(len,26));
		
		for (int i = 0; i < len; i++)
		{
		    char charAt = input.charAt(i);

		    if (!count.containsKey(charAt))
		    {
		        count.put(charAt, 1);
		    }
		    else
		    {
		        count.put(charAt, count.get(charAt) + 1);
		    }
		}

		System.out.println(count);
		    }
	}


