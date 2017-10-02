
package ex.no5678;


class Goods2 implements Taxable {

    double earn, taxRate;

    public Goods2(double earn, double taxRate) {
        this.earn = earn;
        this.taxRate = taxRate;
    }

    public double getIncome(double exemptionAmount) {
        return earn;
    }
    
    public double tax() {
        return taxRate;
    }
    
}