package nchooser;

import javax.swing.*;

/**
 * @title NChooseR
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 24-Mar-2015 12:31:54 PM
 * @purpose The purpose of this program is to find the different ways an amount
 * can be chosen from another amount
 */
public class NChooseR {

    public static void main(String[] args) {
        int n, r, ways;
        //get numbers for the calculation
        n = Integer.parseInt(JOptionPane.showInputDialog("This program calculates the different ways r can be chosen from \ninput a value for n."));
        r = Integer.parseInt(JOptionPane.showInputDialog("Input a value for r."));
        ways = (fact(n)) / (fact(r) * (fact(n - r)));//do the calculation and output
        JOptionPane.showMessageDialog(null, "There are " + ways + " different ways to pick " + r + " from " + n + ".");

    }

    private static int fact(int num) {
        if (num == 2) {//2! is equal to 2 so retrun 2
            return num;
        } else {
            return num * fact(num - 1);//multiply the number by the next lowest factorial, repeat until 2!
        }

    }

}
