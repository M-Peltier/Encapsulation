This code is a great example of object-oriented programming (OOP), showcasing the four key principles:

1. Encapsulation
The BankAccount class encapsulates data (balance) and behaviors (methods like deposit, withdraw, getBalance) in a single unit.
The balance field is private and can only be accessed or modified through public methods, ensuring controlled access.
2. Abstraction
The class hides implementation details of how the balance is updated or checked (e.g., if conditions in withdraw and deposit) from the user.
The user interacts only with high-level methods like deposit and withdraw, not with the internal details.
3. Inheritance
Though this code doesn't directly demonstrate inheritance, the Main class and the BankAccount class follow standard Java inheritance rules.
This structure is ready to be extended (e.g., creating specialized accounts like SavingsAccount).
4. Polymorphism
Polymorphism isn't directly used here, but it could be implemented by extending the BankAccount class
and overriding methods like withdraw to apply different rules (e.g., overdraft protection).
Summary of Object Oriented Programming Concepts in Code
Encapsulation: Protects balance with private access.
Abstraction: Provides simple methods (deposit, withdraw) for complex operations.
Potential for Inheritance/Polymorphism: Ready for future extensions, such as specialized account types.
This example clearly illustrates how OOP principles can be used to create modular, reusable, and secure code.
