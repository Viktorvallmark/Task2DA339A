package org.example.partyController;

import java.util.Scanner;

/* Author: Viktor Vallmark
 * Computer id: aq2560
 * Program: Datateknik
 *
 *
 *
 * */
public class MainProgram {
  public static void main(String[] args) {
    // default value to make compilations
    // possible.
    /*
     * Write code to read the number of guests to start with from the user by
     * using one of
     * - JOptionPane
     * - Scanner and prompt
     */

    Scanner input = new Scanner(System.in);
<<<<<<< HEAD

    System.out.println("Enter how many maxNbrOfGuests should be in the system: ");

    int num = input.nextInt();

    Controller controller = new Controller(num);
=======
    int num;
    System.out.println("Enter how many maxNbrOfGuests should be in the system: ");
    if (input.hasNextInt()) {

      num = input.nextInt();
    } else {

      num = 1;
    }

    Controller controller = new Controller(num);

    controller.toString();
>>>>>>> 2c0f4753d665123d8bbea73cf1ac4326839428ff
    input.close();
  }
}
