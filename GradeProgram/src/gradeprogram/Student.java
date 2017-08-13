package gradeprogram;
import java.util.Scanner;
import java.io.*;

public class Student {

    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int finalExam;
    private double overall;
    private String grade;

    public Student() {
        this.quiz1 = 0;
        this.quiz2 = 0;
        this.quiz3 = 0;
        this.midterm = 0;
        this.finalExam = 0;
        this.overall = 0 ;
        this.grade = "";
    }

    public Student(int quiz1, int quiz2, int quiz3, int midterm, int finalExam) {
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.overall = overall ;
        this.grade = "";
    }

    public void Compute() {

        this.overall = (((this.quiz1 + this.quiz2 + this.quiz3)*10 / 3) * 0.25
                + this.midterm * 0.35 + this.finalExam * 0.4);
        if (this.overall >= 90) {
            this.grade = "A";
        } else if (this.overall >= 80) {
            this.grade = "B";
        } else if (this.overall >= 70) {
            this.grade = "C";
        } else if (this.overall >= 60) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }

    public boolean equals(Student obj) {
       return (this.quiz1 == obj.quiz1 && this.quiz2 == obj.quiz2
                && this.quiz3 == obj.quiz3 && this.midterm == obj.midterm
                && this.finalExam == obj.finalExam
                && this.overall == obj.overall);
    }

    public String toString() {
        String result = "";
        result = "Quiz1 = " + quiz1+  "\nQuiz2 = " + quiz2 +"\nQuiz = " + quiz3 + "\nMidtermExam = " + midterm + "\nFinalExam = "  + finalExam + "\nOverall = " + overall + "\nLetterGrade : " + grade + "\n";
        return result;
    }
    
    public static void main(String[] args){

    	Scanner inputStream = null;
    	PrintWriter outputStream = null;
    	try
    	{
    		inputStream = new Scanner(new FileInputStream("scores.txt"));

    		outputStream = new PrintWriter( new FileOutputStream("gardeBook.txt") );


    	}
    	catch(FileNotFoundException e){
    		System.out.println("Problem opening files");
    		System.exit(0);
    	}
    	while(inputStream.hasNext()){    
    		String[] temp = inputStream.nextLine().split(" ");
    		String name = temp[0];
    		
    		int quiz1 = Integer.parseInt(temp[1]);
    		int quiz2 = Integer.parseInt(temp[2]);
    		int quiz3 = Integer.parseInt(temp[3]);
    	    int midterm = Integer.parseInt(temp[4]);
    	    int finalExam = Integer.parseInt(temp[5]); 
    	    Student student = new Student(quiz1,quiz2,quiz3,midterm,finalExam);

    
    	    student.Compute();
    	    System.out.println(student.toString());
    	    
    	}
    	
        /*Student Mary = new Student(10,9,8,80,90);
        Student John = new Student(10,9,8,80,90);
        Student Tom = new Student(10,10,10,10,10);
        
        if(Mary.equals(Tom)){
        	System.out.println("Mary's score equals Tom's.");
        }
        
        if(Mary.equals(John)){
        	System.out.println("Mary's score equals John's.");
        }
        
        if(John.equals(Tom)){
        	System.out.println("John's score equals Tom's.");
        }
        System.out.print("\n");
        
        
        Mary.Compute();
        John.Compute();
        Tom.Compute();
        
        System.out.println("Student1");
        System.out.println(Mary.toString());
        System.out.println("Student2");
        System.out.println(John.toString());
        System.out.println("Student3");
        System.out.println(Tom.toString());*/
    }
}

