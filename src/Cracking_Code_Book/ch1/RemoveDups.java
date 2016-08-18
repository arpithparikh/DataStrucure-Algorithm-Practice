//Remove the Duplicates from the String 
public class RemoveDups{
		public static void removerDups(char [] str){
			if(str == null || str.length < 2){
				return;
			}
			int tail = 1;
			for(int i = 1 ;i < str.length ; ++i){
				int j;
				for( j = 0; j < tail ; ++j){

					if(str[i]==str[j]){
					break;
					}
				}
				if(j == tail){
				str[tail] = str[i];
				++ tail;
				}
			}
				str[tail] = 0;
		}
}