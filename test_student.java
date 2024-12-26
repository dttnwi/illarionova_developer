public class test_student {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Alice Brown", 2, 89.5);
        Student mathStudent = new MathStudent("Bob Smith", 3, 92.0);

        iuStudent.writeExam();
        mathStudent.writeExam();
        }
    }

