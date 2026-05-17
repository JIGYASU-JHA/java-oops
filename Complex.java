class Complex{
    private double real, img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void Swap() {
        double temp = real;
        real = img;
        img = temp;
    }

    public Complex Sum(Complex c) {
        return new Complex(real + c.real, img + c.img);
    }

    public void display() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4), c2 = new Complex(5, 6);
        c1.display(); c2.display();
        c1.Swap(); c1.display();
        c1.Sum(c2).display();
    }
}
