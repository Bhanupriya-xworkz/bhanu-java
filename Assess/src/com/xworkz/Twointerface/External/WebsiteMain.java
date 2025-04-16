package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.ECommerceSite;
import com.xworkz.Twointerface.Internal.Website;

public class WebsiteMain {
        public static void main(String[] args) {
            Website w1 = new ECommerceSite();
            Website w2 = new BlogSite();

            w1.getSiteName();
            w2.getSiteType();

            Server s1 = new ECommerceSite();
            Server s2 = new BlogSite();

            s1.getHostingProvider();
            s2.getServerLocation();
        }
    }

