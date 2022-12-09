import java.util.Scanner;
public class Calculator {
	public static void main (String[]args) 
	{
		int studentRegno=1, i=0;  // student registration number
        String result="";
Scanner s = new Scanner(System.in);
        int regNo=studentRegno;
        int[] studentScores= new int [3];
        for (int j=0;j<studentScores.length;j++)
{
System.out.println("Enter the score for student with registration number "+regNo);
              studentScores[j] = s.nextInt();
               regNo++;
}
while(studentRegno<=3)
{
  if(studentScores[i]<35 && studentScores[i]>0)
  {
result="Failed the test";
  }
  
          else 
  {
if(studentScores[i]>=35 && studentScores[i]<70)
{
   result="secured Grade C";
}
else if(studentScores[i]>70 && studentScores[i]<90)
{
   result="secured Grade B";
}
else if(studentScores[i]>=90 &&studentScores[i]<=100)
{
   result="secured Grade A";
                                            }
  }
 
System.out.println("RESULT: Student with registration number "+studentRegno+" " 
+ result);
  i++;
  studentRegno++;
 }
	}

}
