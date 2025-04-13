package com.xworkz.method.internal;

    public class StorageCloud extends Cloud {

        public StorageCloud() {
            System.out.println("StorageCloud instance created.");
        }

        @Override
        public void upload() {
            System.out.println("Files uploaded securely to StorageCloud.");
        }

        @Override
        public void download() {
            System.out.println("Files downloaded from StorageCloud.");
        }

        @Override
        public void sync() {
            System.out.println("StorageCloud syncs automatically in real-time.");
        }

        @Override
        public void share() {
            System.out.println("Sharing files using StorageCloud link.");
        }

        @Override
        public void delete() {
            System.out.println("Files deleted permanently from StorageCloud.");
        }

        public void encryptionFeature() {
            System.out.println("StorageCloud uses AES-256 encryption for security.");
        }
    }

