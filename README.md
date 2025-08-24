

# BH Intern Task 1

## 📌 Task Description
This task is a simple **Java program** that checks whether a given number is **Even** or **Odd**.  
The program takes user input from the console and prints the result accordingly.

---

## 📝 Code Overview
```java
package BH_Intern_Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("Given num is even number");
        } else {
            System.out.println("Given num is odd number");
        }
        sc.close();			
    }
}
````

---

## ⚙️ How to Run

1. Open terminal/command prompt.
2. Navigate to the folder containing the file `Task1.java`.
3. Compile the program:

   ```bash
   javac Task1.java
   ```
4. Run the program:

   ```bash
   java Task1
   ```
5. Enter a number when prompted → The program will print whether it’s **even or odd**.

---

## 🎯 Example Output

```
Enter the input
8
Given num is even number
```

```
Enter the input
5
Given num is odd number
```

---

## ✅ Learning Outcome

* Understanding **Java Scanner class** for input.
* Using **if-else conditions** in Java.
* Practicing **basic Java syntax** and running programs from command line.

---

```

---

👉 This README is neat, professional, and explains your task clearly.  
Would you like me to also **prepare README templates for all 10 tasks** so you only need to fill the description for each one?
```
