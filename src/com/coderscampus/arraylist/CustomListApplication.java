package com.coderscampus.arraylist;

public class CustomListApplication {

    public static void main(String[] args) {
        CustomList<Integer> numbers = new CustomArrayList<>();

        for (int i = 0; i < 21; i++) {
            numbers.add(i);
        }

        for (int j = 0; j < numbers.getSize(); j++) {
            System.out.println(numbers.get(j));
        }

    }
}
