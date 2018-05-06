package Day1;

import java.util.Scanner;

public class StudentsGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math, science, computer, english, history;
		double finalscore;
		
		Scanner marks= new Scanner (System.in);
		
		
		
		System.out.println("Enter Marks for Math");
		math= marks.nextInt();
		
		
		System.out.println("Enter Marks for Science");
		science= marks.nextInt();
		
		System.out.println("Enter Marks for Computer");
		computer= marks.nextInt();
		
		System.out.println("Enter Marks for English");
		english= marks.nextInt();
		
		
		System.out.println("Enter Marks for History");
		history= marks.nextInt();
		finalscore= (math+science+computer+english+history)/5;
		
		if(finalscore>90)
		{
			System.out.println(" A ");
		}
		else if(finalscore>80)
		{
			System.out.println(" B ");
		}
		
		else if(finalscore>70)
		{
			System.out.println(" C ");
		}
		else if(finalscore>60)
		{
			System.out.println(" D ");
		}
		else 
		{
			System.out.println(" FAIL ");
		}
		}
	}
