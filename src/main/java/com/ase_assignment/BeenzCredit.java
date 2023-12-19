package com.ase_assignment;

public class BeenzCredit {
    //references
    private Employee employee;
    private Checkout checkout;
    private PaymentSystem paymentSystem;

    // Establishing relationships (getter and setter)

    //Employee
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }

    //Checkout
    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }
    public Checkout getCheckout() {
        return checkout;
    }

    //PaymentSystem
    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }
    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }
}

