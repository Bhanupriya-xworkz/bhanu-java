package com.xworkz.method.external;

import com.xworkz.method.internal.Cloud;
import com.xworkz.method.internal.StorageCloud;

public class CloudRunner {
        public static void main(String[] args) {

            System.out.println("Using StorageCloud object:");
            StorageCloud storage = new StorageCloud();
            storage.upload();
            storage.download();
            storage.sync();
            storage.share();
            storage.delete();
            storage.encryptionFeature();

            System.out.println("=====================");

            Cloud cloud = new Cloud();
            cloud.upload();
            cloud.download();
            cloud.sync();
            cloud.share();
            cloud.delete();

            System.out.println("=====================");

            CloudProvider provider = new CloudProvider();
            provider.Dbc(cloud);
            provider.Dbc(provider);
        }
    }

