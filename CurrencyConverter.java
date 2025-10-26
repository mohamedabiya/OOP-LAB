public class CurrencyConverter {
    static double pariteUsd = 34.50;
    static double getPariteEur = 36.80;
            // usd to tl
    public static double conver_ust_to_tl(double amount){
        return amount*pariteUsd;
    }
            // euro to tl
    public static double convert_eur_to_tl(double amount){
        return amount*getPariteEur;
    }

}
