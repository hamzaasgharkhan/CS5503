public class Main {
    public static <T> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (((Comparison<T>)arr[j]).compare(arr[j+1]) == -1){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Ali", 2.3);
        students[1] = new Student("Jamal", 3.1);
        students[2] = new Student("Akbar", 3.6);
        students[3] = new Student("Asad", 4);
        students[4] = new Student("Shah", 3.74);
        for (int i = 0; i < students.length; i++){
            students[i].display();
        }
        sort(students);
        System.out.println("Sorted:");
        for (int i = 0; i < students.length; i++){
            students[i].display();
        }
    }
}