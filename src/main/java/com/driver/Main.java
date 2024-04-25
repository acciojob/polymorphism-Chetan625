package com.driver;

public class Main {
    public  static class Product {
        public int product(int x, int y) {
            return 1;
        }

        public int product(int x, int y, int z) {
            return 2;
        }

        public double product(double x, double y) {
            return 4.2;
        }
    }

    public static void main(String[] args) {
        //Main main = new Main(); // Creating an instance of Main class
        Product p = new Product(); // Creating an instance of Product class
        int x = 5, y = 10, z = 20; // Sample values for variables x, y, and z

        // Printing the results
        System.out.println(p.product(x, y)); // Calling product(int, int)
        System.out.println(p.product(x, y, z)); // Calling product(int, int, int)
        System.out.println(p.product(4.0, 3.0)); // Calling product(double, double)
    }
}
