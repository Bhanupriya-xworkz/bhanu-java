package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Gold;
import com.xworkz.method.internal.SmartGold;

public class GoldRunner {
        public static void main(String[] args) {
            Gold gold = new Gold();
            gold.mine();
            gold.refine();
            gold.weigh();
            gold.sell();
            gold.store();
            gold.displayValue();

            System.out.println("=============");

            SmartGold smartGold = new SmartGold();
            smartGold.mine();
            smartGold.refine();
            smartGold.weigh();
            smartGold.sell();
            smartGold.store();
            smartGold.displayValue();

            smartGold.trackGold();
            smartGold.analyzeGoldPurity();
        }
    }
