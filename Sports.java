package com.jdbc;


//Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball,
//and Rugby. Override the play() method in each subclass to play a specific statement for each sport.


//Sports.java
class Sport {
 public void play() {
     System.out.println("Playing a sport...");
 }
}

//Football.java
class Football extends Sport {
 public void play() {
     System.out.println("Playing football...");
 }
}

//Basketball
class Basketball extends Sport {
	 public void play() {
	     System.out.println("Playing basketball...");
	 }
	}
//Rugby.java

class Rugby extends Sport {
 public void play() {
     System.out.println("Playing rugby...");
 }
}



public class Sports {

	public static void main(String[] args) {
		
		Sport sports = new Sport();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
	}

}
