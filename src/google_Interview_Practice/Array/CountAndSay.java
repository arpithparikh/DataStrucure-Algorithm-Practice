package google_Interview_Practice.Array;
public class CountAndSay { //Count And Say
		public String countandSay(int n){ //countAndSay
			if(n <= 0){ // n <= 0
				return null;
			}
			String result = "1"; //result
			int i = 1; //i = 1
			while(i < n){ // i < n
				StringBuilder sb = new StringBuilder(); //StringBuilder
				int count = 1; //count = 1
				for(int j = 1 ; j < result.length();j++){
					
					if(result.charAt(j) == result.charAt(j - 1)){
						count++;
					}else{
						sb.append(count);
						sb.append(result.charAt(j - 1));
						count = 1;
					}
				}				
				sb.append(count);
				sb.append(result.charAt(result.length() -1));
				result = sb.toString();
				i++;
			}
			return result;
		}
}