import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //Коллекции
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);
        numbers.add(1, 30);
//        System.out.println
        for(Integer el : numbers) {
            System.out.println(el);
        }
    }
    }