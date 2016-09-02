package google_Interview_Practice.Array;
//n non-negative Integers
//width of each bar is 1
//how much water able to trap after raining 
//[0,1,0,2,1,0,1,3,2,1,2,1] return 6.
public class TrippingWater {
	public int trippingWater(int[] height){
	int result = 0; // initial result should be 0.
	if(height== null || height.length <= 2){
		return result;
	}
	//left and right
	int left[] = new int[height.length]; // for the left
	int right[] = new int[height.length]; // for the right
	//scan from left to right
	int max = height[0]; //max 
	left[0] = height[0]; //
	for(int i = 1 ; i < height.length ;i++){
		if(height[i] < max){
			left[i] = max;
		}else{
			left[i] = height[i];
			max = height[i];
		}
	}
	
	max = height[height.length - 1];
		right[height.length - 1] = height[height.length - 1];
		for(int i = height.length-2 ; i >=0 ;i--){
			if(height[i] < max){
				right[i] = max;
			}else{
				right[i] = height[i];
				max = height[i];
			}
		}
		
	for(int i = 0;i <height.length ; i++){
		result+= Math.min(left[i],right[i]) - height[i];
	}
	return result;
	}
}