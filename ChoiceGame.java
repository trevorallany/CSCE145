/*
 * Written by Trevor Yarborough
 */

import java.util.Scanner;
public class ChoiceGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//setting up a scanner 
		
		System.out.println("Welcome to Zombie Apocalypse Simulator!!!"
				+ "\ntry to survive the outbreak!");
					System.out.println("You're driving home from a long day at work. You are so tired and very ready for the nap you are going to take when you get home."
							+ "\nAs you daydream about the sleep you are going to have, you notice a traffic jam up ahead. "
							+ "\nYou reluctantly pull up to the jam and prepare for a long wait ahead. You sigh to yourself as you put your car into park."
							+ "\nSuddenly, you hear a loud bang come from the herd of cars in front of you. You see people getting out of their cars and looking ahead."
							+ "\nWhat do you do?"
							+ "\nGet out or stay put?");
					
		String choice1a = keyboard.nextLine();
		if (choice1a.equalsIgnoreCase("Stay put"))
		{
			System.out.print("You stay put, and you see a huge group of 10 or so zombies emerge from the woods and start attacking people."
					+ "\nAs you think of what to do, a car explodes in front of you, knocking you out. When you wake up, "
					+ "\nyou notice that your car is surrounded by zombies. So many zombies are around your car that you can't even see past them."
					+ "\nDo you: Hide, or fight?");
			String HorF = keyboard.nextLine();
			if (HorF.equalsIgnoreCase("Hide"))
			{
				System.out.println("You hide in your car for hours. You hide for so long that the sun goes down, and it is night outside. "
													+ "\nRealizing that you have to leave this car eventually, you slowly and carefully peak out of the car and see that the horde is gone."
													+ "\nYou get out and look around, and you notice a light coming from far away. You walk towards it for a while until you find the source."
													+ "\nIt is the city. The city is on fire. As you gaze in awe at the burning city, you slowly begin to realize that everything you know"
													+ "\nis about to change forever.");
				System.exit(0);
			}
			else if (HorF.equalsIgnoreCase("fight"))
			{
				System.out.println("You look around the car for something to fight them all off with. You find an old golf club that you have been saving"
													+ "\for a fun weekend trip with the boys, and bust the sun roof out and stand on the roof of the car."
													+ "\n      CONGRATULATIONS!!!!!     "
													+ "\nYOU'VE UNLOCKED THE SECRET MINI GAME!!!"
													+ "\nPlease enter a number between 1 and 100 to see if you survive this encounter:");
			}
			int survive = keyboard.nextInt();
										
			if (survive >= 90)
			{
				System.out.print("You keep hitting and hitting until there are no more zombie noises. You swing for so long that the sun goes down."
													+ "\nYou look around, and you notice a light coming from far away. You walk towards it for a while until you find the source."
													+ "\nIt is the city. The city is on fire. As you gaze in awe at the burning city, you slowly begin to realize that everything you know"
													+ "\nis about to change forever.");
				System.exit(0);
			}
			else if (survive < 90)
			{
				System.out.print("As you go to swing, one of the zombies grabs your club and they use their combined force to pull you into the crowd."
													+ "\nThe last thing you remember is thinking about how bad of an idea this all was.");
				System.exit(0);
			}
		}
		if (choice1a.equalsIgnoreCase("Get out"))
		{
			System.out.println("You get out of your car, and look up the busy highway. You see some thick black smoke very far down the road."
					+ "\nJust as you see this, you hear faint screaming coming from down the road. Suddenly, from the woods, you see a large group of "
					+ "\nthose new infected people they call \"zombies\" emerge. They slowly shamble towards you and you see them start attacking people. "
					+ "\nwhat do you do?"
					+ "\nRun or Help?");
					
			String choice1b = keyboard.nextLine();
			if (choice1b.equalsIgnoreCase("Run"))
			{
				System.out.println("You turn around and get back into your car. You can see many other people around you follow suit."
					+ "\nYou turn the key, start the car, and drive as quickly as you can away from the scene. Once you get to the clearing where you can see the city,"
					+ "\nyou notice that the city is on fire. You then watch as bombs fall on the city, destroying everything you once called home. "
					+ "\nYou then realize that everything you have ever known is about to change.");
				System.exit(0);
			}
			else if (choice1b.equalsIgnoreCase("Help"))
			{ 
				System.out.println("You run over to an old man who is being rushed by many different zombies."
					+ "\nQUICK! YOU NEED TO ASSESS THE SITUATION! How many zombies are there?");
			}
			int zombNum = keyboard.nextInt();
			keyboard.nextLine();
							
			if (zombNum >=1 && zombNum<=4)
			{
				System.out.println("YES! THERE ARE "+zombNum+" zombies! You run over to your car, start the engine, and run into them, taking them out and saving the man."
					+ "\nWould you like to talk to the man? Yes or No?");
				String choice1c = keyboard.nextLine();
				
				if (choice1c.equalsIgnoreCase("Yes"))
				{
					System.out.println("You realize that the man is injured. You can see a bite mark, and as you notice the bite, you see a man come over to you"
							+ "\nand he says that this man won't make it longer with this bite. He takes the old man out, and looks to you and asks if you're with him "
							+ "\nor against him. You realize your life is about to change forever.");
				}
				if(choice1c.equalsIgnoreCase("No"))
				{
					System.out.println("You begin to run far away from the crowd of people forming around the man. You run for so long that it gets dark, and you come to a "
							+ "\nclearing.You come to a clearing in the woods you're in, and you notice that you can see the whole city from here. As you gaze in awe at the"
							+ "\nskyline, you see a plane fly over the city, followed by a bright flash and a strong gust of wind. You realize that your life is about to "
							+ "\nchange forever.");
				}
			}
			else if (zombNum<1)
			{
				System.out.println("You run over to the man, seeing that there are " +zombNum +" zombies, and while asking him if he is okay, you feel a stinging pain "
					+ "\non the back of your neck. You feel a person standing behind you and when you turn around you realize that you have been bitten."
					+ "\nJust as you realize this, a man comes up and pushes the zombie away. He asks you if you're okay, and when you tell him that you've been bitten,"
					+ "\n he asks you to follow him away from the people. You begin to realize that your life is about to change in the worst way possible.");
				System.exit(0);
			}
			else if (zombNum > 4)
			{
				System.out.println("Seeing that there are "+zombNum+" zombies, you realize that you cannot handle all of these by yourself. Knowing this, you can;"
					+ "\nGet help, Try to fight, or Run");
			}
			
			String choice1d = keyboard.nextLine();
									
			if (choice1d.equalsIgnoreCase("Get help"))
			{
				System.out.println("You run to try and find someone who can help you. You run across a burly, bearded man who sees you're distressed and offers help."
					+ "\nHe goes over to take care of the many zombies, and when you return, you realize that there was only 1 zombie, and you could've saved the man. "
					+ "\nThe man offers you to join his group."
					+ "\nDo you accept? Yes or No?");
									
											
				String choiceYoN = keyboard.nextLine();
				if (choiceYoN.equalsIgnoreCase("Yes"))
				{
					System.out.println("He brings you to a large group of people, and you meet a nice woman who tells you about how they plan on dropping bombs on the city"
						+ "\nin order to keep the virus from spreading, and that's why they told all of us to leave town. Confused and skeptical, you blow it off, until you hear a loud rumbling noise."
						+ "\nYou rush over to a clearing and see that she was, in fact, correct as you look out upon the city you once lived in, completely flattened. "
						+ "\nYou begin to realize that your life is going to change completely.");
					System.exit(0);
				}
				else if (choiceYoN.equalsIgnoreCase("No"))
				{
					System.out.println("You politely decline, and then turn around and get back into your car."
						+ "\nYou turn the key, start the car, and drive as quickly as you can away from the scene. Once you get to the clearing where you can see the city,"
						+ "\nyou notice that the city is on fire. You then watch as bombs fall on the city, destroying everything you once called home."
						+ "\nYou then realize that everything you have ever known is about to change.");
					System.exit(0);
				}
			}
			
			else if (choice1d.equalsIgnoreCase("Try to fight"))
			{
					System.out.println("You run at the zombies, and realize that there was way less than you had originally thought. "
						+ "\nUpon further inspection, you see that there is only one zombie. You easily take it out, and then realize that the man is hurt. "
						+ "\nYou see that he has been bitten. As you think of what to do, a man comes over and sees the bite. He tells you that the only way to "
						+ "\ntake care of it is to take him out. You then watch in horror as he takes the old man out. He then turns to you and asks you to join his group."
						+ "\nDo you accept? Yes or No?");
										
					String choiceYoN2 = keyboard.nextLine();
					if (choiceYoN2.equalsIgnoreCase("Yes"))
					{
						System.out.println("He brings you to a large group of people, and you meet a nice woman who tells you about how they plan on dropping bombs on the city"
													+ "\nin order to keep the virus from spreading, and that's why they told all of us to leave town. Confused and skeptical, you blow it off, until you hear a loud rumbling noise."
													+ "\nYou rush over to a clearing and see that she was, in fact, correct as you look out upon the city you once lived in, completely flattened. "
													+ "\nYou begin to realize that your life is going to change completely.");
						System.exit(0);
					}
					else if (choiceYoN2.equalsIgnoreCase("No"))
					{
						System.out.println("You politely decline, and then turn around and get back into your car."
													+ "\nYou turn the key, start the car, and drive as quickly as you can away from the scene. Once you get to the clearing where you can see the city,"
													+ "\nyou notice that the city is on fire. You then watch as bombs fall on the city, destroying everything you once called home."
													+ "\nYou then realize that everything you have ever known is about to change.");
						System.exit(0);
					}
			}
			if (choice1d.equalsIgnoreCase("Run"))
			{
				System.out.println("You turn around and get back into your car. You can see many other people around you follow suit."
													+ "\nYou turn the key, start the car, and drive as quickly as you can away from the scene. Once you get to the clearing where you can see the city,"
													+ "\nyou notice that the city is on fire. You then watch as bombs fall on the city, destroying everything you once called home."
													+ "\nYou then realize that everything you have ever known is about to change.");
				System.exit(0);
			}
			
		}
	}
}