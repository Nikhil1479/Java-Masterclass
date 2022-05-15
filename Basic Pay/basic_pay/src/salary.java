public class salary {
    double basic_pay;
    double ta;
    double da;
    double pf;
    double it;
    double totalAllowance;
    double TotalDetection;
    double net_pay;

    public salary(double basic_pay) {
        this.basic_pay = basic_pay;
    }

    public void calculate(){
        this.da = 0.8 * this.basic_pay;
        this.ta = 0.5 * basic_pay;
        this.pf = 0.9 * basic_pay;
        this.it = 0.3 * basic_pay;
        totalAllowance = ta + da;

        TotalDetection = pf + it;
        net_pay = (basic_pay+totalAllowance)-TotalDetection;
    }

    public void display(){
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("Travel Allowance: "+ ta);
        System.out.println("Dearness Allowance: "+ da);
        System.out.println("Total Allowance: "+totalAllowance);
        System.out.println();
        System.out.println("PF Detection: "+pf);
        System.out.println("IT Detection: "+it);
        System.out.println("Total Detection: "+ TotalDetection);
        System.out.println("\nNet Pay: "+net_pay);
    }
}
