class Teacher {
    private String name;
    private String subject;
    private int yrsOfExp;

    public Teacher(String name, String subject, int yrsOfExp) {
        this.name = name;
        this.subject = subject;
        this.yrsOfExp = yrsOfExp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYrsOfExp() {
        return yrsOfExp;
    }

    public void setYrsOfExp(int yrsOfExp) {
        this.yrsOfExp = yrsOfExp;
    }
}

class Student {
    private String name;
    private String degree;
    private String college;

    public Student(String name, String degree, String college) {
        this.name = name;
        this.degree = degree;
        this.college = college;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

public class q2 {

    public static void linkstudent1(Student s2, Teacher teacher) {
        System.out.println(s2.getName() + " studies Java by" + teacher.getName());
    }

    public static void linkTeacherToStudent(Teacher teacher, Student student) {
        System.out.println(
                teacher.getName() + " teaches " + teacher.getSubject() + " to " + student.getName() +
                        " who reads " + student.getDegree() + " from " + student.getCollege());
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Amitava", "OOPs Design", 8);

        Student student1 = new Student("Madhu", "BTech", "UEM College");
        Student s2 = new Student("Ankan");

        linkstudent1(s2, teacher);
        linkTeacherToStudent(teacher, student1);
    }
}
