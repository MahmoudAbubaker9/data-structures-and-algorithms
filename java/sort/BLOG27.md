# Insertion Sort Blog

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves

### Pseudocode:

```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```

### Trace:

Array: [8,4,23,42,16,15]

**Step 1 :**

![Step1](img/MergeSort1.jpg)

In this step, we should calculate the mid-point (array length /2) of the array is divided into two parts, right and left, and separated
As a result, we have two arrays

**Step 2 :**

![Step2](img/MergeSort2.jpg)

The same step as before, the array is divided after calculating the middle of the array

**Step 3 :**

![Step3](img/MergeSort3.jpg)

Here the remaining left part is divided
So that we have all the value of the array separate so that we can arrange them

**Step 4 :**

![Step4](img/MergeSort4.jpg)

After separating all the values
The array is merge from the left side by order from smallest to largest

**Step 5 :**

![Step5](img/MergeSort5.jpg)

Like the previous step, the left side is merge to the right side according to the order of the numbers from smallest to largest


**Step 6 :**

![Step6](img/MergeSort6.jpg)

And here is the last step, as the left and right sides have been returned, arranged according to numbers
In the last step, we will merge left and right sides , resulting in an array arranged according to numbers, from smallest to largest

### Efficiency:

1. Time: O( n Log(n) ) We split each sub array into 2, which takes in half the length each time and this adds log(n) into the complexity.

2. Space: O(1)
