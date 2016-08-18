//Squrt(x)

class Solution{
	

		public int sqrt(int x){

			int start  = 1;
			int end    = x;

			while(start + 1 < end){

				int mid = (start + end)/2;

				if(mid * mid < x){

					start = mid;
				}if(mid*mid == x){

					start = mid;
				}
				if(mid * mid > x){
					end = mid;
				}

			}


			if(end*end < =x){

				return (int)mid;
			}
			return (int)start;
		}
}