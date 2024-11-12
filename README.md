# Pattern Problems
- These problems will help you develop your logic building skills needed for DSA.

=> Considering n = 4 for all patterns

### Pattern 1: Star Box
---
````
****
****
****
****
````

Java:

````java
for(int i = 0; i<n; i++) {
    for(int j = 0; j<i+1; j++){
        System.out.print(" ");
    }
    for(int k = 2*(n - i) - 1; k > 0; k--) {
        System.out.print("*");
    }
    System.out.println();
}
````

### Pattern 2: Star Staircase
---
````
*
**
***
****
````

Java:

````java
for (int i = 0; i<n; i++) {
    for (int j = i+1; j > 0; j--) {
        System.out.print("*");
    }
    System.out.println();
}
````

### Pattern 3: Star Staircase Inverted
---
````
****
***
**
*
````

Java:

````java
for (int i = 0; i < n; i++) {
    for (int j = n-i; j > 0; j--){
        System.out.print("*");
    }
    System.out.println();
}
````

### Pattern 4: Number Staircase
---
````
1
12
123
1234
````

Java:

````java
for (int i = 0; i <= n; i++) {
    for (int j = 1; j < i + 1; j++) {
        System.out.print(j);
    }
    System.out.println();
}
````

### Pattern 5: Star Staricase Combined (Normal + Inverted)
---
````
*
**
***
****
***
**
*
````

Java:

````java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i + 1; j++){
        System.out.print("*");
    }
    System.out.println();
}
for (int k = 0; k < n - 1; k++){
    for (int l = n - 1; l > k; l--) {
        System.out.print("*");
    }
    System.out.println();
}
````

### Pattern 6: Star Right Staircase
---
````
    *
   **
  ***
 ****
````

Java:

````java
for (int i = 0; i < n; i++) {
    for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i+1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
````
### Pattern 7: Star Right Staircase Inverted
---
````
****
 ***
  **
   *
````

Java:

````java
for (int i = 0; i < n; i++) {
    for(int k = 0; k < i; k++){
        System.out.print(" ");
    }
    for(int j = n - i; j > 0; j--){
        System.out.print("*");
    }
    System.out.println();
}
````

### Pattern 8: Star Pyramid
---
````
    *
   ***
  *****
 *******
````

Java:

````java
for (int i = 0; i<n; i++) {
    for (int j = n - i; j > 0; j--){
        System.out.print(" ");
    }
    for (int k = 0; k < (2*i)+1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
````
### Pattern 9: Star Pyramid Inverse
---
````
 *******
  *****
   ***
    *
````

Java:

````java
for(int i = 0; i<n; i++) {
    for(int j = 0; j<i+1; j++){
        System.out.print(" ");
    }
    for(int k = 2*(n - i) - 1; k > 0; k--) {
        System.out.print("*");
    }
    System.out.println();
}
````

