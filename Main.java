public class Main{
    public static void main(String[] args) {
// int qiymat berilganida ishlaydigan methodlar
        Uchburchak uchburchak = new Uchburchak();
        uchburchak.setA(4);
        uchburchak.setB(3);
        uchburchak.setC(5);
// double qiymat berilganida ishlaydigan methodlar
        Uchburchak duchburchak = new Uchburchak();
        duchburchak.setAd(4000000.0);
        duchburchak.setBd(3000000.0);
        duchburchak.setCd(5000000.0);
// long qiymat berilganida ishlaydigan methodlar
        Uchburchak luchburchak = new Uchburchak();
        luchburchak.setAl(40000);
        luchburchak.setBl(30000);
        luchburchak.setCl(50000);
// float qiymat berilganida ishlaydigan methodlar
        Uchburchak fuchburchak = new Uchburchak();
        fuchburchak.setAf(4.0f);
        fuchburchak.setBf(3.0f);
        fuchburchak.setCf(5.0f);

        System.out.println("Uchburchak perimetri: "+uchburchak.getA());
        System.out.println("Uchburchak yuzasi: "+uchburchak.getB());
        System.out.println("Uchburchak perimetri: "+duchburchak.getAD());
        System.out.println("Uchburchak yuzasi: "+duchburchak.getBD());
        System.out.println("Uchburchak perimetri: "+luchburchak.getAl());
        System.out.println("Uchburchak yuzasi: "+luchburchak.getBl());
        System.out.println("Uchburchak perimetri: "+fuchburchak.getAF());
        System.out.println("Uchburchak yuzasi: "+fuchburchak.getBF());

    }
}