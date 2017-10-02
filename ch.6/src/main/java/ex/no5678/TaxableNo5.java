
package ex.no5678;


public interface TaxableNo5 {
    final double taxRate = 0.03;
    public double getIncome(double exemptionAmount);
    public double tax();
    
    public abstract void method();
}