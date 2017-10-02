
package ex.no5678;

public interface Taxable {
    final double taxRate = 0.03;
    public double getIncome(double exemptionAmount);
    public double tax();
}
