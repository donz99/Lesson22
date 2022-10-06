package Lesson22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String1. Дан символ C. Вывести его код (то есть номер в кодовой таблице).
//        char c;
//        //c = in.nextLine().charAt(0);
//        c='\u00AE';
//        System.out.println(c);
//        System.out.println((int)c);

        // String4. Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (то
        //есть заглавных) букв латинского алфавита.
//        for (int i = 'A'; i <= 'Z'; i++) {
//            System.out.print((char)(i) + " ");
//        }
//        for (char c = 'A'; c <= 'Z'; c++) {
//            System.out.print(c + " ");
//        } // ИЛИ МОЖНО ТАК! т.к. чар внутри это инт

//        int n = in.nextInt();
//        for (int c = 'A' + (n-1); c < 'Z'; c++) {
//            System.out.println((char)c + " ");
//        }
        //Дана строка из строчных букв. Перевести в прописные
//        String str = in.nextLine();
//        int offset = 'a' - 'A';
//        StringBuilder buf = new StringBuilder(str);
//        for(int i=0; i<buf.length(); i++){
//            int c =buf.charAt(i)-offset;
//            buf.setCharAt(i,(char)c);
//        }
//        System.out.println(buf);

        //Есть предложение без знаков припинания на англ языке.
        //Слова в предложении разделяются ровно одним пробелом.
        //Напить статический метод(функцию), который сделает первые буквы слов большими

//        String str = in.nextLine();
//
//        System.out.println(task2(str));

        // String13. Дана строка. Подсчитать количество содержащихся в ней цифр.

//        String str = in.nextLine();
//        System.out.println(taskString13(str));

        //String14. Дана строка. Подсчитать количество содержащихся в ней прописных
        //латинских букв.

        String str = in.nextLine();
        System.out.println(taskString14(str));

    }

    public static boolean isDigit2(String str, int i){
        return 'A' <= str.charAt(i) && str.charAt(i) <= 'Z';
    }

    public static boolean isDigit(String str, int i){
        return '0' <= str.charAt(i) && str.charAt(i) <= '9';
    }

    public static int taskString14(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit2(str,i)){
                k++;
            }
        }
        return k;
    }

    public static int taskString13(String str){
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str,i)){
                k++;
            }
        }
        return k;
    }

    public static String task2 (String str){
        int offset = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);


        for (int i = 1; i < buf.length(); i++) {



            if (buf.charAt(i)!=' ' && buf.charAt(i-1)==' ') {
                //isLetter(buf,i) && isLowerCase(buf,i) && isSpace(buf,i=1)
                charLowerToUpper(buf,i);
            }
        }



        if('a' <= buf.charAt(0) && buf.charAt(0)<='z'){ //ЭТО МАЛЕНЬКАЯ БУКВА!
            charLowerToUpper(buf,0);
        }
        return buf.toString();
    }

    public static String task1 (String str){
        int offset = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);


        for (int i = 0; i < buf.length(); i++) {



            if (buf.charAt(i)==' ') {
                int c = buf.charAt(i+1)-offset;
                buf.setCharAt(i+1,(char)c);
            }
        }
        if('a' <= buf.charAt(0) && buf.charAt(0)<='z'){
            int c = buf.charAt(0)-offset;
            buf.setCharAt(0,(char)c);
        }
        return buf.toString();
    }

    public static void charLowerToUpper(StringBuilder buf, int i){
        int offset = 'a' - 'A';
        int c = buf.charAt(i)-offset;
        buf.setCharAt(i,(char)c);
    }


}
