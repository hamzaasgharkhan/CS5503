public class Student implements Comparison<Student> {
    String name;
    double gpa;
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    @Override
    public int compare(Student o){
        if (this.gpa < o.gpa){
            return -1;
        } else if (this.gpa == o.gpa){
            return 0;
        } else {
            return 1;
        }
    }
    public void display(){
        System.out.println("Name: " + name + "\t\tGPA:" + gpa);
    }
}
