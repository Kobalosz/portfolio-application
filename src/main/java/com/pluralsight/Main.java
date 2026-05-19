package com.pluralsight;

import com.pluralsight.interfaces.Valuable;
import com.pluralsight.models.Gold;
import com.pluralsight.models.House;
import com.pluralsight.models.Jewelry;
import com.pluralsight.models.Portfolio;
import com.sun.jdi.Value;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<Valuable> assets = new ArrayList<>();
        List<Valuable> assets2 = new ArrayList<>();
        List<Valuable> assets3 = new ArrayList<>();

        Portfolio bobbi = new Portfolio("Bobbi's Portfolio", "Bobbi", assets);
        Portfolio jacintha = new Portfolio("Jacintha's Portfolio", "Jacintha", assets2);
        Portfolio jodici = new Portfolio("Jodici's Portfolio", "Jodici", assets3);

        House house = new House("Bobbi's Mansion", 50000000,2026,67000, 12);
        Jewelry jewelry = new Jewelry("Bobbi's AP", 325000, 18);
        Gold gold = new Gold("Bobbi's Gold", 87642323, 77777777);

        House house2 = new House("Jacintha's Mansion", 868388233.23,2040,9929394, 30);
        Jewelry jewelry2 = new Jewelry("Jacintha's Cartier", 800000, 22);
        Gold gold2 = new Gold("Jacintha's Gold", 84823779343.38, 999238329);

        House house3 = new House("Jodici's Mansion", 9834283771232.23,3005,9932928, 22);
        Jewelry jewelry3 = new Jewelry("Jodici's Rolex", 723774, 67);
        Gold gold3 = new Gold("Jodici's Gold", 223849238442.23, 991293949);



        bobbi.add(house);
        bobbi.add(jewelry);
        bobbi.add(gold);

        jacintha.add(house2);
        jacintha.add(jewelry2);
        jacintha.add(gold2);

        jodici.add(house3);
        jodici.add(jewelry3);
        jodici.add(gold3);

        bobbi.printPortfolio();
        jacintha.printPortfolio();
        jodici.printPortfolio();


    }
}
