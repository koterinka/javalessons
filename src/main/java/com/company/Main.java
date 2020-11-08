package com.company;

public class Main {

    public static void main(String[] args) {
        // System.out.print(summ((byte) 88,(short)5));
        // System.out.print(mpl(88, 5));
        // System.out.print(getMaxNumber(88,5));
        // System.out.print(isCharA('0'));
        // System.out.print(isCharNumber('A'));
        // Binar();
        // Binar1();
        //System.out.print(CHint( '5'));
        System.out.print(IntCh(33));

    }

        public static byte summ ( byte first, short second){
            return (byte) (first + second);
        }

        public static int mpl ( int first, long second){
            return (int) (first * second);

        }

        public static int getMaxNumber ( int first, int second){
            if (first > second)
                return first;
            else
                return second;

        }

        public static boolean isCharA ( char a1){
            if (a1 == 'A')
                return true;
            else
                return false;
        }

        public static boolean isCharNumber ( char a1){
            if ('0' <= a1 && '9' >= a1)
                return true;
            else
                return false;
        }

        public static void Binar () {
            for (int i = 0; i < 31; i++) {
                System.out.print(Integer.toBinaryString(i));
                System.out.print('\n');
            }
        }

        public static void Binar1 () {
            System.out.print(Integer.toBinaryString(Integer.MAX_VALUE));
            System.out.print('\n');
            System.out.print(Integer.toBinaryString(Integer.MAX_VALUE + 1));

        }

        public static int CHint(char a1) {
            return (Character.getNumericValue(a1));
        }

        public static char IntCh (int a1) {
            return (char) a1;
        }
    }

