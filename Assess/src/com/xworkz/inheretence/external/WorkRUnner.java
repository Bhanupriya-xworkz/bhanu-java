package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.OfficeWork;
import com.xworkz.inheretence.internal.Work;

public class WorkRunner {
        public static void main(String[] args) {
            // Creating an object of OfficeWork (which is a subclass of Work)
            Work work = new OfficeWork();
            Work basicWork = new Work();

            // Using basic work operations
            basicWork.start();
            basicWork.pause();
            basicWork.finish();
            basicWork.review();

            // Using OfficeWork operations
            OfficeWork officeWork = new OfficeWork();
            officeWork.attendMeetings();
            officeWork.prepareReports();
            officeWork.start();
        }
    }

