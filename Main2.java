class Animal {
    void eat(){
        System.out.println("eating...class Animal...eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roaring...class Lion...roar method");
    }
}
class BabyLion extends Lion{
    void weep(){
        System.out.println("weeping...class Baby Lion...weep method");
    }
}
class Main2{
    public static void main(String[] args) {
        BabyLion obj = new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}