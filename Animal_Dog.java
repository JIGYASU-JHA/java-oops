class Animal {
    int legs, heads;

    Animal(int legs, int heads) {
        this.legs = legs;
        this.heads = heads;
    }

    public void Walk() {
        if (this.legs > 1)
            System.out.println("Has " + this.heads + " head(s) and can walk.");
        else
            System.out.println("Has " + this.heads + " head(s) and cannot walk.");
    }
}

public class Animal_Dog extends Animal {
    Animal_Dog() {
        super(4, 1);
    }

    public static void main(String args[]) {
        Animal_Dog dog_obj = new Animal_Dog();
        dog_obj.Walk(); 
    }
}
