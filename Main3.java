class Mammal {
    void mam(){
        System.out.println("Inside Mammal Class");
    }
}
class Lion extends Mammal{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
class Human extends Mammal{
    void hum(){
        System.out.println("Inside Human Class");
    }
}
class Main3{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.roar();
        obj.mam();
    }
}