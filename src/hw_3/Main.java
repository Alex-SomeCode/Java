package hw_3;

//        1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L).
//                Написати в ньому абстрактий метод getDescription.
//                Оверрайднути метод getDescription для всіх об'єктів енума, який повертатиме стрічку - опис розміра (просто якийсь текст).
//                Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.
//        2. Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".
//        3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум), вартість, колір.
//        4. Створити класи нащадки до класу Одяг - Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
//                Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг), Плаття (реалізує інтерфейс "Жіночий одяг"),
//                Галстук (реалізує інтерфейси Чоловічий одяг).
//        5. Створити клас Ательє, який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
//        та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
//        та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Atelier test = new Atelier();
//        test.size.XS.getDescription();

        Tie tie1 = new Tie(Size.L, 300, "red", "модняча");
        System.out.println(tie1);
        Tie tie2 = new Tie(Size.M, 300, "black", "шикарна");
        Tie tie3 = new Tie(Size.S, 300, "red", "класична");
        Tie tie4 = new Tie(Size.XXS, 300, "green", "сучасна");

        Dress dress1 = new Dress(Size.M, 2000, "grey", "чудове");
        Dress dress2 = new Dress(Size.M, 18000, "black", "цікаве");
        Dress dress3 = new Dress(Size.M, 3000, "green", "неповторне");
        Dress dress4 = new Dress(Size.M, 30000, "orange", "унікальне");

        T_shirt t_shirt1 = new T_shirt(Size.L, 200, "blue", "крута");
        T_shirt t_shirt2 = new T_shirt(Size.L, 200, "orange", "повсякденна");
        T_shirt t_shirt3 = new T_shirt(Size.L, 200, "black", "простяцька");
        T_shirt t_shirt4 = new T_shirt(Size.L, 200, "blue", "унікальна");

        Trousers trousers1 = new Trousers(Size.S, 300, "darkblue", "повсякденні");
        Trousers trousers2 = new Trousers(Size.M, 300, "green", "нарядні");
        Trousers trousers3 = new Trousers(Size.L, 300, "black", "робочі");
        Trousers trousers4 = new Trousers(Size.XS, 300, "wight", "святкові");




        Clothes[] arrayCloth = new Clothes[20];

//      інша синтаксична форма реалізації передачі мвсиву як аргументу
//      Atelier atelier = new Atelier(new Clothes [] {елементи масиву});
        Atelier atelier = new Atelier(arrayCloth);

        atelier.setClothes(arrayCloth);

        arrayCloth[0] = t_shirt1;
        arrayCloth[1] = t_shirt2;
        arrayCloth[2] = t_shirt3;
        arrayCloth[3] = t_shirt4;
        arrayCloth[4] = dress1;
        arrayCloth[5] = dress2;
        arrayCloth[6] = dress3;
        arrayCloth[7] = dress4;
        arrayCloth[8] = tie1;
        arrayCloth[9] = tie2;
        arrayCloth[10] = tie3;
        arrayCloth[11] = tie4;
        arrayCloth[12] = trousers1;
        arrayCloth[13] = trousers2;
        arrayCloth[14] = trousers3;
        arrayCloth[15] = trousers4;
        arrayCloth[19] = trousers4;


        System.out.println("------------------- чоловічий одяг-------------------------------");

        MenClothes[] arrayForMan = atelier.menClothes();
//        System.out.println(Arrays.toString(arrayForMan));

        for (MenClothes value : arrayForMan) {
            if (value == null) break;
            System.out.println(value.toDressMan());
        }

        System.out.println("---------------------------------------------------------------------");



        System.out.println("------------------- жіночий одяг---------------------------------");
//        System.out.println(atelier.womenClothes());

        for (WomenClothes value : atelier.womenClothes()) {
            if (value == null) break;
                System.out.println(value.toDressWomen());
        }

        System.out.println("---------------------------------------------------------------------");

        for (Clothes cloth : arrayCloth) {
            if (cloth == null) break;
            System.out.println();
            System.out.println(cloth);
            System.out.println(cloth.getPrice());
            System.out.println(cloth.getName());
            System.out.println(cloth.getSize().ordinal());
            System.out.println(cloth.getSize().getEuroSize());
            System.out.println(cloth.getSize().getDescription());

        }

        System.out.println(Size.XS.getEuroSize());

        System.out.println(atelier);

    }

}
