import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    1.Переменные
//        int age;
//        age = 45;
//        age = -34;
//        System.out.println("Возраст " + age);


//    byte - от -128 до 127 и занимает 1 байт
//    short - от -32768 до 32767  занимает 2 байта
//    int  - от -2 147 483 648 до 2 147 483 647 и занимает 4 байта
//    long - от -9 223 374 039 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

//        byte ks = 120;
//        short nam1 = 129;
//        int nam2 = 77;
//        long nam3 = 456700025;
//
//        float nam4 = 3.14f;
//        double nam5 = 6.7895213456d;
//        double nam6 = 6.7895213456;
//        char hh = 'Y';
//        char hh1 = '5';
//
//       String user_name = "Fedor";
//        System.out.println(user_name);
//
//        boolean isIll =fallse;

        Scanner scan = new Scanner( System.in);
//    Для получения строки от пользователя используется scan.nextLine()
//        System.out.println("Введите Ваше имя: ");
//        String username = scan.nextLine();
//        System.out.println("Привет, " + username +"!");
//
//
//      Для получения числа от пользователя используется scan.nextInt(),
//      для получения каждого типа данных свой сканер
//     Если ввести на запрос число, то всё ок, если букву или  что-то ещё, будет ошибка
//
//  int num1 = scan.nextInt();
//    byte num2 = scan.nextByte();
//    boolean nam3 = scan.hasNextBoolean();
//
//        short num1 = 50, num2 = 70;
//        int res1 = num1 + num2;
//        System.out.println("Результат: " + res1);
//
//        float num4 = 4, num5 = 33;
//        float res2 = num4 * num5;
//        res2 += 10;
//        res2 ++;
//        res2 --;
//        System.out.println(res2);

//  Калькулятор)) условный

//        System.out.println("Введите первое число: ");
//        float num1 = scan.nextFloat();
//
//        System.out.println("Введите второе число: ");
//        float num2 = scan.nextFloat();
//
//        float res1 = num1 + num2;
//        float res2 = num1 * num2;
//        float res3 = num1 / num2;
//        float res4 = num1 - num2;
//        float res5 = num1 % num2;
//
//        System.out.println("Результат: ");
//        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n"+ res4 + "\n"+ res5);
//  УСЛОВНЫЕ КОНСТРУКЦИИ if- else
//        В конструкции if - else, else не обязательная часть, но всегда идёт после if.
//        В консрукции if - else-if - else - else...  "else - if" может употребляться полько после if.
//         В каждой из конструкций внутри может быть ещё встроено уловие if()...

//        int a =65, b = 60;
//        char sim1 = 'a', sim2 ='A';
//        boolean isHAPPY = false;
//        if (!isHAPPY) {
//            System.out.println("Верно!!!");
//        } else if (a >= b) {
//            System.out.println("Проверка верности второго утверждения");
//        } else {
//            System.out.println("Не верно!!!");
////        }
//        int a =1, b = 44;
//        char sim1 = 'a', sim2 ='A';
//        boolean isHAPPY = false;
//        if (!isHAPPY) {
//            System.out.println("Верно!!!");
//        } else if (a >= b) {
//            System.out.println("Проверка верности второго утверждения");
//        } else if(a == b){
//            System.out.println("тест3");
//        }  else if(a != b){
//        System.out.println("тест4");
//        } else if(a < b){
//            System.out.println("тест5");
//        }
//        ИЛИ
//        if (!isHAPPY || a == b) {  в этой конструкции || это означает "или"
//        if (!isHAPPY && a == b) {   в этой конструкции &&  два амперсанта означает "и"
//        if (!isHAPPY && a == b || sim1 != sim2) {  можно сочетать и указывать много условий в if

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ведите роль: ");
//        String role = scanner.nextLine() ;
//        System.out.println("Ведите пароль: ");
//        String pass = scanner.nextLine();
//        if (role.equals("admin") && pass.equals("4856")) {
//            System.out.println("Доступ разрешен! ");
//        } else {
//            System.out.println("Привет! Как Вас зовут?");
//            String name = scan.nextLine();
//
//        }
// ОПЕРАТОР  switch-case должен завершаться оператором break, но в этой ситуации проверяются только четкие значения (равно пяти, например).
//        Последний   break можно не дописывать.
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scan.nextInt();
//        switch (num) {
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("Number is 2");
//                break;
//            case 10:
//                System.out.println("Number is 3");
//                break;
//            case 6:
//            System.out.println("Number is 4");
//        }

//        ЕЩЁ ОДИН КАЛЬКУЛЯТОР С switch-case
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        int res;

        System.out.println(" Действие: ");
        String action = scan.nextLine();

        switch (action){
            case "+":
                    res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 ==0)
                    System.out.println("Error");
                res = num1 / num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            default:
                System.out.println("Вы что-то не то ввели!");
        }




    }
}
