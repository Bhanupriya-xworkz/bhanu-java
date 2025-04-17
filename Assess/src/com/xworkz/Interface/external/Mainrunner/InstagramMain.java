package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Instagram;
import com.xworkz.Interface.internal.user;

public class InstagramMain {
        public static void main(String[] args) {

            Instagram user1 = new user("JohnDoe");

            user1.postPhoto("Sunset at the beach");
            user1.likePhoto("Beach Party");
            user1.followUser("JaneSmith");
            user1.instagramTips();

        }
    }

