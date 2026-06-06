class Counter1 {
    int number = 10;
    void increment(){
        number = number + 1;
    }
}
class Counter{
public static void main(String[] args) {
    Counter1 obj1 = new Counter1();
    Counter1 obj2 = new Counter1();
    Counter1 obj3 = new Counter1();
    obj1.increment();
    obj2.increment();
    obj3.increment();
    System.out.println(obj1.number);
    System.out.println(obj2.number);
    System.out.println(obj3.number);
}
}