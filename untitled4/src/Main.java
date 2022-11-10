import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //1. Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
        for ( int i = 1; i < 6; i++ ){
            System.out.println(i);
        }
        System.out.println('\n');

        //2. Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        int i = 5;
        while ( i >= 1 ){
            System.out.println(i);
            i-=1;
        }
        System.out.println('\n');

        //3. Необходимо вывести на экран таблицу умножения на 3
        int f = 1;
        int s = 3;
        while ( f != 11 ){
            System.out.println(s * f);
            f++;
        }
        System.out.println('\n');

    }
}