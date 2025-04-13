package com.xworkz.method.internal;

    public class CloudProvider extends Cloud {

        public void analyticsService() {
            System.out.println("CloudProvider offers advanced analytics services.");
        }

        public void Dbc(Cloud cloud) {
            cloud.upload();
            cloud.download();
            cloud.sync();
            cloud.share();
            cloud.delete();

            if (cloud instanceof CloudProvider) {
                CloudProvider provider = (CloudProvider) cloud;
                System.out.println("Cloud is an instance of CloudProvider.");
                provider.analyticsService();
            }
        }
    }

