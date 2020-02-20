package epamCleanCode;

import epamCleanCode.homecost.*;
import epamCleanCode.interest.*;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.format("%s", "Enter I for Simple interest C for cost of construction\n");
        String choice = sc.nextLine();
        switch(choice)
        {
            case "I" :
                double principal,rate,time;
                int option;

                System.out.format("%s", "Enter Principal\n");
                principal = sc.nextDouble();

                System.out.format("%s", "Enter Rate Of Interest\n");
                rate = sc.nextDouble();

                System.out.format("%s", "Enter Time\n");
                time = sc.nextDouble();

                Interest ob = new Interest(principal,rate,time);

                System.out.format("%s","Enter 1 for SI and 2 for CI\n");
                option = sc.nextInt();

                if(option == 1)
                    System.out.format("%s",ob.calculate_SI());
                else if(option == 2)
                    System.out.format("%s",ob.calculate_CI());
                else
                    System.out.format("%s","Wrong choice");
                break;

            case "C" :
                System.out.format("%s","Enter S Standard Material or A for Above Standard Material H  for High Standard Material\n");
                String material = sc.next();

                System.out.format("%s", "Enter Area Of House\n");
                double area = sc.nextDouble();

                System.out.format("%s", "Fully Automated Home  -> True/False \n");
                Boolean opt = sc.nextBoolean();
                Home home = new Home(material, area, opt);
                double cost = home.totalCost();
                if(cost == 0)
                {
                    System.out.format("Wrong Choice");
                }
                else {
                    System.out.format("%s","Total cost"+cost);
                }
                break;

            default :
                System.out.format("%s", "Wrong Choice");
                break;
        }
    }
}