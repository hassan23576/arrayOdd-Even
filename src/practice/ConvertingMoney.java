package practice;

import java.text.Format;
import java.text.NumberFormat;

public class ConvertingMoney {

    public static void main(String[] args) {

        double USMoney = 15000.00;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println(money.format(USMoney));

    }
}
