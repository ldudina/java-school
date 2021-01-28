package ru.ldudina;

public class Exceptions {
            public static void main(String[] args) {
            System.out.println(divide(10, 4));

            try {
                final double result = divide(15, 0);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println("<b cannot be 0>");
                e.printStackTrace();
            } finally {
                System.out.println("finally block");
            }

            System.out.println(divide(15, 5));

            m1(56);
            m2();
        }

        private static double divide(int a, int b) {
            if (b == 0) {
                System.out.println("b cannot be 0");
                throw new IllegalArgumentException("b cannot be 0");
            } else {
                return (double) a / b;
            }
        }

        private static void m2() {
            try {
                m1(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * This method performs smth
         *
         * @param a should be greater than 0
         * @throws MyException if a is less than 0
         * @throws MyException2 if a is equal to 0
         */
        private static void m1(int a) {
            if (a < 0) {
                throw new MyException();
            }

            if (a == 0) {
                throw new MyException2();
            }
        }
    }

    class MyException extends RuntimeException {

    }

    class MyException2 extends RuntimeException {

    }

