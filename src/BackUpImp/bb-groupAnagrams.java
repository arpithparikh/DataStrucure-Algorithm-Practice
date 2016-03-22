public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(strs == null || strs.length == 0) {
        	return res;
        }
        Arrays.sort(strs);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++) {
        	String str = strs[i];
        	String temp = sort(str);
        	if(map.containsKey(temp)) {
        		List<String> list = map.get(temp);
        		list.add(str);
        		map.put(temp, list);
        	}
        	else {
        		List<String> list = new ArrayList<String>();
        		list.add(str);
        		map.put(temp, list);
        	}
        }
        for(String str : map.keySet()) {
        	res.add(map.get(str));
        }
        return res;
    }
    private String sort(String str) {
    	char[] array = str.toCharArray();
    	StringBuffer sb = new StringBuffer();
    	Arrays.sort(array);
    	for(int i = 0; i < array.length; i++) {
    		sb.append(array[i]);
    	}
    	return sb.toString();
    }
}