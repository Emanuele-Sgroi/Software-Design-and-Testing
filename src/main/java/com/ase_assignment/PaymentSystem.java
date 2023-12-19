package com.ase_assignment;

import java.util.Date;

public class PaymentSystem implements CheckoutInterface{
    //references
    private Checkout checkout;
    private BeenzCredit beenzCredit;
    private Employee employee;

    //Checkout
    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }
    public Checkout getCheckout() {
        return checkout;
    }

    //BeenzCredit
    public void setBeenzCredit(BeenzCredit beenzCredit) {
        this.beenzCredit = beenzCredit;
    }
    public BeenzCredit getBeenzCredit() {
        return beenzCredit;
    }

    //Employee
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }

    @Override
    public void applyBeenzCredits(double beenzAmount) {
        // Implementation for applying Beenz credits
    }

    @Override
    public double calculateTotal(double totalPrice) {
        // Implementation for calculating the total price
        return 0; // Placeholder return
    }

    @Override
    public void confirmOrder() {
        // Implementation for confirming the order
    }

    @Override
    public void checkout(String employeeID, Item item, double totalPrice) {
        // Implementation for checking out
    }

    public void finishAndPay(Item item, String employeeID, Date date) {
        Checkout checkout = this.getCheckout();
        // Mark payment as complete
        checkout.setIsComplete(true);
        // Empty the cart
        Cart cart = checkout.getCart();
        for (Item cartItem : cart.getItems()) {
            cartItem.setQuantity(0);
        }
    }
}

