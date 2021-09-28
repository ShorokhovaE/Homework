package lesson2;

import java.time.Month;
import java.time.YearMonth;

public class lesson2 {
        public static void main (String [] args) {
            System.out.println(within10and20(1, 5));
            isPositiveOrNegative(-10);
            System.out.println(isNegative(-10));
            printWordNTimes("Java", 5);
            System.out.println(leapYear(124));
            System.out.println(leapYear2(2024));
        }

        public static boolean within10and20 (int x1, int x2){
            int sum = x1 + x2;
            if(sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
        }

        public static void isPositiveOrNegative(int x){
            System.out.println( x < 0 ? "Число отрицательное" : "Число положительное" );
        }

        public static boolean isNegative (int x){
            return x < 0 ? true : false ;
        }

        public static void printWordNTimes(String word, int times){
            for (int i = 0; i < times; i++) {
                System.out.println(word);
            }
        }

        public static boolean leapYear (int year) { // первый вариант решения 5 задания
            if ( (year % 400 ) == 0){
                return true ;
            } else if ( (year % 100) == 0){
                return false ;
            } else if ( (year % 4 ) == 0){
                return true;
            } else {
                return false;
            }
        }

        public static boolean leapYear2 (int year){ // второй вариант решения 5 задания
            YearMonth date = YearMonth.of(year, Month.FEBRUARY);
            return date.lengthOfMonth() < 29 ? false : true;
        }
    }
