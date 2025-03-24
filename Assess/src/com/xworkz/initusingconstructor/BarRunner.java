package com.xworkz.initusingconstructor;
public class BarRunner {
    public static void main(String[] args){
        Bar bar1 = new Bar("Shankar Bar", " Sharanu",600000 );
        Bar bar2 = new Bar("SRL Bar", " Kumar",100000 );
        Bar bar3 = new Bar("Venkat Bar", " Ramesh",1000000 );
        Bar bar4 = new Bar("Vikas Bar", "Manoj",30000 );
        Bar bar5 = new Bar("MKG Bar", "Srinivas",50000 );

        System.out.println("bar1 name : " + bar1.name);
        System.out.println("bar1 owner : " + bar1.owner);
        System.out.println("bar1 investment : " + bar1.investment);

        System.out.println("=======================");

        System.out.println("bar2 name : " + bar2.name);
        System.out.println("bar2 owner : " + bar2.owner);
        System.out.println("bar2 investment : " + bar2.investment);

        System.out.println("=======================");

        System.out.println("bar3 name : " + bar3.name);
        System.out.println("bar3 owner : " + bar3.owner);
        System.out.println("bar3 investment : " + bar3.investment);

        System.out.println("=======================");

        System.out.println("bar4 name : " + bar4.name);
        System.out.println("bar4 owner : " + bar4.owner);
        System.out.println("bar4 investment : " + bar4.investment);

        System.out.println("=======================");

        System.out.println("bar5 name : " + bar5.name);
        System.out.println("bar5 owner : " + bar5.owner);
        System.out.println("bar5 investment : " + bar5.investment);


    }
}
