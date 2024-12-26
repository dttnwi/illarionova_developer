abstract class Student {
    private String fullName;
    private int course;
    private double examScore;

    public Student(String fullName, int course, double examScore) {
        this.fullName = fullName;
        this.course = course;
        this.examScore = examScore;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getExamScore() {
        return examScore;
    }

    public abstract void writeExam();
}

class IUStudent extends Student {
    public IUStudent(String fullName, int course, double examScore) {
        super(fullName, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println("IUStudent " + getFullName() + " is writing an exam for course " + getCourse());
    }
}

class MathStudent extends Student {
    public MathStudent(String fullName, int course, double examScore) {
        super(fullName, course, examScore);
    }

    @Override
    public void writeExam() {
        System.out.println("MathStudent " + getFullName() + " is writing an exam for course " + getCourse());
    }
}

