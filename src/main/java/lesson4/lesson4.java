package lesson4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {
        private static Scanner scanner;
        private static Random random;
        private static char[][] map;
        private static final int SIZE = 5;
        private static final char MAP_ELEMENT_EMPTY = '_';
        private static final char MAP_ELEMENT_X = 'X';
        private static final char MAP_ELEMENT_0 = '0';

        public static void main ( String [] args){
            initMap();
            scanner = new Scanner(System.in);
            random = new Random();
            do {
                playerTurn();
                printMap();
                if(chekWin(MAP_ELEMENT_X)){
                    System.out.println("Игра окончена! Победил игрок!");
                    break;
                }
                if(isMapFull()){
                    System.out.println("Игра окончена! Ничья!");
                    break;
                }
                aiTurn();
                printMap();
                if(chekWin(MAP_ELEMENT_0)){
                    System.out.println("Игра окончена! Победил ai!");
                    break;
                }
                if(isMapFull()){
                    System.out.println("Игра окончена! Ничья!");
                    break;
                }

            } while (true);



        }


        public static boolean chekWin (char element) {
        // способ проверки (5/5)
        int x;
       for (int i = 0; i < SIZE; i++) { // проверяем строки
           x = 0;
           for (int j = 0; j < SIZE; j++) {
               x = map[i][j] == element ? (x+1) : x;
               if(x == 4 && (map[i][0] != element || map[i][(SIZE - 1)] != element)){
                       return true;
                   }
               if ( x > 4){
                   return true;
               }
           }
       }
       for (int i = 0; i < SIZE; i++) { // проверяем столбцы
           x = 0;
           for (int j = 0; j < SIZE; j++) {
               x = map[j][i] == element ? (x+1) : x;
               if (x == 4 && (map[0][i] != element || map[(SIZE - 1)][i] != element)){
                       return true;
                   }
               if ( x > 4){
                   return true;
               }
           }
       }
       // проверяем диагонали

       x = 0;
       for (int i = 0; i < SIZE; i++) { // первая диагональ
           x = map[i][i] == element ? (x+1) : x;
           if(x==4 && (map[0][0] != element || map[(SIZE - 1)][(SIZE - 1)] != element)){
               return true;
           }
           if ( x > 4){
               return true;
           }
       }

        x=0; // вторая диагональ
       for (int i = (SIZE - 1), j = 0; i >= 0; i--, j++) {
           x = map[i][j] == element ? (x+1) : x;
           if(x==4 && (map[(SIZE - 1)][0] != element || map[0][(SIZE - 1)] != element)){
               return true;
           }
           if ( x > 4){
               return true;
           }
       }

       x=0; // третья диагональ
       for (int i = 1, j =0; i < SIZE; i++, j++) {
           x = map[j][i] == element ? (x+1) : 0;
           if(x == 4){
               return true;
           }
       }

       x=0; // четвертая диагональ
       for (int i = 1, j =0; i < SIZE; i++, j++) {
           x = map[i][j] == element ? (x+1) : 0;
           if(x == 4){
               return true;
           }
       }

       x=0; // пятая диагональ
       for (int i = (SIZE - 1), j = 1; i > 0; i--, j++) {
           x = map[i][j] == element ? (x+1) : 0;
           if (x == 4){
               return true;
           }
       }
/*
            // первый вариант проверки победы (3/3)
            int x;
            for (int i = 0; i < SIZE; i++) { // проверяем строки
                x = 0;
                for (int j = 0; j < SIZE; j++) {
                    x = map[i][j] == element ? (x+1) : x;
                    if(x == 3){
                        return true;
                    }
                }
            }
            for (int i = 0; i < SIZE; i++) { // проверяем столбцы
                x = 0;
                for (int j = 0; j < SIZE; j++) {
                    x = map[j][i] == element ? (x+1) : x;
                    if(x == 3){
                        return true;
                    }
                }
            }

            x = 0; // проверяем одну диагональ
            for (int i = 0; i < SIZE; i++) {
                x = map[i][i] == element ? (x+1) : x;
                if (x == 3){
                    return true;
                }
            }
            x = 0; // проверяем другую диагональ
            for (int i = 0, j = (SIZE - 1); i < SIZE; i++, j--) {
                x = map[i][j] == element ? (x+1) : x;
                if (x == 3){
                    return true;
                }
            }
/*
        // второй вариант проверки победы (3/3)
        for (int j = 0; j < SIZE; j++) { // проверяем столбец
            if (map[0][j] == element) {
                if (map[1][j] == element) {
                    if (map[2][j] == element) {
                        return true;
                    }
                } else if(map[1][1] == element){ // проверяем одну диагональ
                    if(map[2][2] == element){
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {  // проверяем строку
            if (map[i][0] == element) {
                if (map[i][1] == element) {
                    if (map[i][2] == element) {
                        return true;
                    }
                }
            }
        }
        if (map[0][2] == element) {  // проверяем вторую диагональ
                if (map[1][1] == element) {
                    if (map[2][0] == element) {
                        return true;
                    }
                }
            }
     */
            return false;
        }

        public static boolean isMapFull(){
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if(map[i][j] == MAP_ELEMENT_EMPTY){
                        return false;
                    }
                }

            }
            return true;
        }

        public static void aiTurn(){
            int x, y;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
            while ((!isMoveValid(x, y)));
            map[x][y] = MAP_ELEMENT_0;
            System.out.println("AI походил в клетку [ " + (x + 1) + ", " + (y + 1) + " ]");
        }




        public static void playerTurn(){
            int x, y ;
            do {
                System.out.println("Введите координаты вашего хода ('X Y')");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while ((!isMoveValid(x, y)));
            map[x][y] = MAP_ELEMENT_X;
        }


        public static boolean isMoveValid(int x, int y){
            if ( x < 0 || y < 0 || x >= SIZE || y >= SIZE){
                return false;
            }
            if ( map[x][y] != MAP_ELEMENT_EMPTY){
                return false;
            }
            return true;
        }


        public static void printMap(){
            System.out.print("  ");
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i+1) + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(+(i+1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[j][i] + " ");
                }
                System.out.println();
            }
        }


        public static void initMap(){
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = MAP_ELEMENT_EMPTY ;
                }

            }

        }

    }

