/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.util.Scanner;

/**
 *
 * @author Marshal
 */
public class TryCatch {

    public TryCatch() {
        int[] myNumbers = {1, 2, 3};
        Scanner s = new Scanner(System.in);

        //first example
        try {
            System.out.println(myNumbers[10]);
        } catch (ArithmeticException e) {
            System.out.println("An error was happend A101");
        } catch (NullPointerException e) {
            System.out.println("An error was happend A102");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error was happend A103");
        } catch (Exception e) {
            System.out.println("An error was happend A104");
        }

        //second example
        try {
            int a, b;
            System.out.println("Enter first no.");
            a = s.nextInt();
            System.out.println("Enter second no.");
            b = s.nextInt();
            System.out.println("The result is :" + (a / b));
        } catch (Exception e) {
            System.out.println("An error was happend F104");
        }
    }
}
