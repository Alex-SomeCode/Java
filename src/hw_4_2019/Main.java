package hw_4_2019;


public class Main {

    public static void main(String[] args) {

//         1. Створити клас "Користувач"
//                поля
//                ПІБ, вік, пошта,ід,телефон
//                За допомоги внутрішнього класу реалізувати паттерн "Builder"


        User.UserBuilder builder = User.builder();
        User user1 = builder.setFullName("Test").buildUser();
        System.out.println(user1.toString());
        Car.CarBuilder carBuilder = Car.builder();



//                2. Створити клас "Авто"
//                поля
//                модель, Двигун, Колеса[],ід, потужність
//                За допомоги внутрішнього класу реалізувати паттерн "Builder"


        Car car1 = Car.builder()
                .setModel("Ford")
                .setEngine(4.2)
                .setPower(400)
                .setWheels(new String[]{
                        "Переднє ліве - лите - розмір - 21 дюйм",
                        "Переднє праве - лите - розмір - 21 дюйм",
                        "Заднеє ліве - лите - розмір - 21 дюйм",
                        "Заднє праве - лите - розмір - 21 дюйм"
                })
                .buildCar();

        System.out.println(car1.toString());


//                3. Створити клас "Собака"
//                поля визначити самостійно, але не меньше 6.
//                За допомоги внутрішнього класу реалізувати паттерн "Builder"

        Dog dog1 = Dog.builder()
                .setDogName("BigBob")
                .setDogAge((byte) 4)
                .setDogWeight(10.2)
                .setDogSkills(new String []{
                        "jump",
                        "read",
                        "speak",
                        "java"
                })
                .setDogBreed("Nice dog")
                .buildDog();

        System.out.println(dog1.toString());

//
//                4. Створити будь-який клас на 10 полів
//                За допомоги внутрішнього класу реалізувати паттерн "Builder"

        Notebook notebook1 = Notebook.builder()
                .setNotebookBrand("SomeBrand")
                .setNotebookModel("SomeModel")
                .setNotebookColor("SomeColor")
                .setProcessorBrand("SomeProcessorBrand")
                .setProcessorModel("SomeProcessorModel")
                .setVideoCardBrand("SomeBrandVideo")
                .setVideoCardModel("SomeModeVideo")
                .setRAMBrand("SomeBrandDDR")
                .setRAMModel("DDR")
                .setRAMSize((byte) 4)
                .notebookBuild();

        System.out.println(notebook1.toString());




        //        CLASSWORK
        //        Створити класс який має в якості поля масив.

        //        Створити внутрішній класс який додає елементи в кінець масиву, та додає елементи в конкретну позицію масиву.
        //        Створити внутрішній класс який видаляє елементи з цього масиву , видаляє елемент з певної позиції.
        //
        //        Створити внутрішній класс який ітерує елементи. Виклик методу next() вертає 1й елемент,
        //        наступний виклик вертає 2й і тд...
        //        Виклик методу prev() - робить те саме що і next() тільки в зворотньому напрямку
        //        (з урахуванням поточної позиції і викликів next())


        Watch watch1 = new Watch("SomeBrand", "SomeModel");

        Watch.addFunction.newFunctionOnAndArray(watch1, "Timer-1");
        Watch.addFunction.newFunctionOnAndArray(watch1, "Timer-2");
        Watch.addFunction.newFunctionOnAndArray(watch1, "Timer-3");
        Watch.addFunction.newFunctionOnAndArray(watch1, "Timer-4");

        System.out.println(watch1.toString());

        Watch.addFunction.newFunctionOnIndex(watch1,"TimerX",0);
        System.out.println(watch1.toString());


        Watch.removeFunction.deleteFunctionByIndex(watch1,1);
        Watch.removeFunction.deleteFunctionByName(watch1,"Timer-4");
        System.out.println(watch1.toString());


        Watch.functionIterator.previousIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.previousIteration();
        Watch.functionIterator.previousIteration();
        Watch.functionIterator.previousIteration();
        Watch.functionIterator.nextIteration();
        Watch.functionIterator.nextIteration();

    }


}











