/*Computer science 120
*Mr.Pope
*Max
*2018 - 06 - 04
*this program adds all characters of my name and displays the number of characters
*/


class Partone
{
 public static void main (String[]args)
   {
	String S1 = ("Max"); //my first name
	String S2 = ("Sotsky"); //my last name
	int num;
//i don't have a middle name
	num = ( (S1.length() ) + ( S2.length() ) ); //determining length of both first and last and adding them together
	
	System.out.println("The total number of characters in my name is:" +num); //diplaying number of characters = 9
   }
}