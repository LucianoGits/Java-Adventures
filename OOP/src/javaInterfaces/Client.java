package javaInterfaces;

public class Client {
    private PaymentProcessor paymentProcessor;
    {
        paymentProcessor = new PaypalPaymentProcessor();
    }
    public void checkout(PaymentData paymentData){
        paymentProcessor.processPayment(paymentData);
        PaymentProcessor.someStaticMethod();
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}

