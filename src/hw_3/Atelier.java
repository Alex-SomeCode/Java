package hw_3;

import java.util.Arrays;

//  5. Створити клас Ательє, який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
//        та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
//        та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).

public class Atelier {
    private Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }


    public MenClothes[] menClothes() {
        MenClothes[] menClothes = new MenClothes[clothes.length];
        int i = 0;
        for (Clothes element : clothes) {
            if (element instanceof MenClothes) {
                menClothes[i++] = (MenClothes) element;
            }
        }

        return menClothes;

    }

    public WomenClothes[] womenClothes() {

        WomenClothes[] womenClothes = new WomenClothes[clothes.length];
        int i = 0;
        for (Clothes element : clothes) {
            if (element instanceof WomenClothes) {
                womenClothes[i++] = (WomenClothes) element;
            }

        }

        return womenClothes;

    }


    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }
}
