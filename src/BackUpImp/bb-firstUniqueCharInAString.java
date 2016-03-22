Find the first unique char in a string and Analysis of runtime and different data structure options
LinkedHashSet maintains a linked list of the entries in the set
两种数据结构可以做，一个是hashmap遍历两次，时间O2n，空间On，一个是linkedhashset + map，遍历一次，时间On
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class findFirstUnique {
	public char find(String s) {
		if(s == null || s.length() == 0) {
			return (Character) null;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return s.charAt(i);
			}
		}
		return (Character) null;
	}
	public char find1(String s) {
		if(s == null || s.length() == 0) {
			return (Character)null;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				set.remove(c);
			}
			else {
				map.put(c, 1);
				set.add(c);
			}
		}
		Iterator<Character> it = set.iterator();
		if(it.hasNext()) {
			return it.next();
		}
		return (Character)null;
	}
	public static void main(String[] args) {
		findFirstUnique f = new findFirstUnique();
		String s = "eceba";
		System.out.println("The result is: " + f.find(s));
	}
}

A的ASCII是65，a的ASCII是97，新数组长度是26 * 2 + 6 = 58；
public class Solution {
	public char findUnique(String s) {
		s = s.toLowerCase();
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(count[i] == 1) {
				return (char)('a' + count[i]);
			}
		}
		return null;
	}
}
