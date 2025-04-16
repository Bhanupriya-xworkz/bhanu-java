package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.MovieTicket;
import com.xworkz.Interface.internal.Ticket;

public class TicketMain {
        public static void main(String[] args) {

            Ticket ticket1 = new MovieTicket();
            Ticket ticket2 = new MovieTicket();
            Ticket ticket3 = new MovieTicket();

            ticket1.book();
            ticket2.showDetails();
            ticket3.cancel();
        }
    }

