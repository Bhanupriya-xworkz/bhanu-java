package com.xworkz.inheretence.internal;

    public class OfficeWork extends Work {
        public void OW()
        {
            System.out.println("no-args const of office work");
        }

        {
            super.start();
            System.out.println("office work is starting with assigned tasks");
        }

        {
            super.pause();
            System.out.println("office work is paused for a break");
        }

        {
            super.finish();
            System.out.println("office work is finished with report submission");
        }

        {
            super.review();
            System.out.println("office work is being reviewed by the manager");
        }

        public void attendMeetings()
        {
            System.out.println("attending meetings for office work");
        }

        public void prepareReports()
        {
            System.out.println("preparing reports for office work");
        }
    }
