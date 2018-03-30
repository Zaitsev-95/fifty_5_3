public abstract class BaseAtm {
    private int bondTwenty=20;
    private int bondFifty=50;
    private int bondHundred=100;


    public int getBondTwenty() {
        return bondTwenty;
    }

    public int getBondFifty() {
        return bondFifty;
    }

    public int getBondHundred() {
        return bondHundred;
    }

   abstract public String infoAtm();
}
