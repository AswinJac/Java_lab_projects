 abstract class shape
 {
    abstract void numberofsides();
 }
 class Rectanlge extends shape
 {
    void numberofsides()
    {
        System.out.println("Number of Sides =4");
    }
 }
 class Triangle extends shape
 {
    void numberofsides()
    {
        System.out.println("Number of Sides =3");
    }
 }
 class Heagon extends shape
 {
    void numberofsides()
    {
        System.out.println("Number of Sides =6");
    }
 }
 class abstraction
 {
    public static void main(String[] args) {
        Rectanlge rec=new Rectanlge();
        rec.numberofsides();
        Triangle tri=new Triangle();
        tri.numberofsides();
        Heagon hex=new Heagon();
        hex.numberofsides();
    }
 }
