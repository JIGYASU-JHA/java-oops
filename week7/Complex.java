class Complex {
    private double real, img;
    public Complex() {
        this.real = 0;
        this.img = 0;
    }
    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public void Swap() {
        double temp = this.real;
        this.real = this.img;
        this.img = temp;
    }
    public Complex Sum(Complex c) {
        return new Complex(this.real + c.real, this.img + c.img);
    }
    public void display() {
        System.out.println(this.real + " + " + this.img + "i");
    }

    public static void main(String args[]) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 6);
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();

        c1.Swap();
        System.out.print("After swapping real and imaginary parts of first complex number: ");
        c1.display();

        Complex sum = c1.Sum(c2);
        System.out.print("Sum of complex numbers: ");
        sum.display();
    }
}
