package hw_6_1;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

//  -создать массив с 20 числами.

        ArrayList<Integer> intCollection = new ArrayList<>();
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));
        intCollection.add(r.nextInt(Integer.MAX_VALUE));

//       -- при помощи метода sort и колбека отсортировать массив.

        System.out.println("-------------------min to max------------------------------------");
        List<Integer> collect1 = intCollection.stream().sorted().collect(Collectors.toList());
        collect1.forEach(number -> System.out.println(number));

//       -- при помощи метода sort и колбека отсортировать массив в ниспадающем напралении.

        List<Integer> collect2 = intCollection.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).collect(Collectors.toList());
        System.out.println("-------------------max to min------------------------------------");
        collect2.forEach(number -> System.out.println(number));


        //       -- при помощи filter получить числа кратные 3
        System.out.println("--------------------/3----------------------------------");
        List<Integer> collect3 = intCollection.stream().filter(number -> number % 3 == 0).collect(Collectors.toList());
        collect3.forEach(number -> System.out.println(number));


//       -- при помощи filter получить числа кратные 10
        System.out.println("--------------------/10----------------------------------");
        List<Integer> collect4 = intCollection.stream().filter(number -> number % 10 == 0).collect(Collectors.toList());
        collect4.forEach(number -> System.out.println(number));


//       -- перебрать(проитерировать) массив при помощи foreach ()
        System.out.println("--------------------перебрать----------------------------------");
        intCollection.forEach(element -> System.out.println(element));


//       -- перебрать массив при помощи map() и получить новый массив в котором все значения будут в 3 раза больше
        System.out.println("-------------------- * на 3 ----------------------------------");
        List<Integer> collect5 = intCollection.stream().map(number -> number * 3).collect(Collectors.toList());
        collect5.forEach(System.out::println);
        /*collect5.forEach(number-> System.out.println(number));*/


//       - создать массив со словами на 15 - 20 элементов.
        System.out.println("-------------------- со словами на 15 - 20 элементов ----------------------------------");

        List<String> strCollection = new ArrayList<>();
        strCollection.add("one");
        strCollection.add("second");
        strCollection.add("third");
        strCollection.add("fourth");
        strCollection.add("fifth");
        strCollection.add("sixth");
        strCollection.add("seventh");
        strCollection.add("eighth");
        strCollection.add("ninth");
        strCollection.add("tenth");
        strCollection.add("eleventh");
        strCollection.add("twelfth");
        strCollection.add("thirteenth");
        strCollection.add("fifteenth");
        strCollection.add("sixteenth");
        strCollection.add("seventeenth");

//       -- отсортировать его по алфавиту в восходящем порядке.
        System.out.println("--------------------- в алфавитном порядке -------------------------- ");
//        String::compareTo
        List<String> collect7 = strCollection.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        collect7.forEach(str -> System.out.println(str));

//       -- отсортировать его по алфавиту в нисходящем порядке.
        System.out.println("--------------------- по алфавиту в нисходящем порядке -------------------------- ");
//        (Comparator.reverseOrder()
        List<String> collect8 = strCollection.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(collect8);

//       -- отфильтровать слова длиной менее 4 х символов
        System.out.println("--------------------- отфильтровать слова длиной менее 4 х символов -------------------------- ");
        List<String> collect9 = strCollection.stream().filter(str -> str.length() < 4).collect(Collectors.toList());
        collect9.forEach(str -> System.out.println(str));

//       -- перебрать массив при помощи map () и получить новый массив в котором все значения будут со знаком "!" в конце
        System.out.println("--------------------- в котором все значения будут со знаком \"!\" в конце -------------------------- ");
        List<String> collect10 = strCollection.stream().map(str -> str.concat("!")).collect(Collectors.toList());
        collect10.forEach(str -> System.out.println(str));

//        Все робити через функції масивів(foreach, map ...тд)
//        Дан масив :

//        let users = [{
//                      name:
//                      "vasya", age:31, status:false
//                  },{
//                      name:
//                      "petya", age:30, status:true
//                  },{
//                      name:
//                      "kolya", age:29, status:true
//                  },{
//                      name:
//                      "olya", age:28, status:false
//                  },{
//                      name:
//                      "max", age:30, status:true
//                  },{
//                      name:
//                      "anya", age:31, status:false
//                  },{
//                      name:
//                      "oleg", age:28, status:false
//                  },{
//                      name:
//                      "andrey", age:29, status:true
//                  },{
//                      name:
//                      "masha", age:30, status:true
//                  },{
//                      name:
//                      "olya", age:31, status:false
//                  },{
//                      name:
//                      "max", age:31, status:true
//                  }];

        User user1 = new User("vasya", 31, false);
        User user2 = new User("petya", 30, true);
        User user3 = new User("kolya", 29, true);
        User user4 = new User("olya", 28, true);
        User user5 = new User("anya", 31, false);
        User user6 = new User("oleg", 28, false);
        User user7 = new User("andrey", 29, true);
        User user8 = new User("masha", 29, true);
        User user9 = new User("olya", 31, false);
        User user10 = new User("max", 31, true);

//  - відсортувати його за віком(зростання, а потім окремо спадання)
        System.out.println("---------------------  відсортувати його за віком(зростання,");
        List<User> usersCollections =
                Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
        List<User> collect11 = usersCollections.stream()
                .sorted((userLeft, userRight) -> userLeft.getAge() - userRight.getAge())
                .collect(Collectors.toList());
        collect11.forEach(user -> System.out.println(user));

        System.out.println("---------------------  а потім окремо спадання)");
        List<User> collect12 = usersCollections.stream()
                .sorted((userLeft, userRight) -> userRight.getAge() - userLeft.getAge())
                .collect(Collectors.toList());
        collect12.forEach(System.out::println);


//  - відсортувати його за кількістю знаків в імені (зростання, а потім окремо спадання)

        System.out.println("------------ відсортувати його за кількістю знаків в імені (зростання,----------------");
        List<User> collect13 = usersCollections.stream()
                .sorted((userLeft, usersRight) -> userLeft.getName().length() - usersRight.getName().length())
                .collect(Collectors.toList());

        collect13.forEach(System.out::println);


        System.out.println("------------ , а потім окремо спадання----------------");
        List<User> collect14 = usersCollections.stream()
                .sorted((o1, o2) -> o2.getName().length() - o1.getName().length())
                .collect(Collectors.toList());

        collect14.forEach(user -> System.out.println(user));


//  - пройтись по ньому та додати кожному юзеру поле id -яке характеризує унікальний
//        індентифікатор(По якому принципу його створювати - ваше рішення), та зберегти це в новий
//        масив(первинний масив залишиться без змін)


        System.out.println("------------ пройтись по ньому та додати кожному юзеру" +
                " поле id -яке характеризує унікальний----------------");

        List<User> collect15 = usersCollections.stream().map(new Function<User, User>() {
            @Override
            public User apply(User user) {
                User innerUser = new User(user.getName(), user.getAge(), user.isStatus());
                innerUser.setId(new Random().nextInt(Integer.MAX_VALUE));
                return innerUser;
            }
        }).collect(Collectors.toList());
        collect15.forEach(user -> System.out.println(user));
        System.out.println("=======================================================");
        System.out.println("_____Original users________");
        usersCollections.forEach(user -> System.out.println(user));
        System.out.println("=======================================================");


//  - відсортувати його за індентифікатором
        List<User> collect16 = collect15.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList());

        System.out.println("--------------------------------");
        collect16.forEach(user -> System.out.println(user));
        System.out.println("--------------------------------");
        collect15.forEach(user -> System.out.println(user));


//  -- наисать функцию калькулятора с 2 мя числами и колбеком

        double x1 = Calculator.calculator2Elements(5, 2, "*");
        System.out.println(x1);

//  -- наисать функцию калькулятора с 3 мя числами и колбеком
        double x2 = Calculator.calculator3Elements(3.0, 3, 2, "*", "/");
        System.out.println(x2);

//=============================================
//=============================================
//=============КЛАССНАЯ РАБОТА=================
//=============================================
//=============================================

        Car car1 = new Car("subaru", "wrx", 2010, "blue", "sedan", "ej204x", 2, 400);
        Car car2 = new Car("subaru", "legacy", 2007, "silver", "sedan", "ez30", 3, 250);
        Car car3 = new Car("subaru", "tribeca", 2011, "white", "jeep", "ej20", 2, 300);
        Car car4 = new Car("subaru", "leone", 1998, "yellow", "sedan", "ez20x", 2, 140);
        Car car5 = new Car("subaru", "impreza", 2014, "red", "sedan", "ej204x", 2, 200);
        Car car6 = new Car("subaru", "outback", 2014, "red", "hachback", "ej204", 2, 165);
        Car car7 = new Car("bmw", "115", 2013, "red", "hachback", "f15", 1.5, 120);
        Car car8 = new Car("bmw", "315", 2010, "white", "sedan", "f15", 1.5, 120);
        Car car9 = new Car("bmw", "650", 2009, "black", "coupe", "f60", 6, 350);
        Car car10 = new Car("bmw", "320", 2012, "red", "sedan", "f20", 2, 180);
        Car car11 = new Car("mercedes", "e200", 1990, "silver", "sedan", "eng200", 2, 180);
        Car car12 = new Car("mercedes", "e63", 2017, "yellow", "sedan", "amg63", 3, 400);
        Car car13 = new Car("mercedes", "c250", 2017, "red", "sedan", "eng25", 2.5, 230);

//        Відфільтрувати масив за наступними крітеріями:
//        -двигун більше 3 х літрів
        System.out.println("------------------------------   -двигун більше 3 х літрів");
        List<Car> carsCollections = Arrays.asList(car1, car2, car4, car3, car5, car6, car7, car8, car9, car10, car11, car12, car13);
        List<Car> collect17 = carsCollections.stream().filter(car -> car.getVolume() > 3).collect(Collectors.toList());
        collect17.forEach(System.out::println);
        //        -двигун = 2 л
        System.out.println("-----------------------двигун = 2 л");
        List<Car> collect18 = carsCollections.stream().filter(car -> car.getVolume() == 2).collect(Collectors.toList());
        collect18.forEach(car -> System.out.println(car));
//                - виробник мерс
        System.out.println("----------------------- - виробник мерс");
        List<Car> mercedes = carsCollections.stream().filter(car -> car.getProducer()
                .toLowerCase().equals("mercedes")).collect(Collectors.toList());
        mercedes.forEach(System.out::println);
//                - двигун більше 3 х літрів +виробник мерседес
        System.out.println("----------------------- - двигун більше 3 х літрів +виробник мерседес");

        List<Car> mercedes1 = carsCollections.stream().filter(car -> car.getVolume() > 3)
                .filter(car -> car.getProducer().equals("mercedes")).collect(Collectors.toList());
        mercedes1.forEach(System.out::println);

//                - двигун більше 3 х літрів +виробник субару
        System.out.println("----------------------- - двигун більше 3 х літрів +виробник субару");

        List<Car> subaru = carsCollections.stream().filter(car -> car.getVolume() > 3)
                .filter(car -> car.getProducer().equals("subaru")).collect(Collectors.toList());
        subaru.forEach(System.out::println);

//                - сили більше ніж 300
        System.out.println("----------------------- - сили більше ніж 300");

        List<Car> collect19 = carsCollections.stream().filter(car -> car.getPower() > 300)
                .collect(Collectors.toList());
        collect19.forEach(car -> System.out.println(car));

//                - сили більше ніж 300 + виробник субару
        System.out.println("-----------------------  - сили більше ніж 300 + виробник субару");
        List<Car> subaru1 = carsCollections.stream().filter(car -> car.getPower() > 300)
                .filter(car -> car.getProducer().equals("subaru")).collect(Collectors.toList());
        subaru1.forEach(System.out::println);

//                - мотор серіі ej
        System.out.println("-----------------------  - мотор серіі ej");
        List<Car> ej = carsCollections.stream()
                .filter(car -> car.getEngine().contains("ej")).collect(Collectors.toList());
        ej.forEach(System.out::println);

//        -сили більше ніж 300 + виробник субару + мотор серіі ej
        System.out.println("-----------------------  -сили більше ніж 300 + виробник субару + мотор серіі ej");
        List<Car> collect20 = carsCollections.stream().filter(car -> car.getPower() > 300)
                .filter(car -> car.getProducer().equals("subaru"))
                .filter(car -> car.getEngine().contains("ej")).collect(Collectors.toList());
        collect20.forEach(System.out::println);


//        -двигун меньше 3 х літрів +виробник мерседес
        System.out.println("-----------------------  -двигун меньше 3 х літрів +виробник мерседес");
        List<Car> mercedes3 = carsCollections.stream().filter(car -> car.getVolume() < 3).filter(car -> car.getProducer().equals("mercedes"))
                .collect(Collectors.toList());
        mercedes3.forEach(System.out::println);

//                - двигун більше 2 л + сили більше 250
        System.out.println("-----------------------  -двигун меньше 3 х літрів +виробник мерседес");
        List<Car> collect21 = carsCollections.stream().filter(car -> car.getVolume() > 2).filter(car -> car.getPower() > 250).collect(Collectors.toList());
        collect21.forEach(System.out::println);

//                - сили більше 250 + виробник бмв
        List<Car> bmw = carsCollections.stream().filter(car -> car.getPower() > 250)
                .filter(car -> car.getProducer().equals("bmw"))
                .collect(Collectors.toList());
        bmw.forEach(System.out::println);

//                - взять слдующий массив

        nextUsers user_1 = new nextUsers(1, "vasya", 31, false, "Lviv", "Shevchenko", 16);
        nextUsers user_2 = new nextUsers(2, "petya", 30, true, "Lviv", "Shevchenko", 1);
        nextUsers user_3 = new nextUsers(3, "kolya", 29, true, "Lviv", "Shevchenko", 121);
        nextUsers user_4 = new nextUsers(4, "olya", 28, false, "Lviv", "Shevchenko", 90);
        nextUsers user_5 = new nextUsers(5, "max", 30, true, "Lviv", "Shevchenko", 115);
        nextUsers user_6 = new nextUsers(6, "anya", 31, false, "Lviv", "Shevchenko", 2);
        nextUsers user_7 = new nextUsers(7, "oleg", 28, false, "Lviv", "Shevchenko", 22);
        nextUsers user_8 = new nextUsers(8, "andrey", 29, true, "Lviv", "Shevchenko", 43);
        nextUsers user_9 = new nextUsers(9, "masha", 30, true, "Lviv", "Shevchenko", 12);
        nextUsers user_10 = new nextUsers(10, "olya", 31, false, "Lviv", "Shevchenko", 16);
        nextUsers user_11 = new nextUsers(11, "max", 31, true, "Lviv", "Shevchenko", 121);


        List<nextUsers> nextUsersCollections = Arrays.asList(user_1, user_2, user_3, user_4, user_5,
                user_6, user_7, user_8, user_9, user_10, user_11);
//        --отсортировать его по id пользователей
        System.out.println("---------------- --отсортировать его по id пользователей");
        List<nextUsers> nextUsersCollect_1 =
                nextUsersCollections.stream().sorted((o1, o2) -> o1.getId() - o2.getId())
                        .collect(Collectors.toList());
        nextUsersCollect_1.forEach(System.out::println);


//        --отсортировать его по id пользователей в обратном опрядке
        System.out.println("---------------- по id пользователей в обратном опрядке");
        List<nextUsers> nextUsersCollect_2 =
                nextUsersCollections.stream()
                        .sorted((o1, o2) -> o2.getId() - o1.getId()).collect(Collectors.toList());
        nextUsersCollect_2.forEach(user -> System.out.println(user));

//                -- отсортировать его по возрасту пользователей
        System.out.println("----------------  -- отсортировать его по возрасту пользователей");
        List<nextUsers> nextUsersCollect_3 =
                nextUsersCollections.stream()
                        .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                        .collect(Collectors.toList());
        nextUsersCollect_3.forEach(user -> System.out.println(user));

//                -- отсортировать его по возрасту пользователей в обратном порядке
        System.out.println("----------------  по возрасту пользователей в обратном порядке");
        List<nextUsers> nextUsersCollect_4 =
                nextUsersCollections.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge())
                        .collect(Collectors.toList());
        nextUsersCollect_4.forEach(user -> System.out.println(user));

//        --отсортировать его по имени пользователей
        System.out.println("-----------------------  --отсортировать его по имени пользователей");
        List<nextUsers> nextUsersCollect_5 =
                nextUsersCollections.stream()
                        .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                        .collect(Collectors.toList());
        nextUsersCollect_5.forEach(System.out::println);

//        --отсортировать его по имени пользователей в обратном порядке
        System.out.println("-----------------------  по имени пользователей в обратном порядке");
        List<nextUsers> nextUsersCollect_7
                = nextUsersCollections.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList());
        nextUsersCollect_7.forEach(System.out::println);

//                -- отсортировать его по названию улицы в алфавитном порядке
        System.out.println("-----------------------  -- отсортировать его по названию улицы в алфавитном порядке");
        List<nextUsers> nextUsersCollect_8 = nextUsersCollections.stream()
                .sorted(Comparator.comparing(nextUsers::getStreet))
                .collect(Collectors.toList());
        nextUsersCollect_8.forEach(System.out::println);


//        --отсортировать его по номеру дома по возрастанию
        System.out.println("-----------------------  --отсортировать его по номеру дома по возрастанию");
        List<nextUsers> nextUsersCollect_9 = nextUsersCollections.stream()
                .sorted(Comparator.comparingInt(nextUsers::getNumber)).collect(Collectors.toList());
        nextUsersCollect_9.forEach(System.out::println);

//        --отфильтровать(оставить) тех кто младше 30
        System.out.println("-----------------------  --отфильтровать(оставить) тех кто младше 30");
        List<nextUsers> nextUsersCollect_10 = nextUsersCollections.stream()
                .filter(user -> user.getAge() < 30)
                .collect(Collectors.toList());
        nextUsersCollect_10.forEach(System.out::println);

//                -- отфильтровать(оставить) тех у кого отрицательный статус
        System.out.println("-----------------------  -- отфильтровать(оставить) тех у кого отрицательный статус");
        List<nextUsers> nextUsersCollect_11 =
                nextUsersCollections.stream().filter(user -> !user.isStatus()).collect(Collectors.toList());
        nextUsersCollect_11.forEach(System.out::println);


//                -- отфильтровать(оставить) тех у кого отрицательный статус и младше 30 лет
        System.out.println("----------- -- отфильтровать(оставить) тех у кого отрицательный статус и младше 30 лет");
        List<nextUsers> nextUsersCollect_12 = nextUsersCollections.stream().filter(user -> user.getAge() < 30)
                .filter(user -> !user.isStatus()).collect(Collectors.toList());
        nextUsersCollect_12.forEach(System.out::println);

//                -- отфильтровать(оставить) тех у кого номер дома четный
        List<nextUsers> nextUsersCollect_13 =
                nextUsersCollections.stream()
                        .filter(user -> user.getNumber() % 2 == 0)
                        .collect(Collectors.toList());
        nextUsersCollect_13.forEach(System.out::println);

//                  ===========================
//                  ======ДОПОЛНИТЕЛЬНО ========
//                  ===========================

//        Створити обєкт автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//                Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.

        Driver driver1 = new Driver("Driver_1", 20, 2);
        Driver driver2 = new Driver("Driver_2", 22, 1);
        Driver driver3 = new Driver("Driver_3", 25, 3);
        Driver driver4 = new Driver("Driver_4", 29, 3);
        Driver driver5 = new Driver("Driver_5", 18, 0);
        Driver driver6 = new Driver("Driver_6", 40, 20);
        Driver driver7 = new Driver("Driver_7", 60, 28);

//                Створити не менше 7 та не більше 20 машинок.
        NextCar carN1 = new NextCar("subaru", 400, driver1, 7000, 2010);
        NextCar carN2 = new NextCar("bmw", 120, driver2, 5000, 2016);
        NextCar carN3 = new NextCar("bmw", 350, driver3, 9000, 2017);
        NextCar carN4 = new NextCar("bmw", 180, driver4, 8000, 2018);
        NextCar carN5 = new NextCar("mercedes", 82, driver5, 6000, 2019);
        NextCar carN6 = new NextCar("mercedes", 100, driver6, 7000, 2000);
        NextCar carN7 = new NextCar("mercedes", 230, driver7, 10000, 2010);


//        Зробили половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10 % (переприсвоєння
//        змінної потужності).
//        На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
//                - Для початку вкладіть всі наші створені автомобілі в масив cars.
//                - Далі необхідно рати кожну другу машинку (цикл з кроком в 2),та робити їй підвищення потужності двигуна на
//        10 % та ціну на 5 %
//                - Після того зробити перевірку досвіду ВСІХ наших водіїв.Якщо досвід водія менший за 5 років, але його вік
//        більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//
//                Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі


//        Для початку вкладіть всі наші створені автомобілі в масив cars.
        System.out.println("________________________________________");
        List<NextCar> nextCarsCollection = Arrays.asList(carN1, carN2, carN3, carN4, carN5, carN6, carN7);
        nextCarsCollection.forEach(System.out::println);

//        Далі необхідно рати кожну другу машинку (цикл з кроком в 2),та робити їй підвищення потужності двигуна на
//        10 % та ціну на 5 %
        System.out.println("_______________________________________________________________________" + "\n"
                + "-------------кожну другу машинку (цикл з кроком в 2),та робити їй підвищення потужності" +
                " двигуна на 10 % та ціну на 5 %" + "\n");
//        double x = 4.0;
//        int a =(int)  x;

//  !!! як можливсть виконання даного завдання використовуючи IntStream !!!
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> collect = IntStream.range(0, list.size())
//                .filter(n -> n % 3 == 0) //3 - каждый 3-ий элемент
//                .mapToObj(list::get)
//                .collect(Collectors.toList());
//
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        for (int i = 1; i < nextCarsCollection.size(); i += 2) {
            NextCar value = nextCarsCollection.get(i);
            value.setPower((int) (value.getPower() * 1.1));
            value.setPrice((int) (value.getPrice() * 1.05));
        }
        nextCarsCollection.forEach(System.out::println);


//        - Після того зробити перевірку досвіду ВСІХ наших водіїв.Якщо досвід водія менший за 5 років, але його вік
//        більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        System.out.println("_______________________________________________________________________" + "\n"
                + "-------------зробити перевірку досвіду ВСІХ наших водіїв.Якщо досвід водія менший за 5 років," +
                " але його вік\n" +
                "більший за 25, то необідно відправити його на курси підвищення кваліфікації," +
                " що збільшить йому досвід на 1 рік" + "\n");

        List<NextCar> educationDriversCollect = nextCarsCollection.stream().map(car -> {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(car.getDriver().getExperience());
            if (car.getDriver().getExperience() < 5 && car.getDriver().getAge() > 25) {
                car.getDriver().setExperience(car.getDriver().getExperience() + 1);
                System.out.println(car.getDriver().getExperience());
            }
            return car;
        }).collect(Collectors.toList());


        educationDriversCollect.forEach(System.out::println);

//        Задача:
//        дан отсортированный по возрастанию массив целых чисел.Необходимо вернуть наименьший и наибольший индекс
//        заданного элемента.
//        Входные данные:
//                arr —массив целых чисел значения которых по модулю не больше 10. Размер массива не более 10
//        элементов.
//                Вывод:наибольший и наименьший индекс в массиве заданного элемента.Если такого элемента нет
//        в массиве, выведите -1.

        int value = 14;
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 7, 7, 9, 14};

        int lastIndex = -1;
        int firstIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if (firstIndex == -1) firstIndex = i;
                 lastIndex = i;
            }
        }

        System.out.println(firstIndex + "  " + lastIndex);


//        Пример:
//        Arr = [1, 2, 3, 4, 4, 4, 4, 7, 7, 9, 14]
//        1. Key = 1
//        Answer:
//        MinIndex = 0, MaxIndex = 0.
//        2. Key = 4
//        Answer:
//        MinIndex = 3, MaxIndex = 6.


    }
}



