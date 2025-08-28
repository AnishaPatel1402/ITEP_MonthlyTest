// Q3. (4 Marks)
// Write a Java program using OOP concepts:
// Create a class Student with attributes: name, marks.
// Create a method getGrade() that returns:
// "A" if marks ≥ 80
// "B" if marks ≥ 60 and < 80
// "C" if marks ≥ 40 and < 60
// "F" if marks < 40
// Create main() method to create 3 students and print their name with grade.

class Student{
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public char getGrade(){
        char grade = ' ';
        if(this.marks >= 80) grade = 'A';
        else if(this.marks >= 60 && this.marks < 80) grade = 'B';
        else if(this.marks >= 40 && this.marks < 60) grade = 'C';
        else grade = 'F';
        return grade;
    }

    public void display(){
        System.out.println("Student Name = "+ this.name);
        System.out.println("Student Marks = "+ this.marks);
        System.out.println("Student Grade = "+ this.getGrade());
        System.out.println();
    }
}

class Test{
    public static void main(String args[]){
        Student s1 = new Student("Anisha Patel", 85);
        Student s2 = new Student("Sapna Patel", 75);
        Student s3 = new Student("Abhay Patel", 59);

        s1.display();
        s2.display();
        s3.display();
    }
}