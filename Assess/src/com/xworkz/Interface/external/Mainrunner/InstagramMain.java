package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Instagram;
import com.xworkz.Interface.internal.User;

public class InstagramMain {
        public static void main(String[] args) {

            Instagram user1 = new User("JohnDoe");
            Instagram user2 = new User("JaneSmith");

            user1.postPhoto("Sunset at the beach");
            user1.likePhoto("Beach Party");
            user1.followUser("JaneSmith");

            user2.postPhoto("Mountain hiking");
            user2.likePhoto("City Skyline");
            user2.followUser("JohnDoe");

        }
    }

