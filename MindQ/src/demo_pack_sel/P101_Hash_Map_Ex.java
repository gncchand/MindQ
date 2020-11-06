package demo_pack_sel;

import java.util.HashMap;
import java.util.Map.Entry;

public class P101_Hash_Map_Ex {

	public static void main(String[] args) {
		HashMap <String,String>h=new HashMap<String,String>();
		h.put("1818", "Mr.");
		h.put("3666", "Naveen");
		h.put("6584", "Chand");
		h.put("6888", "Gaddipati");
		
		for(Entry<String,String>data : h.entrySet())
		{
			System.out.println("key is ... : "+data.getKey()+" and value is ... : "+data.getValue());
		}
	}
}
