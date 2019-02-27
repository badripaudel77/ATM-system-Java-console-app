/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatm;

import ATMAccountSystem.BalanceCheck;
import ATMMenuSystem.*;
import java.util.Scanner;//built-in

public class ATMTest {

    public static void main(String[] args) {

        Scanner pinInput = new Scanner(System.in);

        AtmMenu atmmenu = new AtmMenu();
        System.out.println("Enter the pin number");
        int pin = pinInput.nextInt();
        AtmMenu atmmenu1 = new AtmMenu(pin);

    }
}
