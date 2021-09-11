package org.example;
import java.util.Scanner;
import java.util.Calendar;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        int ppl;
        int pizza;
        int slice;

        System.out.print("How many people? ");

        Scanner ppls = new Scanner(System.in);
        ppl = ppls.nextInt();

        System.out.print("How many pizzas do you have? ");

        Scanner pizzas = new Scanner(System.in);
        pizza = pizzas.nextInt();

        System.out.print("How many slices per pizza? ");

        Scanner slices = new Scanner(System.in);
        slice = slices.nextInt();

        System.out.print((ppl) + " people with " + (pizza) + " pizzas"+" ("+(pizza*slice)+" slices)");

        System.out.print("\nEach person gets " +(pizza*slice/ppl)+" pieces of pizza. ");

        System.out.print("There are " +(pizza*slice%ppl) + " leftover pieces.");


    }
}

