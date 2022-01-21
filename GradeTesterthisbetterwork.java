/*
*Max
*Mr.Pope
*April 26 2018
*j10 Q1
*This program gathers all marks and calculates the average
*/
import java.io.*;
class Student
{

String name;
double quizzes;
int midTerm;
int exam;
double grade;
String qL,mL,eL,gL;
private String letterGrade;
private double finalGrade;
	// student constructor /parameters of a student object
Student(String studentName, double studentQuizzes, int studentMid, int studentExam,double studentGrade)
{
	//assigning variables
	name = studentName;
	quizzes = studentQuizzes;
	midTerm = studentMid;
	exam = studentExam;
	grade = studentGrade;

}
public void setGrade(double a)
{
	finalGrade = a;
}
	public String getGrade()
	{
		if (finalGrade >= 90)
			return "A";
		else if ((90 > finalGrade) && (finalGrade >= 80))
			return "B";
		else if ((80 > finalGrade) && (finalGrade >= 70))
			return "C";
		else if ((70 > finalGrade) && (finalGrade >= 60))
			return "D";
		else
			return "F";
	}

	public void numericScore() //to display the numeric mark
	{
	System.out.println(name + "'s quiz avg. is " +quizzes +"%");
	System.out.println(name + "'s midterm avg. is " +midTerm +"%");
	System.out.println(name + "'s exam avg. is " +exam +"%");
	System.out.println(name + "'s grade is " +grade +"%");
	}

	public void letterScore()//to display the letter grade
	{
	System.out.println(name + "'s quiz avg. is " +qL);
	System.out.println(name + "'s midterm avg. is " +mL);
	System.out.println(name + "'s exam avg. is " +eL);
	System.out.println(name + "'s grade is " +gL);
	}
	
}
public class GradeTesterthisbetterwork //main
{
	public static void main (String[] args)throws IOException
	{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader (inStream);
	
	String inData;
	int num;
	String sName;
	sName = "Unknown";
	//user selects a student
	System.out.println("__YOUR STUDENTS__");
	System.out.println("	1)Max");
	System.out.println("	2)Jon");
	System.out.println("	3)Andrew");
	System.out.println("	4)Justice");
	System.out.println("	5)Lucas");
	System.out.println("Type the corresponding number beside the name of a student to input marks");
	inData = stdin.readLine();
	num = Integer.parseInt(inData);
	if (num == 1){
		sName = "Max";}
	else if (num == 2){
		sName = "Jon";}
	else if (num == 3){
		sName = "Andrew";}
	else if (num == 4){
		sName = "Justice";}
	else if (num == 5){
		sName = "Lucas";}	
				
	double quizTotal;
	quizTotal = 0.0;
	
	int amount;
	amount = 0;
	
	int quizScore;
	quizScore = 0;
	
	
	if (amount == 0)
	{
	System.out.println("Enter amount of point " +sName +" got on his first quizz that is out of 10.");
	inData = stdin.readLine();
	quizScore = Integer.parseInt(inData);
	++amount;
	quizTotal += quizScore;
		}
	
	do {
	System.out.println("Enter the amount of point" +sName +" got which is out of 10.");
	inData = stdin.readLine();
	quizScore = Integer.parseInt(inData);
	++amount;
	quizTotal += quizScore;
	} while (amount < 5);
	
	double quizGrade;
	double quizhalf;
	quizGrade = (quizTotal * 2);
	//quizTotal = (quizTotal * 2);
	
	int midScore;
	System.out.println("Enter the amount of points " +sName +" Scored on his midterm which is out of 100.");
	inData = stdin.readLine();
	midScore = Integer.parseInt(inData);

	
	int examScore;
	System.out.println("Enter the amount of points" +sName +" Scored on his exam which is out of 100.");
	inData = stdin.readLine();
	examScore = Integer.parseInt(inData);

	double examAndMid;
	double sGrade;
	
	examAndMid = (((double) (midScore + examScore)) /200);
	
	examAndMid = (examAndMid * 50);
	
	sGrade = (examAndMid + quizTotal); 		//this was quizgrade

	
	Student max = new Student(sName,quizGrade,midScore,examScore,sGrade);
	Student jon = new Student(sName,quizGrade,midScore,examScore,sGrade);
	Student andrew = new Student(sName,quizGrade,midScore,examScore,sGrade);
	Student justice = new Student(sName,quizGrade,midScore,examScore,sGrade);
	Student lucas = new Student(sName,quizGrade,midScore,examScore,sGrade);
	
	if (sName.equals("Max"))
                {
		max.numericScore();
		max.setGrade(sGrade);
		System.out.println(sName +"'s letter grade is " + max.getGrade());
		}
			
	else if (sName.equals("Jon"))
                {
		jon.numericScore();
		jon.setGrade(sGrade);
		System.out.println(sName + "'s letter grade is " +jon.getGrade());
		}
		
	else if (sName.equals("Andrew"))
                {
		andrew.numericScore();
		andrew.setGrade(sGrade);
		System.out.println(sName + "'s letter grade is " +andrew.getGrade());
		}

	else if (sName.equals("Justice"))
                {
		justice.numericScore();
		justice.setGrade(sGrade);
		System.out.println(sName + "'s letter grade is " +justice.getGrade());
		}
		
	else if (sName.equals("Lucas"))
                {
		lucas.numericScore();
		lucas.setGrade(sGrade);
		System.out.println(sName + "'s letter grade is " +(lucas.getGrade()));
		}
     
	}
}
