public class Main{
    public static void main(String[] args) {
        Uchburchak uchburchak = new Uchburchak();
        uchburchak.setA(4);
        uchburchak.setB(3);
        uchburchak.setC(5);

        Uchburchak duchburchak = new Uchburchak();
        duchburchak.setA(4.0);
        duchburchak.setB(3.0);
        duchburchak.setC(5.0);

        Uchburchak luchburchak = new Uchburchak();
        luchburchak.setA(40000);
        luchburchak.setB(30000);
        luchburchak.setC(50000);

        Uchburchak fuchburchak = new Uchburchak();
        fuchburchak.setA(4.0);
        fuchburchak.setB(3.0);
        fuchburchak.setC(5.0);

        System.out.println("Uchburchak perimetri: "+uchburchak.getA());
        System.out.println("Uchburchak yuzasi: "+uchburchak.getB());
    }
        }