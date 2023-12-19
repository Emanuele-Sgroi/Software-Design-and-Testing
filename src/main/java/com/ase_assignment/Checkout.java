package com.ase_assignment;

public class Checkout implements CheckoutInterface {
    private double totalPrice;
    //references
    private Cart cart;
    private ShippingInfo shippingInfo;
    private BeenzCredit beenzCredit;
    private PaymentSystem paymentSystem;
    private Employee employee;
    private boolean isComplete = false;
    private boolean paymentConfirmed = false;

    // Constructor
    public Checkout(double totalPrice, boolean isComplete) {
        this.totalPrice = totalPrice;
        this.isComplete = isComplete;
    }

    // Establishing relationships (getter and setter)

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    //Cart
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public Cart getCart() {
        return cart;
    }

    //ShippingInfo
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    //BeenzCredit
    public void setBeenzCredit(BeenzCredit beenzCredit) {
        this.beenzCredit = beenzCredit;
    }
    public BeenzCredit getBeenzCredit() {
        return beenzCredit;
    }

    //PaymentSystem
    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }
    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
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
        //OCL
        // Precondition check
        if (employee.getBeenzBalance() >= beenzAmount && beenzAmount > 0) {
            employee.setBeenzBalance(employee.getBeenzBalance() - beenzAmount);
            // Update totalPrice after applying Beenz Credits
            this.totalPrice -= beenzAmount;
        } else {
            // Logic where preconditions are not met
        }
    }

    @Override
    public double calculateTotal(double totalPrice) {

        return totalPrice;
    }

    @Override
    public void confirmOrder() {
        this.paymentConfirmed = true;
    }

    @Override
    public void checkout(String employeeID, Item item, double totalPrice) {
        // Implementation here
    }

    public void setIsComplete(boolean isComplete) {
    }

    public void completeCheckout() {
        if (paymentConfirmed && cart.quantity == 0) {
            this.isComplete = true;
        } else {
            // Logic where payment isn't confirmed or cart isn't empty
        }
    }
}

