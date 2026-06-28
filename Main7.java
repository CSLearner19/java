class wonders7{
    void location(){
        System.out.println("The location is: ");
    }
    void famousFor(){
        System.out.println("It is famous for: \n");
    }
}

class Colloseum extends wonders7 {
    void location() {
        System.out.println("The Colloseum is located in Rome, Italy.");
    }
    void famousFor() {
        System.out.println("It is famous for oval amphitheater\n");
    }
}

class China extends wonders7 {
    void location() {
        System.out.println("The Great Wall of China is located in China.");
    }

    void famousFor() {
        System.out.println("It is famous for the Great Wall of China\n");
    }
}

class tajMahal extends wonders7 {
    void location() {
        System.out.println("The Taj Mahal is located in India");
    }

    void famousFor() {
        System.out.println("It is famous for stunning white marble mausoleum \n");
    }
}

class Redeemer extends wonders7 {
    void location() {
        System.out.println("The redeemer is located in Brazil");
    }

    void famousFor() {
        System.out.println("It is famous for being 30 meters tall \n");
    }
}

class MaccuPiccu extends wonders7 {
    void location() {
        System.out.println("Maccu Piccu is located in Peru");
    }

    void famousFor() {
        System.out.println("It is famous for the lost treasure of the 15th century \n");
    }
}

class ChichenItza extends wonders7 {
    void location() {
        System.out.println("Chichen Itza is located in Mayan");
    }

    void famousFor() {
        System.out.println("It is famous for the series of monuments and temples. \n");
    }
}

class Petra extends wonders7 {
    void location() {
        System.out.println("Petra is located in Jordan");
    }

    void famousFor() {
        System.out.println("It is famous for its golden hue. \n");
    }
}

class Main7 {
    public static void main(String[] args) {
        wonders7 A = new wonders7();
        wonders7 M = new Colloseum();
        wonders7 Mu = new China();
        wonders7 G = new tajMahal();
        wonders7 C = new Redeemer();
        wonders7 D = new MaccuPiccu();
        wonders7 E = new ChichenItza();
        wonders7 F = new Petra();
        A.location();
        A.famousFor();
        M.location();
        M.famousFor();
        Mu.location();
        Mu.famousFor();
        G.location();
        G.famousFor();
        C.location();
        C.famousFor();
        D.location();
        D.famousFor();
        E.location();
        E.famousFor();
        F.location();
        F.famousFor();
    }
}
