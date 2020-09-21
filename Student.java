public class Student {
    Student(String name,int roll){
        System.out.println("Student name -"+name);
        System.out.println("Student roll number-"+roll);
    }
    Student(String name){
        if(name==""){
            System.out.println("Unknown");
        }
    }


    public static void main(String[] args) {
        Student da= new Student("Sam B",24);
        Student xz= new Student("Boris Johnson",37);
        Student bd= new Student("James Bond",007);
        Student we= new Student("");

    }
}
