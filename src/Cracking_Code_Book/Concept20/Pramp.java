//no worries man!
//world count engine
// I propose to first seperate the string using space seperator
// use HashMap ? <String,Integer> that's it
//sort it through only occurence right ?
//why its 
//Oh words plus occurence 
//I will create struct with String , Integer 
class Pramp {
   
   class Word implements Comparable { //Is it make sense right?
       
      String string;
      int occurence;
      
     private word(String string, int occurence){
        
        this.string = string
         this.occurence = occurence  
        
        
     }
      
      //gotcha
      .//I guess this through we could sort the occurence , the same way for the string , words? should be 
         //sorted right 
         //yup
         
         
         
         //But compare willl basically sort the occurence , but equals would sort the words after...really?
         //yeah
         // Object Word -> String, Integer
         // Sort objects by the integer
         //Yup makes sense ..thanks man1
         //...equals method ? //i', m here
      @override //Not sure exact implementation //is it correct
      public int compareTo(Object o){ // is it 
         
         if( this.occurence < (Word)o.getOccurence()){
            return -1;
         }else if(this.occurence >(Word)o.getOccurence()){
            return 1;
         }else{
            return 0;
         }
        //how do I compare ok 
         Word first = new Word("hi",2);  --> {"hi", 2}
         Word another= new Word("bye", 1) --> {"bye", 1}
         first.compareTo(another); -> 1 //make sense
         
         //difference in equals then ? //it only wokd in string right?
    
            //I got some example ..may makes sense?
            public int compareTo(Fruit compareFruit) {

		int compareQuantity = ((Fruit) compareFruit).getQuantity();

		//ascending order
		return this.quantity - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}
         
      }
      
         
      
   }
   
   
   
   ///
   public static ArrayList<Word> solution(String str){
      
      //Define ArrayList for the output does it make sendse, I will loop over the values ..and keep it here
      ArrayList<Word> target = new ArrayList<Word>();
      
      //Map 
      Map<String,Integer> map = new HashMap<String,Integer>();
      
      //Seperate the String using space seperator
     
      if(args == null || args.length() == 0){
         return target; 
      }
      
      //I'm not sure...
      
      // take care of case //yup
      // and punctuation
    String[] string =  str.replaceAll("[^a-zA-Z ]", "").tolowerCase().split(" "); //yup//awesome
       
      for(int i = 0 ; i < string.length ; i++){
         
         if(map.containsKey(string[i])){
            
            map.put(string[i],map.get()+1);
            
         }else{
            
           map.put(string[i],1);
         }
         
         
      }
      
      //loop over the  //but here...if return map 
      //Need to bind the data in struct class
        //set occurence and with string ...
      
      
      
      for(String str: map.keySet()) {
      
         //Should I need to create arraylist
         //  understood...
         
         int value = map.get(str); //how to get the value through //right> //thanks
       
         target.add(new Word(str,value)); //does it make sense? yeah
     //yup man  
      }
      
      //what do you mean?
      
      //not sorted
      //okay got 
      
      ///
     //it will already sorted I guess...
      //yes
      
      return target; 
      
     //check line 60 
      
      
      //could help me out figure out compareTo still something missing I guess 
      
      
      
   }
   
   //Hey I'm leaving man!
  // bye
   
   public static void main(String[] args) {
      
      
      String pramp = "Practice Makes Perfect";
      System.out.println(pramp);
   }
}