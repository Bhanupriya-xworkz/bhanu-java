package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.NetFlix;
import com.xworkz.Interface.internal.StreamingService;

public class SteamingMain {
        public static void main(String[] args) {
            StreamingService netflix = new NetFlix();

            netflix.login();
            netflix.playContent();
            netflix.logout();

            System.out.println();

        }
    }

