
# Lab 3

In this lab task, the students have to implement their own version of the Java interface `Comparable`.

A generic interface `Comparison` will be created. This interface will have a method `compare`. The `compare` method will use the generic and take any object. It will return 0 if the calling object and parameter object are both equal. It will return 1 if the caller is greater and -1 otherwise.

A generic `sort` method will be created in the main class. This method will take an array of any class that implements the interface `Comparison`. It will implement a sorting algorithm (preferably the Bubble Sort algorithm for its simplicity). In the `if` block, instead of using < or > operators, the code will use the `compare` method that has been implemented in the class.

A `Student` class will be created. The `Student` class will have a field name and a double field for gpa. It will have a method `display` that displays the name and gpa. The class will implement the `Comparison` interface and will override the `compare` method. This method will take another object of type `Student`. It will return 0 if both the objects have same GPAs. It will return 1 if the caller has the larger GPA and -1 otherwise.

In this way, the students will have implemented a custom version of the Java `Comparable` interface and the Java `sort` method that takes any collection that implements the `Comparable` interface. The `sort` method can be used for an array of any class that implements the `Comparison` interface and will sort the objects based on the `compare` method that is implemented in the individual classes.