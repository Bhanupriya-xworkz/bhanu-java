package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.CreditCard;
import com.xworkz.Interface.internal.Payment;

public class PaymentMain {
        public static void main(String[] args) {
            Payment payment1 = new  payment();
            payment1.Initiate();
            payment1.Process();
            payment1.Confirm();

            payment.paymentTip();
        }
    }


