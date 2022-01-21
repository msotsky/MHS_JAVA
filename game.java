/*
*Maxime
*Human Services
*April 6 2018
*/
import java.io.*;
class Game
{
	public static void main (String[] args)throws IOException
	{
	
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader (inStream);
	
		int number =0;
		int next;
		int section;
		String inData;
		int points = 0; 
		int counter = 0;

		System.out.println("Please choose a subject you wish to explore");
		System.out.println("type the the number beside the subject you wish to explore:");
		System.out.println("1: Math");
		System.out.println("2: History");
		System.out.println("3: Disabilities");
			
		inData = stdin.readLine();
		section = Integer.parseInt(inData);
		//amount = Integer.parseInt(inData);
		


//*************************************************************************************************************************\\	
		if (section == 1 )
		{
			System.out.println("Welcome! We will be learning math today.");
			System.out.println("All questions are multiple choice.");
			System.out.println("To answer a question simply type the number attached to your answer.");
			System.out.println("To proceed with the qestions please enter 1 again!");
		}
		inData = stdin.readLine();
		next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		if (next == 1)
		{
			counter += 1;
			System.out.println("5 x 5");
			System.out.println("1)30");
			System.out.println("2)10");
			System.out.println("3)15");
			System.out.println("4)25");

			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if (number == 4)
				{
					System.out.println("Correct!");
					points = points + 1;
						}else{
						System.out.println("Incorrect");
						System.out.println("The answer is 4) 25");
						}	
				
							System.out.println("Press 1 for next question");		
							inData = stdin.readLine();
							next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		if (next == 1)
		{
			counter += 1;
			System.out.println("12 x 12");
			System.out.println("1)24");
			System.out.println("2)34");
			System.out.println("3)144");
			System.out.println("4)28");

			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if (number == 3)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 3) 144");
					}
			

						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\

		if(next == 1)
		{
			counter += 1;
			System.out.println("24 + 24");
			System.out.println("1)56");
			System.out.println("2)48");
			System.out.println("3)57");
			System.out.println("4)67");
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if(number == 2)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 2) 48");
					}
						
						System.out.println("Press 1 for next questions");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		
		if (next == 1)
		{
			counter += 1;
			System.out.println("30 + 32");
			System.out.println("1)52");
			System.out.println("2)3032");
			System.out.println("3)62");
			System.out.println("4)54");

			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if (number == 3)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 3) 62");
					}
						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		
		if (next == 1)
		{
			counter += 1;
			System.out.println("4 x 3");
			System.out.println("1)23");
			System.out.println("2)12");
			System.out.println("3)234");
			System.out.println("4)43");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}

				if (number == 2)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 2) 12");
					}
						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		
		if (next == 1)
		{
			counter += 1;
			System.out.println("12 + 23");
			System.out.println("1)45");
			System.out.println("2)55");
			System.out.println("3)23");
			System.out.println("4)35");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if(number == 4)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 4) 35");
				}
						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\

		if (next == 1)
		{
			counter += 1;
			System.out.println("23 - 4");
			System.out.println("1)19");
			System.out.println("2)45");
			System.out.println("3)76");
			System.out.println("4)13");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			
				if(number == 1)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 1) 19");
					}
						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\
		
		if (next ==1)
		{
			counter += 1;
			System.out.println("90 x 2");
			System.out.println("1)90");
			System.out.println("2)180");
			System.out.println("3)32");
			System.out.println("4)56");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if (number == 2)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 2) 180");
					}
						System.out.println("Press 1 for next question");
						inData = stdin.readLine();
						next = Integer.parseInt(inData);
//*************************************************************************************************************************\\

		if (next == 1)
		{
			counter += 1;
			System.out.println("43 - 15");
			System.out.println("1)61");
			System.out.println("2)78");
			System.out.println("3)38");
			System.out.println("4)79");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
				if (number == 2)
				{
					System.out.println("Correct!");
					points = points + 1;
					}else{
					System.out.println("Incorrect");
					System.out.println("The answer is 2) 28");
				}
		if (counter == 9);
		{
		System.out.println("Congrats! you have completed the math section with" +points +" points");
		
		System.out.println("Please choose a different subject you wish to explore");
		System.out.println("type the the number beside the subject you wish to explore:");
		System.out.println("COMPLETED");
		System.out.println("2: History");
		System.out.println("3: Disabilities");

			
		inData = stdin.readLine();
		section = Integer.parseInt(inData);
		}

		
		
//*************************************************************************************************************************\\		
		if (section == 2)
		{
			System.out.println("Welcome! We will be learning history today.");
			System.out.println("to proceed with the qestions please enter '2' again!");
		}
		
		inData = stdin.readLine();
		next = Integer.parseInt(inData);
//*************************************************************************************************************************\\

		if (next== 2)
		{
			counter += 1;
			System.out.println("who was the first black president of the united states?");
			System.out.println("1)Donal Trump");
			System.out.println("2)Barak Obama");
			System.out.println("3)Gucci Mane");
			System.out.println("4)Vladmir Putin");
		
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 2)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 2)Barak Obama");
			}
						
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
		
//**************************************************************************************************************************\\

		if (next == 1)
		{
			counter += 1;
			System.out.println("When did WWII start and end?");
			System.out.println("1)1956 - 1999");
			System.out.println("2)1798 - 1801");
			System.out.println("3) 1939 - 1945");
			System.out.println("4) 1932 - 1940");
		
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 3)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 3) 1939 - 1945");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**************************************************************************************************************************\\

		if (next == 1)
		{
			counter += 1;
			System.out.println("Adolf Hitler was born in which country?");
			System.out.println("1)France");
			System.out.println("2)Germany");
			System.out.println("3)Austria");
			System.out.println("4)Hungary");

			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 3)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrct");
				System.out.println("The answer is 3)Austria");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//****************************************************************************************************************************\\

		if (next == 1)
		{
			counter += 1;
			System.out.println("World war 1 began in which year?");
			System.out.println("1)1923");
			System.out.println("2)1938");
			System.out.println("3)1917");
			System.out.println("4)1914");
		
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 4)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 4) 1914");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//****************************************************************************************************************************\\

		if(next == 1)
		{
			counter += 1;
			System.out.println("American involvement in the Korean war took place in which decade?");
			System.out.println("1970's");
			System.out.println("1950's");
			System.out.println("1920's");
			System.out.println("1960's");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 2)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 2)1950's");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//*****************************************************************************************************************************\\

		if(next == 1)
		{
			counter += 1;
			System.out.println("The battle of Hastings in 1066 was fought in which country?");
			System.out.println("1)France");
			System.out.println("2)Russia");
			System.out.println("3)England");
			System.out.println("4)Norway");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 3)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 3)England");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//******************************************************************************************************************************\\

		if(next == 1)
		{
			counter += 1;
			System.out.println("The first successful printing press was developed by this man");
			System.out.println("1)Johannes Gutenburg");
			System.out.println("2)Benjamin Franklin");
			System.out.println("3)Sir Isaac Newton");
			System.out.println("4)Martin Luther");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 1)
			{	
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 1) Johannes Gutenburg");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**************************************************************************************************************************\\

	
		if(next == 1)
		{
			counter += 1;
			System.out.println("Which 2 countries fought in the hundred years war?");
			System.out.println("1)Italy and Carthage");
			System.out.println("2)England and Germany");
			System.out.println("3)France and England");
			System.out.println("4)Spain and France");
			
			inData = stdin.readLine();
			number = Integer.parseInt(inData);
		}
			if (number == 3)
			{
				System.out.println("Correct!");
				points = points + 1;
				}else{
				System.out.println("Incorrect");
				System.out.println("The answer is 3) France and England");
			}
//*****************************************************************************************************************************\\

	if (counter == 17)
	{
		System.out.println("Congrats! you have completed the math section and the history section with" +points +" points");
		
		System.out.println("Please choose a different subject you wish to explore");
		System.out.println("type the the number beside the subject you wish to explore:");
		System.out.println("COMPLETED");
		System.out.println("COMPLETED");
		System.out.println("3) Disabilities");
			
		inData = stdin.readLine();
		section = Integer.parseInt(inData);
	}	
//********************************************************************************************************************************\\
			if (section == 3)
		{
			System.out.println("Welcome! We will be learning about disabilities today.");
			System.out.println("to proceed with the qestions please enter '3' again!");
		}
			inData = stdin.readLine();
			next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 3)
	{
		counter += 1;
		System.out.println("which of the followring is an example of a specific Learning Disability");
		System.out.println("1)Mental Retardation");
		System.out.println("2)Dyslexia");
		System.out.println("3)ADHD");
		System.out.println("4)Autistic Spectrum disorders");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 2)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 2) Dyslexia");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("Which of the following is an example of an intellectual disability");
		System.out.println("1)Dyslexia");
		System.out.println("2)ADHD");
		System.out.println("3)Mental Retardation");
		System.out.println("4)Autistic spectrum disorders");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 3)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 3) Mental Retardation");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("An example of a Developmental Disorder is");
		System.out.println("1)ADHD");
		System.out.println("2)Dyslexia");
		System.out.println("3)Mental Retardation");
		System.out.println("4)Autistic spectrum disorders");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 4)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 4) Autistic spectrum disorders");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("In learning disabilities, the name for mathematical disorder is");
		System.out.println("1)Dyspraxia");
		System.out.println("2)Dyslexia");
		System.out.println("3)Dyscalculia");
		System.out.println("4)Dysphasia");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 3 )
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 3) Dyscalculia");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("Which of the following may occur in expressive language disorder?");
		System.out.println("1)Limited amount of speech");
		System.out.println("2)Difficulty learning new words");
		System.out.println("3) Difficulty finding the right word");
		System.out.println("4) All the above");
		
		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 4)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 4) All the above");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("individuals with Down Syndrome often have moderate to severe intellectual impairment with measurable IQ usually between");
		System.out.println("1)45 - 50");
		System.out.println("2)55 - 60");
		System.out.println("3)35 - 55");
		System.out.println("4)25 - 35");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 3)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 3) 35 - 55");
			}
					System.out.println("Press 1 for next question");
					inData = stdin.readLine();
					next = Integer.parseInt(inData);
//**********************************************************************************************************************************\\

	if(next == 1)
	{
		counter += 1;
		System.out.println("A disability may be present in which of the following?");
		System.out.println("1)All of these");
		System.out.println("2)countinence, dexterity or physical coordination");
		System.out.println("3)speech, hearing, eyesight");
		System.out.println("4)Mobility, perception or memory");

		inData = stdin.readLine();
		number = Integer.parseInt(inData);
	}
		if (number == 1)
		{
			System.out.println("Correct!");
			points = points + 1;
			}else{
			System.out.println("Incorrect");
			System.out.println("The answer is 1)  All of these");
			}
//**********************************************************************************************************************************\\
			if (counter == 24)
				System.out.println("Congrats! you have completed all 3 sections!");


	}
	
}
