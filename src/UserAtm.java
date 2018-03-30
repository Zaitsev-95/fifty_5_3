public class UserAtm implements InfoAccount {
    private String nameAndSecondname = "Dzmitry Vasin";
    private String accountNumber = "6052 1799 6389 2101";
    private int infoBalance;

    public String getNameAndSecondname() {
        return nameAndSecondname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getInfoBalance() {
        return infoBalance;
    }

    public void setInfoBalance(int infoBalance) {
        this.infoBalance = infoBalance;
    }

    public int replenishment(int number) {
        infoBalance = infoBalance + number;
        return infoBalance;
    }

    @Override
    public String getInfoAccount() {
        String name = this.nameAndSecondname = nameAndSecondname;
        String account = this.accountNumber = accountNumber;
        System.out.printf("%nДобро пожаловать %s%nЛицевой счёт №:%s", name, account);
        return name;
    }

    public void extraditionBonds(int currency) {
        int bondHundred = 0;
        int bondFifty = 0;
        int bondTwenty = 0;
        int x100 = 0;
        int x50 = 0;
        int x20 = 0;
        if (currency >= 100) {
            x100 += currency  / 100;
            currency -= x100 * 100;
        }
        if (currency >= 50) {
            x50 += currency / 50;
            currency -= x50 * 50;
        }
        if (currency >= 20) {
            x20 += currency / 20;
        }
        bondHundred += x100;
        bondFifty += x50;
        bondTwenty += x20;
        System.out.printf("%d по 100,%d по 50,%d по 20 ", bondHundred, bondFifty, bondTwenty);

    }
}
