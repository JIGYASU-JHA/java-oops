
class Apple {
    void show() {
        System.out.println("This is the show() method in class Apple.");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is the show() method in class Banana.");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is the show() method in class Cherry.");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple ref;
        ref = new Apple();
        ref.show(); 
        ref = new Banana();
        ref.show(); 
        ref = new Cherry();
        ref.show(); 
    }
}
