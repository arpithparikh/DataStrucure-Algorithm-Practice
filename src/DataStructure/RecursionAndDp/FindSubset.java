//Write a method to return all subset of set!
//There is no requirement to be ascending and descending sequence order results, so that we do not use Arrays.sort

package DataStructure.RecursionAndDp;

import java.util.ArrayList;

public class FindSubset {

	//
	public ArrayList<ArrayList<Integer>> subset(ArrayList<Integer>  s){
		
		//Initializing the list
		ArrayList<ArrayList<Integer>> arrayList=new ArrayList<ArrayList<Integer>>();
		
		//Precondition to check the list contains the null or size ==0 
		if(s==null || s.size()==0)
			return arrayList;
		
		//creating the temp new list.
		ArrayList<Integer> temp=new ArrayList<Integer>();
		
		//adding the arrayList
		arrayList.add(new ArrayList<Integer>(temp));
		
		//
		helper(s,arrayList,temp,0);
		
		return arrayList;
	}
	
	///to do------------------------------------------------------------------------
	/////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////
	//need to take care of this**************************************************************

	private void helper(ArrayList<Integer> s, ArrayList<ArrayList<Integer>> arrayList, ArrayList<Integer> temp, int index) {
		// TODO Auto-generated method stub
		
		//check the size of index
		if(index==s.size())
			return ;
		
		//
		for(int i=index;i<s.size();i++)
		{
			//
			temp.add(s.get(i));
			
			//
			helper(s, arrayList, temp, index);
			
			//
			arrayList.add(new ArrayList<Integer>(temp));
			
			//
			temp.remove(temp.size()-1);
		
		}
	}



}
