# Explanation

The Employee class is pretty straightforward. It will contain the specified getter methods and instance variables. It should also contain a method that compares an ID number with that of the current employee. This example solution names this method `isMatch()` but you can name yours what you like as long as it accepts an int value as a parameter and it returns a boolean. Here is what the sample method looks like:

```
public boolean isMatch(Employee otherEmployee) {
  return this.id == otherEmployee.id;
}
```

Where things start to get a little tricky is the Manager class. Since it extends from Employee, we inherit a lot of the functionality. However, notice that we have two constructors here. Both of them call `super()`, but the second constructor does so with a `null` value where an Employee data type should go. This is because while some Managers may have other managers that they report to, some do not. We provide `null` in place of this. Notice also that the data type used to specify a manager is actually ***not*** Manager, but rather Employee. By taking advantage of existing methods and instance variables in Employee instead of recreating this functionality, we can help simplify our Personnel class. You should also notice that we override the `getManager()` method from the Employee class. We do this because there is a possibility that a manager might not have another manager to report to. When that is the case, we return `this`, which is to say that a Manager object without a manager set will return itself.

Moving onto the Personnel class, we can see that this class doesn't make any distinction between Employee and Manager. It's all just Employees from its perspective. We don't want it to be concerned with that distinction because it only has one job: print a message depending on whether or not an employee has a manager.

In our Main class, we can see that although we are instantiating the Manager class, we are doing so in order to create variables of the Employee data type. This allows us to simply pass in only one data type to the Personnel class.
