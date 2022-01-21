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
	// student constructor /parameters of a student object
	Student(String studentName, double studentQuizzes, int studentMid, int studentExam,double studentGrade, String studentLQ, String studentLM, String studentLE, String studentLG)	//parameters/specs
	{
	//assigning variables
	name = studentName;
	quizzes = studentQuizzes;
	midTerm = studentMid;
	exam = studentExam;
	grade = studentGrade;
	qL = studentLQ;
	mL = studentLM;
	eL = studentLE;
	gL = studentLG;
	
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
public class GradeTester //main
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


	String qLetter;
	qLetter = "Unknown";
	
	if (quizGrade >= 90)
		qLetter = "A";
	else if ((90 > quizGrade) && (quizGrade >= 80))
		qLetter = "B";
	else if ((80 > quizGrade) && (quizGrade >= 70))
		qLetter = "C";
	else if ((70 > quizGrade) && (quizGrade>= 60))
		qLetter = "D";
	else if (quizGrade < 60)
		qLetter = "F";
	
	String mLetter;
	mLetter = "Unknow";
	if (midScore >= 90)
		mLetter = "A";
	else if ((90 > midScore) && (midScore >= 80))
		mLetter = "B";
	else if ((80 > midScore) && (midScore >= 70))
		mLetter = "C";
	else if ((70 > midScore) && (midScore >= 60))
		mLetter = "D";
	else if (midScore < 60)
		mLetter = "F";

	String eLetter;
	eLetter = "Unknown";
	
	if (examScore >= 90)
		eLetter = "A";
	else if ((90 > examScore) && (examScore >= 80))
		eLetter = "B";
	else if ((80 > examScore) && (examScore >= 70))
		eLetter = "C";
	else if ((70 > examScore) && (examScore >= 60))
		eLetter = "D";
	else if (examScore < 60)
		eLetter = "F";
	
	String gLetter;
	gLetter = "Unknown";

	if (sGrade >= 90)
		gLetter = "A";
	else if ((90 > sGrade) && (sGrade >= 80))
		gLetter = "B";
	else if ((80 > sGrade) && (sGrade >= 70))
		gLetter = "C";
	else if ((70 > sGrade) && (sGrade >= 60))
		gLetter = "D";
	else if (sGrade < 60)
		gLetter = "F";
	
	Student max = new Student(sName,quizGrade,midScore,examScore,sGrade,qLetter,mLetter,eLetter,gLetter);
	Student jon = new Student(sName,quizGrade,midScore,examScore,sGrade,qLetter,mLetter,eLetter,gLetter);
	Student andrew = new Student(sName,quizGrade,midScore,examScore,sGrade,qLetter,mLetter,eLetter,gLetter);
	Student justice = new Student(sName,quizGrade,midScore,examScore,sGrade,qLetter,mLetter,eLetter,gLetter);
	Student lucas = new Student(sName,quizGrade,midScore,examScore,sGrade,qLetter,mLetter,eLetter,gLetter);
	
	if (sName.equals("Max"))
                {
		max.numericScore();
		max.letterScore();
		}
			
	else if (sName.equals("Jon"))
                {
		jon.numericScore();
		jon.letterScore();
		}
		
	else if (sName.equals("Andrew"))
               {
		andrew.numericScore();
		andrew.letterScore();
		}

	else if (sName.equals("Justice"))
                {
		justice.numericScore();
		justice.letterScore();
		}
		
	else if (sName.equals("Lucas"))
                {
		lucas.numericScore();
		lucas.letterScore();
		}
     
	}
}
