class Sport {
    String name;
  public Sport(String name) {
        this.name = name;
    }
    public void favoritesports() {
        System.out.println("My favorite sport is " + name );
    }
}

class Person1 extends Sport {
    public Person1(String name) {
        super(name);
    }

    public void showSport() {
        System.out.println("Person1's favorite sport is " + name );
    }
}

class Person2 extends Sport {
    public Person2(String name) {
        super(name);
    }
    public void showSport() {
        System.out.println("Person2's favorite sport is " + name );
    }
}

public class Sports {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Cricket");
        person1.showSport(); 
        person1.favoritesports(); 

        Person2 person2 = new Person2("Basketball");
        person2.showSport();  
        person2.favoritesports(); 
    }
}
