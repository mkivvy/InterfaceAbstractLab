
Objectives for Lab #1:
---------------------
   * Practice using abstraction by creating an Abstract super class and
     choosing an appropriate class name (should be a noun).
   * Practice identifying common properties and behaviors (methods) and placing
     those things in the super class
   * In the files provided many mistakes have been made with regard to proper
     encapsulation (declaring properties private, e.g.) and placement of
     common members. You may have to move some things around, remove things
     and/or create new things to make this work better.
   * Practice deciding which super class methods should be abstract, if any,
     and which super class methods should be fully implemented, if any.
     (TIP: implement (concrete) methods that should not change and declare them 
      final; if a method has the potential for being overridden in the 
      sub-clsss, declare that method abstract)
   * Can you think of any other ways to improve on this design?

Instructions for Lab #1:
----------------------
X1. Create an abstract super class that contains COMMON properties and methods
   to be inherited by the sub-classes that are provided.
X2. Modify your sub-classes to take advantage of this inheritance. Will you
   need to re-implement and/or override methods? Will you need to re-declare all
   properties?
X3. Fix any and all encapsulation problems.
X4. Create a startup class to test your code. In this startup class create and
   use at least one instance of each sub-class.
X5. In the startup class document what you think is good or bad about this
   architecture from the perspective of using abstraction and inheritance.
   (Remember, a startup class must have a main method)
X6. When declaring variables in your startup class consider using the 
   Liskov Substitution principle. This is where you declare a variable using
   it's abstract type. For example, you could do this:

   MyAbstractSuperClass course = new AdvancedJavaCourse();

   instead of this:

   AdvancedJavaCourse course = new AdvancedJavaCourse();

   Consider when this is advantageous and when it isn't. Provide a comment
   that explains your position.


