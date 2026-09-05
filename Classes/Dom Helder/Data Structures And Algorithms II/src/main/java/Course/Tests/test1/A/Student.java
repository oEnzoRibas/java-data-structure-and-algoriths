package Course.Tests.test1.A;

public class Student {
    private int student_id;
    private String student_name;
    private int[] grades = new int[10];
    private String course;
    private int semester;
    private static int index = 0;


    void addGrade(int g) throws InvalidGradeException{

        if (g < 0 || g > 100){
            throw new InvalidGradeException("Nota inválida!");
        }

        this.grades[index++] = g;

    }

    void checkApproval(){
        boolean approved = false;
        double soma = 0;
        int cont = 0;

        String msg;

        for (int i : grades){
        soma += i;
        cont++;
        }

        double media = soma / cont;

        if (media >= 65){
            approved = true;
        }

        msg = approved ? "Aprovado" : "Reprovado";
        System.out.println(msg);
    }

    void setStudent_name(String name) throws EmptyNameException{
        if (name.isEmpty()) throw new EmptyNameException("Nome não pode ser vazio!");
    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Student.index = index;
    }
}
