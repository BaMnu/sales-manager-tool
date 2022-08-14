import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в 'SalesManager'." +
                "\n1) Для начала введите одно число - количество товара, которое Вы хотите проанализировать" +
                " и нажмите 'Enter'" +
                "\n2) Далее заполните наименование для каждого товара " +
                "(по 1-му наименованию для каждой строки, затем нажмиет 'Enter')." +
                "\n3) Затем введите сумму выручки по каждому ранее внесенному товару за период" +
                "(по 1-й сумме для каждой строки, затем нажмиет 'Enter'):\n"
        );
        System.out.println("Заполните кол-во единиц товаров, которые Вы хотите внести: ");
        int size = Integer.parseInt(input.nextLine());

        String[] productNames = new String[size];
        System.out.println("Заполните наименования товаров:");
        for (int i = 0; i < productNames.length; i++) {
            productNames[i] = input.nextLine();
        }

        System.out.println("Заполните сумму выручки:");
        long[] salesAmounts = new long[size];
        for (int j = 0; j < salesAmounts.length; j++) {
            salesAmounts[j] = input.nextInt();
        }
        input.close();

        SalesManager salesManager = new SalesManager(salesAmounts);
        String nameOfProduct = null;

        for (int i = 0; i < salesAmounts.length; i++) {
            if (salesAmounts[i] == salesManager.max()) {
                nameOfProduct = productNames[i];
            }
        }

        System.out.println(
                "Наиболее продоваемый товар: "
                        + "'" + nameOfProduct + "'"
                        + "\nВыручка за период: "
                        + salesManager.max() + " руб."
                        + "\nРасчёт обрезанного среднего: "
                        +  salesManager.truncatedMean(salesAmounts)
        );
    }
}