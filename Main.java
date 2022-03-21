package com.company;

public class Main {

    public static void main(String[] args) {
	// Automatic Conversion.
        //Conversations that do not cause any data loss.
        //Byte to Short
        byte value_byte = 124;
        short value_short = value_byte;
        System.out.println("New value of short from byte 124 is (value_short): " + value_short);

        //Conversations that do not cause any data loss.

        //int to float

        int value_of_int = 123456789;
        float value_of_float = value_of_int;
        System.out.println("New value of short from byte 124 is (value_short): " + value_short);

        //Casting
        //double to float
        double available_balance = 99.9989;
        float float_available_balance = (float) available_balance;
        System.out.println("Available Balance in float:" + float_available_balance);

        //double to long

        //Class work

        //double to int
        int int_available_balance = (int) available_balance;
        System.out.println("Available Balance in int: " +int_available_balance);

        //float to int
        int float_balance_to_int = (int) available_balance;
        System.out.println("Available float Balance in int: " +float_balance_to_int);

        //long to int
        long new_long = 1234567891234L;
        int long_to_int = (int) new_long;
        System.out.println("new_long to int:" + long_to_int);



    }
}
