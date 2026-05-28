package com.design_pattern;

public class StratergyTest {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCard());
        paymentService.setPayment();
    }
}

interface Payment {
    void pay();
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done by UPI");
    }
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done by credit card");
    }
}

class PaymentService {
    Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void setPayment() {
        payment.pay();
    }
}

