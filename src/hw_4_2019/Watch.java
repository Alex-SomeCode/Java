package hw_4_2019;

import java.util.LinkedList;
import java.util.List;

public class Watch {

    private String brand;
    private String model;
    private static List<String> functions;

    public Watch(String brand, String model) {
        functions = new LinkedList<>();
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static List<String> getFunctions() {
        return functions;
    }

    public static void setFunctions(List<String> functions) {
        Watch.functions = functions;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", functions=" + functions +
                '}';
    }

    // Створити внутрішній класс який додає елементи в кінець масиву, та додає елементи в конкретну позицію масиву.

    public static class AddFunction {
        public static void newFunctionOnIndex(String function, int indexNumber) {
            functions.add(indexNumber, function);
        }

        public static void newFunctionOnAndArray(String function) {
            functions.add(function);
        }
    }

    //        Створити внутрішній класс який видаляє елементи з цього масиву , видаляє елемент з певної позиції.

    public static class RemoveFunction {
        public static void deleteFunctionByName(String nameFunction) {
            functions.remove(nameFunction);
        }

        public static void deleteFunctionByIndex(int index) {
            functions.remove(index);
        }
    }

//    Створити внутрішній класс який ітерує елементи. Виклик методу next() вертає 1й елемент,
//        наступний виклик вертає 2й і тд...
//        Виклик методу prev() - робить те саме що і next() тільки в зворотньому напрямку
//        (з урахуванням поточної позиції і викликів next())

    public static class FunctionIterator {
        static int n = 0;

        public static void nextIteration() {
            if (n == functions.size() - 1) {
                n = -1;
            }
            System.out.println("next: " + functions.get(++n));
        }

        public static void previousIteration() {
            if (n <= 0) {
                n = functions.size();
            }
            System.out.println("previous: " + functions.get(--n));

        }

    }

}




