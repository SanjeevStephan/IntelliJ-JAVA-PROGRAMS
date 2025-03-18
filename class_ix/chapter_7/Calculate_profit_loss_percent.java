package class_ix.chapter_7;

import java.util.Scanner;

public class Calculate_profit_loss_percent {

    public Calculate_profit_loss_percent() {
        Scanner input = new Scanner(System.in);
        float cost_price, selling_price, profit, profit_percent, loss, loss_percent;
        System.out.println("Enter Cost-Price : ");
        cost_price = input.nextFloat();
        System.out.println("Enter Selling-Price");
        selling_price = input.nextFloat();

        if(selling_price > cost_price)
        {
            profit = cost_price - selling_price;
            profit_percent = (profit/cost_price)*100;
            System.out.println("Profit Percent : " + profit_percent);
        }
        else
        {
            loss = cost_price - selling_price;
            loss_percent = (loss/cost_price)*100;
            System.out.println("Loss Percent : " + loss_percent);
        }
    }


}
