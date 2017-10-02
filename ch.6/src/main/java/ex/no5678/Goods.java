
package ex.no5678;


class Goods2 implements Taxable {

    double earn;

    public Goods2(double earn) {
        this.earn = earn;
    }

    public double getIncome(double exemptionAmount) {
        System.out.println("getIncome 메소드 상속");
    }
    
    public double tax() {
        System.out.println("tax 메소드 상속");
    }
    
}