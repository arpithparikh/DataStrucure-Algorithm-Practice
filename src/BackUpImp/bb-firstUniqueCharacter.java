public class Solution {
	public char findFirstUnique(String s) {
		if(s == null || s.length() == 0) {
			return null;
		}
		if(s.length() == 1) {
			return s.charAt(0);
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integegr>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c) + 1);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return s.charAt(i);
			}
		}
		return null;
	}
}

S1 = "Hello", S2 = "Apple"，那么返回2，因为s1(2) = 'l' == s2(3)
public class Solution {
	public Character find(String s1, String s2) {
		//brute就是用双重循环过一遍，时间On2
		//优化，时间On空间On，hashmap查重
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < s1.length(); i++) {
			if(!set.contains(s1.charAt(i))) {
				set.add(s1.charAt(i));
			}
		}
		for(int i = 0; i < s2.length(); i++) {
			if(set.contains(s2.charAt(i))) {
				return s2.charAt(i);
			}
		}
		return null;
	}
}