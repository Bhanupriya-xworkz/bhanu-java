package com.xworkz.method.internal;

    public class AppStore extends Software {

        public void featuredApps() {
            System.out.println("AppStore promotes featured apps today!");
        }

        public void Dbc(Software software) {
            software.install();
            software.run();
            software.update();
            software.close();
            software.display();

            if (software instanceof AppStore) {
                AppStore store = (AppStore) software;
                System.out.println("Software is an instance of AppStore.");
                store.featuredApps();
            }
        }
    }

