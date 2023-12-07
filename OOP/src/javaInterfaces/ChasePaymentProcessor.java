package javaInterfaces;

public class ChasePaymentProcessor  implements PaymentProcessor,PaymentValidator{

    @Override
    public void processPayment(PaymentData paymentData) {
    }

    @Override
    public boolean validatePayment(PaymentData paymentData) {
        return false;
    }
}
