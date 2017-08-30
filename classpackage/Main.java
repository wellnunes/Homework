package classpackage;

import java.util.Scanner;

/**
 *
 * @author Wellisson Nunes
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Buy buy;
        String typePerson, typeBuy;
        System.out.println("Informe o tipo de cliente:\n > Pessoa Jurídica: A\n > Pessoa Física: B ");
        typePerson = scan.next();
        System.out.println("Informe o tipo de pagamento:\n > Pagamento à vista: 1\n > Pagamento parcelado: 2");
        typeBuy = scan.next();
        if (typePerson.equalsIgnoreCase("B")) {
            buy = new PhysicalPerson();
            System.out.println("\n> Informe o valor da compra: ");
            buy.setPrice(scan.nextFloat());
            if (typeBuy.equalsIgnoreCase("1")) {
                buy.calculatePayment1(buy.getPrice());
                System.out.println("\n> O valor é de: " + buy.getPrice());
            } else if (typeBuy.equalsIgnoreCase("2")) {
                System.out.println("Informe o número das parcelas:");
                buy.setParcels(scan.nextFloat());
                buy.calculatePayment2(buy.getPrice(), buy.getParcels());
                System.out.println(buy.getParcels() + " parcelas de " + buy.parcel() + "\n O valor total é de: " + buy.getPrice());
            }
        } else if (typePerson.equalsIgnoreCase("A")) {
            buy = new LegalPerson();
            System.out.println("Informe o valor da compra:");
            buy.setPrice(scan.nextFloat());
            if (typeBuy.equalsIgnoreCase("1")) {
                buy.calculatePayment1(buy.getPrice());
                System.out.println("O valor é de:" + buy.getPrice());
            } else if (typeBuy.equalsIgnoreCase("2")) {
                System.out.println("Informe o número de parcelas:");
                buy.setParcels(scan.nextFloat());
                buy.calculatePayment2(buy.getPrice(), buy.getParcels());
                System.out.println(buy.getParcels() + " parcelas de " + buy.parcel() + "\n O valor total é de: " + buy.getPrice());
            }
        }
    }
}
