### 1. **Bubble Sort**

**Definition:**  
A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

**Key Points:**

- Compares adjacent elements.
- Largest element "bubbles" to the end after each pass.
- Best case (sorted array): O(n)
- Worst case: O(n²)
- Stable sort (maintains relative order).
    

---

### 2. **Selection Sort**

**Definition:**  
An algorithm that divides the array into a sorted and unsorted part, and repeatedly selects the minimum (or maximum) from the unsorted part and moves it to the sorted part.

**Key Points:**

- Finds minimum element and places it at correct position.
- Always takes O(n²) time.
- In-place algorithm (no extra space).
- Not stable (can disturb same elements).
- Simple but inefficient on large lists.
    

---

### 3. **Insertion Sort**

**Definition:**  
Builds the sorted array one item at a time by picking elements and inserting them at the correct position.

**Key Points:**

- Good for small or nearly sorted arrays.
- Best case (sorted): O(n)
- Worst case: O(n²)
- Stable sort.
- Works similarly to how we sort playing cards.
    

---

### 4. **Merge Sort**

**Definition:**  
A divide-and-conquer algorithm that splits the array into halves, sorts each half, and merges them back together.

**Key Points:**

- Time complexity: O(n log n) in all cases.
- Requires extra space (not in-place).
- Stable sort.
- Very efficient for large data.
- Based on recursion.

---

### 5. **Quick Sort**

**Definition:**  
A divide-and-conquer algorithm that picks a pivot element, partitions the array around the pivot, and recursively sorts the partitions.

**Key Points:**

- Best and average case: O(n log n)
- Worst case (bad pivot): O(n²)
- In-place sort (no extra array).
- Not stable.
- Fastest practical sorting for average cases.

---

### 6. **Heap Sort**

**Definition:**  
A comparison-based sorting technique based on a binary heap data structure.

**Key Points:**

- Builds a max heap and sorts by repeatedly removing the largest element.
- Time complexity: O(n log n)
- In-place, but not stable.
- Good for large datasets.
- Priority queues internally use heap sort logic.
    

---

### 7. **Radix Sort**

**Definition:**  
A non-comparison-based sorting algorithm that sorts numbers by processing individual digits.

**Key Points:**

- Works best when data is of fixed length (like integers).
- Time complexity: O(nk) where k = number of digits.
- Stable sort.
- Not based on comparisons.
- Uses counting sort as a subroutine.

---

### 8. **Shell Sort**

**Definition:**  
An optimization over Insertion Sort that allows the exchange of far distant elements to reduce total swaps.

**Key Points:**

- Sorts elements at specific intervals (gaps).
- Reduces gap and applies insertion sort.
- Time complexity varies; best case around O(n log n).
- In-place sorting.
- Not stable.