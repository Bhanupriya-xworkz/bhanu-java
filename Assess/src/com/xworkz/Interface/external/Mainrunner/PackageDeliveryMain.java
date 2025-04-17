package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.CourierService;
import com.xworkz.Interface.internal.PackageDelivery;

public class PackageDeliveryMain {
        public static void main(String[] args) {
            PackageDelivery courier = new CourierService();

            courier.pickUp();
            courier.transit();
            courier.deliver();

            System.out.println();

        }
    }

