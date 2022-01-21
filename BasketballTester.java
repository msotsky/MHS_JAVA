/*
*Max
*Mr.Pope
*April 20 2018
*j9 Q1
*This program display play by play action of a basketball game
*/
class Player //declare variables
{

private String name;
private String team;
private int number;
//================================================== NAME
	public void setName(String a)
	{
	name = a;
	}
	public String getName()
	{
	return name;
	}
//================================================== NUMBER
	public void setNumber(int b)
	{
	number = b;
	}
	public int getNumber()
	{
	return number;
	}
//================================================== TEAM
	public void setTeam(String c)
	{
	team = c;
	}
	public String getTeam()
	{
	return team;
	}
//==================================================

	
	public void dribble()	//method
	{
	System.out.println(name + " number " + number + " who is on team " +team +" is dribbling.");
	}
	
	public void shoot()	//method
	{
	System.out.println(name + " number " + number + " who is on team " +team  +" is shooting.");
	}

}
public class BasketballTester //the main class whose purpose is to test class 2 and 3 
{
	
	public static void main (String[] args)
	{								//start of program

	//constructs a player also known as creating an instance of the Basketball class
	
	Player player1 = new Player();
		player1.setName("Max");
		player1.setNumber(17);
		player1.setTeam("Red Team");
		player1.dribble();

	Player player2 = new Player();
		player2.setName("Gabe");
		player2.setNumber(93);
		player2.setTeam("Red Team");
		player2.dribble();

	Player player3 = new Player();
		player3.setName("Jon");
		player3.setNumber(23);
		player3.setTeam("Blue Team");
		player3.shoot();

	Player player4 = new Player();
		player4.setName("Andrew");
		player4.setNumber(37);
		player4.setTeam("Blue Team");
		player4.dribble();

	}
	
}

