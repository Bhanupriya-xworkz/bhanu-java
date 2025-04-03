package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.DigitalCalendar;
import java.util.Calendar;

public class CalendarRunner {
        public static void main(String[] args) {

            Calendar digitalCalendar = new DigitalCalendar();

            Calendar traditionalCalendar = new Calendar();

            digitalCalendar.addEvent();
            digitalCalendar.viewEvents();
            digitalCalendar.setReminder();
            digitalCalendar.syncCalendar();

            traditionalCalendar.addEvent();
            traditionalCalendar.viewEvents();
        }
    }
