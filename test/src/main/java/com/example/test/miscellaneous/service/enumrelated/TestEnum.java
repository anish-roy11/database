package com.example.test.miscellaneous.service.enumrelated;


import com.example.test.miscellaneous.service.producerconsumer.Consumer;

import java.util.logging.Logger;

public class TestEnum {
    private static final Logger logger = Logger.getLogger(TestEnum.class.getName());

    public String enumdemoMethod() {
        logger.info("logEntry:enumdemoMethod method");
        String result = null;
        AppleEnum ap;
        ap = AppleEnum.RedDel;

        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        //Value of ap: RedDel

        System.out.println();


        ap = AppleEnum.GoldenDel;

        // Compare two enum values.
        if (ap == AppleEnum.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }


        // Use an enum to control a switch statement.
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;

            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;

            case RedDel:
                System.out.println("Red Delicious is red.");
                break;

            case Winesap:
                System.out.println("Winesap is red.");
                break;

            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }


        ///////////////////////////////////////////
        AppleEnum appleEnum2;
        System.out.println("Here are all Apple constants:");
        // use values()
        AppleEnum allapples[] = AppleEnum.values();
        for (AppleEnum a : allapples) {
            System.out.println(a);
        }

        //Here are all Apple constants:
        //Jonathan
        //GoldenDel
        //RedDel
        //Cortland
        //Shimla
        //Winesap

        System.out.println();
        // use valueOf()
        appleEnum2 = AppleEnum.valueOf("Winesap");
        System.out.println("appleEnum2 contains " + appleEnum2);
        //appleEnum2 contains Winesap


////////////////////////////////////////////////////
        AppleEnum appleEnum3;
        // Display price of Winesap.
        System.out.println("Winesap costs " + AppleEnum.Winesap.getPrice() + " " + AppleEnum.Winesap.getCurrency() + "\n");
        //Winesap costs 15 USD

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (AppleEnum a : AppleEnum.values()) {
            System.out.println(a + " costs " + a.getPrice() + " " + a.getCurrency() + "\n");
        }
        //All apple prices:
        //Jonathan costs 10 USD
        //
        //GoldenDel costs 9 USD
        //
        //RedDel costs -1 null
        //
        //Cortland costs 10 null
        //
        //Shimla costs 0 INR
        //
        //Winesap costs 15 EUR


        /////////////////////////////////////////////

        AppleEnum appleEnum11, appleEnum12, appleEnum13;
// Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants" + " and their ordinal values: ");

        for (AppleEnum a : AppleEnum.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        //Here are all apple constants and their ordinal values:
        //Jonathan 0
        //GoldenDel 1
        //RedDel 2
        //Cortland 3
        //Shimla 4
        //Winesap 5


        appleEnum11 = AppleEnum.RedDel;
        appleEnum12 = AppleEnum.GoldenDel;
        appleEnum13 = AppleEnum.RedDel;

        System.out.println();


// Demonstrate compareTo() and equals()
        if (appleEnum11.compareTo(appleEnum12) < 0) {
            System.out.println(appleEnum11 + " comes before " + appleEnum12);
        }




        if (appleEnum11.compareTo(appleEnum12) > 0) {
            System.out.println(appleEnum12 + " comes before " + appleEnum11);
        }





        if (appleEnum11.compareTo(appleEnum13) == 0) {
            System.out.println(appleEnum11 + " equals " + appleEnum13);
        }

        System.out.println();

        if (appleEnum11.equals(appleEnum12)) {
            System.out.println("Error!");
        }

        if (appleEnum11.equals(appleEnum13)) {
            System.out.println(appleEnum11 + " equals " + appleEnum13);
        }

        if (appleEnum11 == appleEnum13) {
            System.out.println(appleEnum11 + " == " + appleEnum13);
        }

        //GoldenDel comes before RedDel
        //RedDel equals RedDel

        //RedDel equals RedDel
        //RedDel == RedDel


        result = "success";
        logger.info("logExit:enumdemoMethod method");
        return result;
    }


}
