// Author: Cephas Kaburu


package fraction;

public class Fraction
{
    private int numerator = 0;
    private int denominator = 1;
    
    public Fraction() //constructors
    {
        
    }
    public Fraction(int n)
    {
        this.set(n,1);
    }
    public Fraction(int n, int d){
        if(set(n,d)== false)
            this.set(0,1);
    }
    
    public boolean set(int n, int d)
    {
        if(d > 1)
        {
            numerator = n;
            denominator = d;
            return true;
        }else
        {
            return false;
        }
    }
        
    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void show()
    {
        System.out.print(numerator + "/" + denominator);
    }
    public double decimal()
    {
        return ((double) numerator / denominator);
    }
    
    public static void main(String[] args){
        
        Fraction f1, f2;
        f1 = new Fraction();
        f2 = new Fraction(3,5);
        
        System.out.print("\nNumerator = " + f1.getNumerator());
        System.out.print("\nDenominator = " + f1.getDenominator());
        System.out.print("\nFraction F1 = ");f1.show();
        System.out.print("\nFraction F2 = ");f2.show();
        System.out.print("\nDecimal F1 = " + f1.decimal());
        System.out.print("\nDecimal F2 = " + f2.decimal());  
        
    }
}