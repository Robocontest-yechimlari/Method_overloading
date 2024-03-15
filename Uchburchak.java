public class Uchburchak {
    private int a;
    private int b;
    private int c;
    private double ad;
    private double bd;
    private double cd;
    private long al;
    private long bl;
    private long cl;
    private float af;
    private float bf;
    private float cf;
    public void setA(int a)
    {   this.a = a; }
    public void setB(int b)
    {   this.b = b;   }
    public void setC(int c)
    {   this.c= c; }
    public int getA()
    {   return (a+b+c);   }
    public int getB()
    {   return (a+b)/2;   }
    public void setA(double ad)
    {   this.ad = ad; }
    public void setB(double bd)
    {   this.bd = bd;   }
    public void setC(double cd)
    {   this.cd = cd;   }
    public double getAD()
    {   return ad+bd+cd;   }
    public double getBD()
    {   return (ad+bd)*1./2;   }
    public void setA(long al)
    {   this.al = al; }
    public void setB(long bl)
    {   this.bl = bl;   }
    public void setC(long cl)
    {   this.cl = cl; }
    public long getAl()
    {   return (al+bl+cl);   }
    public long getBl()
    {   return (al+bl)/2;   }
    public void setA(float af)
    {   this.af = af; }
    public void setB(float bf)
    {   this.bf = bf;   }
    public void setC(float cf)
    {   this.cf = cf; }
    public float getAF()
    {   return (af+bf+cf);   }
    public float getBF()
    {   return (af+bf)/2;   }
}
