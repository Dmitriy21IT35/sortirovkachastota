package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };

        System.out.println("Все номера:");
        for ( int i : numbers )
            System.out.print(i + " ");
        System.out.println();
        int[] counters = new int [ numbers.length ];
        for ( int i = 0; i < numbers.length; ++i ) {
            counters[i] = 0;
            for (int number : numbers)
                if (numbers[i] == number)
                    counters[i] += 1;
        }
        for ( int i = 0; i < numbers.length ; ++i ) {
            for ( int j = i + 1; j < numbers.length; ++j ) {
                if ( counters[j] > counters[i] ) {
                    int tmp = counters[i];
                    counters[i] = counters[j];
                    counters[j] = tmp;
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
                else if ( counters[i] == counters[j] && numbers[i] > numbers[j] ) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }

            for ( int i = 0; i < 10;  ++i)
            System.out.print(numbers[i] + " ");
    }
}
