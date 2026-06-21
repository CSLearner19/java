class Student1 {
    int id;
    String name;
    float stipend;

    Student1(){}

    Student1(int id, String name){
        this.id=id;
        this.name=name;
    }

    Student1(int id, String name, float stipend){
        this.id=id;
        this.name=name;
        this.stipend=stipend;
    }
    void displayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}
class Student{
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        Student1 st2 = new Student1(45, "Aashish");
        Student1 st3 = new Student1(234, "Cody", 10000);

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}