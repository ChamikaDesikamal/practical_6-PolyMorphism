public class CentralBank {
    void leasingRate(){
        System.out.println("30% Bellow");
    }
}
class CommercialBank extends CentralBank{
    void housingLoanRate(){
        System.out.println("25%");
    }
    @Override
    void leasingRate() {
        System.out.println("25%");
    }
}
class CommercialLeasing extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{
    @Override
    void housingLoanRate() {
        System.out.println("20%");
    }

    @Override
    void leasingRate() {
        System.out.println("22%");
    }
}
class RateResults{
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cd = new CommercialCredit();
        c.leasingRate();
        cd.leasingRate();
        cb.leasingRate();
        cl.leasingRate();

        CommercialBank cbl,ccl;
        cbl = new CommercialCredit();
        ccl = new CommercialLeasing();
        cbl.housingLoanRate();
        ccl.housingLoanRate();

    }
}