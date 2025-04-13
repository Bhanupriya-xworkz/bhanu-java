package com.xworkz.method.external;
import com.xworkz.method.internal.BuildingBlock;
import com.xworkz.method.internal.BuildingBlock;

public class BlockRunner {
        public static void main(String[] args) {

            System.out.println("Using BuildingBlock object:");
            BuildingBlock block = new BuildingBlock();
            block.place();
            block.remove();
            block.paint();
            block.rotate();
            block.duplicate();
            block.connect();

            System.out.println("=====================");

            Block base = new Block();
            base.place();
            base.remove();
            base.paint();
            base.rotate();
            base.duplicate();

            System.out.println("=====================");

            ConstructionSite site = new ConstructionSite();
            site.Dbc(base);
            site.Dbc(site);
        }
    }

