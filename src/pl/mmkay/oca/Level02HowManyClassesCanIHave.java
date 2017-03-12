package pl.mmkay.oca;

public class Level02HowManyClassesCanIHave {
    public static void main(String[] args) {
        new Hello().hello();
        new ICanSee().iCanSee();
        new ICanSeeInYourSmile().iCanSee();
        new YoureAllIEver().iCanSee();
    }

    static class ICanSeeInYourSmile {
        void iCanSee() {
            System.out.println("I can see it in your smile");
        }
    }

    static class YoureAllIEver extends ICanSee {
        @Override
        void iCanSee() {
            System.out.println("You're all I ever wanted");
        }
    }
}

class Hello {
    void hello() {
        System.out.println("Is it me you're looking for?");
    }
}

class ICanSee {
    void iCanSee() {
        System.out.println("I can see it in your eyes");
    }
}