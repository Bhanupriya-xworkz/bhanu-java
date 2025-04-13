package com.xworkz.method.external;

import com.xworkz.method.internal.AppStore;
import com.xworkz.method.internal.Apps;

public class AppsRunner {
        public static void main(String[] args) {

            System.out.println("Using Apps object:");
            Apps apps = new Apps();
            apps.install();
            apps.run();
            apps.update();
            apps.close();
            apps.display();
            apps.appFeature();

            System.out.println("=====================");

            Software software = new Software();
            software.install();
            software.run();
            software.update();
            software.close();
            software.display();

            System.out.println("=====================");

            AppStore store = new AppStore();
            store.Dbc(software);
            store.Dbc(store);
        }
    }

