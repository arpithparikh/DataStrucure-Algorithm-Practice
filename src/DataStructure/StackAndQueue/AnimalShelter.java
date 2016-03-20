// An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out"
// basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select
// whether they would prefer a dog or a cat(and will receive the oldest animal of that type). They cannot select which specific animal thet would
// like. Create the data structures to maintain this system and implement operation such as an enqueue, dequeueAny, dequeueDog and dequeueCats. You
// may use built-in LinkedList data structure

//Reference :https://github.com/JamesJi9277/Interview/blob/master/CC150/CH3%20Stacks%26Queues/3.7.java
package DataStructure.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

//Animal class.
class Animal{

	//timeStamp and type
	private int timeStamp;
	
	private String type;
	
	//Constructor Animal
	public Animal(int val,String animalType)
	{
		setTimeStamp(val);
		setType(animalType);
	}

	public int getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
class Dog extends Animal{

	public Dog(int val, String animalType) {
		super(val, animalType);
		// TODO Auto-generated constructor stub
	}
}

class Cat extends Animal{

	public Cat(int val, String animalType) {
		super(val, animalType);
		// TODO Auto-generated constructor stub
	}
}

public class AnimalShelter {
	
	//Queue of dogs and cats
	Queue<Dog> dogs;
	
	Queue<Cat> cats;
	
	
	public AnimalShelter()
	{
		dogs=new LinkedList<Dog>();
		cats=new LinkedList<Cat>();
	}

	public void enQueue(Animal animal)
	{
		if(animal.getType().equals("Dog"))
		{
			dogs.offer((Dog)animal);
		}
		else if(animal.getType().equals("Cat"))
		{
			cats.offer((Cat)animal);
		}
	}
	
	public Animal dequeueAny()
	{
		//Condition 1: size()==0 and size()!=0
		if(dogs.size()==0 && cats.size()!=0)
			return cats.poll();
		
		//Condition 2: size()==0 and size()!=0
		if(cats.size()==0 && dogs.size()!=0)
			return dogs.poll();
				
		//Condition 3: size()!=0 and size()!=0
		if(cats.size()!=0 && dogs.size()!=0)
			return dogs.peek().getTimeStamp()> cats.peek().getTimeStamp()? cats.poll():dogs.poll();
	
		return null;
	}
	
	//Retrieves and removes the head of this queue, or returns null if this queue is empty.
	public Dog dequeueDog()
	{
		if(dogs.size()!=0)
			return dogs.poll();
		
		return null;
	}
	
	//Retrieves and removes the head of this queue, or returns null if this queue is empty.
	public Cat dequeueCat()
	{
		if(cats.size()!=0)
			return cats.poll();
		
		return null;
	}
	
	public static void main(String args[])
	{
		//TO DO
	}
	
}
