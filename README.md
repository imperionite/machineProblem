# machineProblem

Exercise categories are organized into distinct git branches, with each exercise represented by a corresponding Java class file located within the "dsa" package, designated as the main method.

To execute a specific exercise or file, navigate to `src` > `dsa` > `SampleExercise#` and select **Run File**.

## Setup

Here's a step-by-step guide to setting up a Java console app in NetBeans for solving multiple DSA problems per file.

**Step 1: Create a new Java project in NetBeans**

1. Open NetBeans and click on "File" -> "New Project..."
2. Select "Java" under Categories and "Java Application" under Projects.
3. Click "Next" and enter the project name, e.g., "machineProblem".
4. Choose a project location and click "Finish".

**Step 2: Create a package and add files**

1. In the Source Packages window, right-click on the "DSAProblems" project and select "New" -> "Java Package..."
2. Name the package "dsa" and click "Finish".
3. Right-click on the "dsa" package and select "New" -> "Java Class..."
4. Name the class "Problem1" and click "Finish". Repeat this step for "Problem2" and "Problem3".

**Step 3: Write code for each problem**

Here's an example code for each problem:

**Problem1.java**
```java
package dsa;

public class Problem1 {
    public static void main(String[] args) {
        // Write your code for Problem 1 here
        System.out.println("Problem 1 solution");
    }
}
```

**Problem2.java**
```java
package dsa;

public class Problem2 {
    public static void main(String[] args) {
        // Write your code for Problem 2 here
        System.out.println("Problem 2 solution");
    }
}
```

**Problem3.java**
```java
package dsa;

public class Problem3 {
    public static void main(String[] args) {
        // Write your code for Problem 3 here
        System.out.println("Problem 3 solution");
    }
}
```

**Step 4: Run each problem separately**

To run each problem separately, you need to set the main class for each file. Here's how:

1. Right-click on the "Problem1.java" file and select "Properties".
2. In the Properties window, select "Run" and enter "dsa.Problem1" in the "Main Class" field.
3. Click "OK" to close the Properties window.
4. Repeat steps 1-3 for "Problem2.java" and "Problem3.java".

Now, you can run each problem separately by right-clicking on the corresponding file and selecting "Run File".

Note: You can also use a single main class and use a switch statement or a menu-driven approach to run each problem. However, this approach requires more code and is not shown here. 

[Arrays Exercises](https://github.com/imperionite/machineProblem/tree/arrays)

[Linked List Exercises](https://github.com/imperionite/machineProblem/tree/linkedlist)

[Stack Exercises](https://github.com/imperionite/machineProblem/tree/stacks)

[Queue Exercises](https://github.com/imperionite/machineProblem/tree/queues)