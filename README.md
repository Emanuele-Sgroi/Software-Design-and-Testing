# Software Design and Testing
This repository was created for a university project and contains the **HK.net Store Management System**, showcasing unit testing and Object Constraint Language (OCL) application.

## Use Case Modelling
The selected use case for this assessment is titled “Purchasing Items in the hk.net Store Using Beenz Credits”. In this scenario, the primary actor is an employee who engages in the process of acquiring items from the integrated store within the hk.net platform by utilizing Beenz Credits as the chosen method of payment.

## Use Case Description
- **Use Case Name:** Purchasing items in hk.net store using Beenz credits.
- **Actors:** H&K Employee
- **Goal:** The goal of this use case is to enable an H&K Employee to successfully purchase an item from the hk.net store using their Beenz credits.
- **Preconditions:** The H&K Employee has Beenz Credits available in their account.
- **Postconditions:** -- The H&K Employee successfully completes a purchase of an item from the hk.net store -- The payment is made using the Beenz Credits from their account.

**Main Flow:**
1. Employee browses items.
2. Employee adds an item to the cart.
3. System updates the cart.
4. Employee opens the cart.
5. Employee proceeds to check out.
6. System displays the provisional order details
7. User inputs shipping address.
8. User selects “Beenz” as payment method (specific amount of Beenz)
9. System informs employee that “Beenz” is being checked
10. <<include>> Check Beenz
11. System deducts the Beenz amount from the total.
12. Employee selects “Finish and Pay”
13. System updates Beenz Credits in employee account
14. System updates cart to “empty”
15. System confirms the transaction was successful and provide Employee with confirmation number.

## Prerequisites
- **Java Development Kit (JDK)**: Version 11 or higher required.
- **IDE**: Compatible with Gradle and JUnit (e.g., IntelliJ IDEA).
- **Source Code**: Accessible from [GitHub repository link](https://github.com/Emanuele-Sgroi/Software-Design-and-Testing).

## Environment Setup
1. Open the project in your IDE.
2. Ensure Gradle synchronization.

## Running the System
Execute `StoreManagementSystemComp` via the IDE's run feature.

## Executing Tests
1. Go to `src/test/java` in the project structure.
2. Run the test package or individual test classes.
3. View results in the test output window.

Test reports can be found in the “test-results” directory after execution.

## License
This repository does not contain any license. This is an academical project and everyone is free to edit it.
