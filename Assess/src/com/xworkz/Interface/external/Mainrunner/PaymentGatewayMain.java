package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Paypal;
import com.xworkz.Interface.internal.PaymentGateway;

public class PaymentGatewayMain {
        public static void main(String[] args) {
            PaymentGateway payPal = new Paypal();
            payPal.initiatePayment();
            payPal.confirmPayment();
            payPal.cancelPayment();

            paypal.gatewayTip();
        }
    }

