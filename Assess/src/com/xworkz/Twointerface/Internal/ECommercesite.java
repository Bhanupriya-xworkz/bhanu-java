package com.xworkz.Twointerface.Internal;
    public class ECommerceSite implements Website, Server {

        @Override
        public void getSiteName() {
            System.out.println("Site: ShopEasy");
        }

        @Override
        public void getSiteType() {
            System.out.println("Type: E-Commerce");
        }

        @Override
        public void getHostingProvider() {
            System.out.println("Hosted on: AWS");
        }

        @Override
        public void getServerLocation() {
            System.out.println("Server Location: Mumbai");
        }
    }

public class BlogSite implements Website, Server {

    @Override
    public void getSiteName() {
        System.out.println("Site: TechTalks");
    }

    @Override
    public void getSiteType() {
        System.out.println("Type: Blog");
    }

    @Override
    public void getHostingProvider() {
        System.out.println("Hosted on: Bluehost");
    }

    @Override
    public void getServerLocation() {
        System.out.println("Server Location: Singapore");
    }
}

