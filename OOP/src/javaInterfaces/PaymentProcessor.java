package javaInterfaces;

public interface PaymentProcessor {
    int RETRY_PAYMENTS = 5;
    void processPayment(PaymentData paymentData);

    default void processPayment(){
        System.out.println("This is the default method");
    }

    static void someStaticMethod(){
        System.out.println("This is the static method");
    }

}
