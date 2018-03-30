import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balans = random.nextInt(1000);
        System.out.println("(Вы находитесь около двух банкоматов: VTB и BelVEB...)\nНажмите 1, чтобы востпользоваться VTB, нажмите 2, чтобы воспользоваться BelVEB");
        int choice = scanner.nextInt();
        InfoAccount infoAccount = new UserAtm();
        UserAtm userAtm = new UserAtm();
        userAtm.setInfoBalance(balans);
        if (choice == 1) {
            BaseAtm atm = new AtmVTB();
            String nameAtm = ((AtmVTB) atm).infoAtm();
            System.out.println(nameAtm);
            String account = ((UserAtm) infoAccount).getInfoAccount();
            System.out.printf("%n%nБаланс на счёте: %s%n", balans);

        } else if (choice == 2) {
            BaseAtm atm = new AtmBelveb();
            String nameAtm = ((AtmBelveb) atm).infoAtm();
            System.out.println(nameAtm);
            String account = ((UserAtm) infoAccount).getInfoAccount();
            System.out.printf("%n%nБаланс на счёте: %s%n", balans);
        } else {
            System.out.println("Неверный фомат данных");
        }
        System.out.println("Вводд средств(нажмите 1)\nСнятие средств(наджмите 2)");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Внесите сумму в купюроприемник...(введите число)");
            int currency = scanner.nextInt();
            int fiftyDivision = currency % 50;
            int twentyDivision = currency % 20;
            if ((fiftyDivision == 0) || (twentyDivision == 0)) {
                int replenishment = userAtm.replenishment(currency);
                System.out.printf("Счёт пополнен на: %d%nCумма на счету: %d", currency, replenishment);
            }else {
                System.out.println("В нашей стране наменал купюр только 20,50,100!");
            }
        } else if (choice == 2) {
            System.out.println("Выберите сумму, которую хотите вывести(введите число)");
            int currency = scanner.nextInt();
            int fiftyDivision = currency % 50;
            int twentyDivision = currency % 20;
            int balance=userAtm.getInfoBalance();
            if ((currency<balance)&&((fiftyDivision == 0) || (twentyDivision == 0))){
             userAtm.extraditionBonds(currency) ;
            }else{
                System.out.println("Неверный фомат данных");
            }
        } else {
            System.out.println("Неверный фомат данных");
        }
    }
}
