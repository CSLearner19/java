class Employee1{
    int empno;
    String name;
    float sal;

    Employee1(){
        System.out.println("*****");
        empno = 101;
        name = "Aashish";
        sal = 5000f;
    }
    void displayDetails(){
        System.out.println(empno + "|" + name + "|" + sal);
    }
}
class Employee{
    public static void main(String[] args){
        Employee1 emp1 = new Employee1();
        Employee1 emp2 = new Employee1();
        Employee1 emp3 = new Employee1();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}