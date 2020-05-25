package hw_4;

import java.util.*;

public class Store {

    //  Створити клас Store, який матиме поле - List продуктів. Конструктор класу store не має жодних параметрів,
    //  в тілі просто ініціалізує List (new ArrayList<>).
    //   В класі Store створити, і в мейні викликати, наступні методи:

    private List<Product> productList;

    public Store() {
        this.productList = new ArrayList<>();
    }

    //        1. Додати продукт в магазин. Але перш ніж додати його в ліст,
    //        здійснити валідацію (чи ціна не від'ємна,
    //              чи в назві товару не присутні цифри).

    public void addProduct(Product element) {
        String foreignNameProduct = element.getName();
        if (element.getPrice() < 0) {
            System.out.println("-----------------------Увага---------------------------------------");
            System.out.println("Ціна продукту встановлена як від'ємне значення: " + element.getPrice() + "," +
                    "у зв'язку із чим введення до списку проігноровано.");
            System.out.println("-------------------------------------------------------------------");
        }

        if (foreignNameProduct == null || foreignNameProduct.equals("")) {
            System.out.println("Поле \"назва\" порожнє. Продукт не введено до списку.");
            return;
        }

        char[] charArray = foreignNameProduct.toCharArray();
        List<Character> forbiddenElementInName = new LinkedList<>();

        for (char value : charArray) {
            if (!Character.isLetter(value)) {
                forbiddenElementInName.add(value);
            }
        }

        if (forbiddenElementInName.size() > 0) {
            System.out.println("Наступні символи у назві продукту -- недопустимі:");
            for (Character value : forbiddenElementInName) {
                System.out.print("'" + value + "'" + "; ");

            }
            System.out.println();
            System.out.println("Продукт " + foreignNameProduct + " не додано у список.");
            return;
        }
        productList.add(element);

    }

    //        2. Видалити продукт з магазину по назві
    public void removeProduct(String productName) {

        boolean result = false;
//        for (Product element : productList) {
//            if (productName.equals(element.getName())) {
//                value = element.getName();
//                result = productList.remove(element);
//                break;
//            }
//        }
//        if (result) {
//            System.out.println("Прдукт " + value + " видалено.");
//        } else {
//            System.out.println("Продукту з введеною назвою " + productName + " у поточному списку не існує.");
//        }

        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product productOnThisIteration = iterator.next();
            if (productOnThisIteration.getName().equals(productName)) {
                result = true;
                iterator.remove();
            }
        }

        if (result) {
            System.out.println("Прдукт " + productName + " видалено.");
        } else {
            System.out.println("Продукту з введеною назвою " + productName + " у поточному списку не існує.");
        }

    }


    //        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
    public void increasePrice(Type value) {
        for (Product element : productList) {
            if (element.getType() == value) {
                element.setPrice(element.getPrice() * 2);
            }
        }
    }


    //        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран
    //        (наприклад "В нашому магазині продаються такі преміум товари:...)

    public void setPremiumProducts(int regularPrice) {
        List<Product> premiumProducts = new ArrayList<>();
        for (Product element : productList) {
            if (element.getPrice() > regularPrice) {
                premiumProducts.add(element);
            }
        }
        if (premiumProducts.size() > 0) {
            System.out.println("В нашому магазині продаються такі преміум товари:... ");
            for (Product element : premiumProducts) {
                System.out.println(element);
            }
        }
    }

    //        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу
    //        і вивести її на екран

    public void sumPriceOfType(Type value) {

        double sumPriceOfType = 0;
        for (Product element : productList) {
            if (element.getType() == value) {
                sumPriceOfType += element.getPrice();
            }
        }
        System.out.println("Сума товарів за типом " + value.name() + ": " + sumPriceOfType);

    }

    //        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
    public void averagePrice_Of_All_Products() {

        double averagePriceOfAllProducts = 0;

        for (Product element : productList) {
            averagePriceOfAllProducts += element.getPrice();
        }

        averagePriceOfAllProducts /= productList.size();

        System.out.println("Середня вартість усіх товарів: " + averagePriceOfAllProducts);
    }

    // Для роботи з колекцією варто ще створити метод, який наповнить наш магазин одразу же ж певною кількістю продуктів

    public void addReadyProducts() {
        Random r = new Random();
        int max1 = 99999;
        int min1 = 10000;

        int diff1 = max1 - min1;
        int max2 = 5000;
        int min2 = 1000;
        int diff2 = max2 - min2;

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Помідор",
                50, Type.HZ,
                "Nice tomato",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Яблуко",
                30.3,
                Type.FRUITS,
                "Nice apple",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "" +
                        "Кратопля",
                15.4, Type.VEGETABLES,
                "Nice potato",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Малина",
                70.5,
                Type.FRUITS,
                "Nice raspberry",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Морква",
                20, Type.VEGETABLES,
                "Nice carrots",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Лохина",
                300, Type.FRUITS,
                "Nice blueberry",

                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Груша",
                32.3,
                Type.FRUITS,
                "Nice pear",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Банан",
                35, Type.FRUITS,
                "Nice banana",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Броколі",
                50, Type.VEGETABLES,
                "Nice broccoli",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Капуста",
                25.0, Type.VEGETABLES,
                "Nice cabbage",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Ліщина",
                150.3, Type.NUT,
                "Nice hazel",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Кедровий горіх",
                300.7,
                Type.NUT,
                "Nice nut",
                r.nextInt(diff1 + 1) + min1));

        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Грецький горіх",
                120.01, Type.NUT,
                "Nice walnut",
                r.nextInt(diff1 + 1) + min1));
        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Грецький горіх",
                120.01, Type.NUT,
                "Nice walnut",
                r.nextInt(diff1 + 1) + min1));
        productList.add(new Product(
                r.nextInt(diff2 + 1) + min2,
                "Грецький горіх",
                120.01, Type.NUT,
                "Nice walnut",
                r.nextInt(diff1 + 1) + min1));


    }

    @Override
    public String toString() {
        String text = "";
        for (Product element : productList) {
            text += "\n" + "Код продукту: " + element.getProductCode() + "\n" +
                    "Назва: " + element.getName() + "\n" +
                    "Ціна: " + element.getPrice() + "\n" +
                    "Тип: " + element.getType().name() + "\n" +
                    "Виробник: " + element.getMaker() + "\n" +
                    "Код виробника: " + element.getMakerCode() + "\n" +
                    "________________________________________________________________" + "\n";
        }
        return text;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}


