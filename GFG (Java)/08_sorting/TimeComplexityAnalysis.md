# Time Complexity Analysis of Your Bubble Sort Implementation

## Code Analysis

Your bubble sort implementation in `BubbleSort.java` has the following key characteristics:

```java
public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length;i++){           // Outer loop: runs n times
        boolean flag = true;                 // Optimization flag
        for(int j=0;j<arr.length-1-i;j++){   // Inner loop: runs (n-1-i) times
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                flag = false;                // Set flag when swap occurs
            }
        }
        if(flag){                           // Early termination optimization
            break;
        }
    }
}
```

## Time Complexity Analysis

### 1. **Best Case: O(n)**
- **Scenario**: Array is already sorted
- **Behavior**: 
  - Outer loop runs once (i = 0)
  - Inner loop runs (n-1) times with no swaps
  - Flag remains `true`, so loop breaks after first iteration
- **Operations**: n-1 comparisons, 0 swaps
- **Time Complexity**: **O(n)**

### 2. **Average Case: O(n²)**
- **Scenario**: Array is randomly ordered
- **Behavior**:
  - Outer loop runs approximately n/2 to 3n/4 times on average
  - Inner loop runs varying times: (n-1), (n-2), ..., until early termination
  - Multiple swaps occur throughout the process
- **Time Complexity**: **O(n²)**

### 3. **Worst Case: O(n²)**
- **Scenario**: Array is sorted in reverse order
- **Behavior**:
  - Outer loop runs exactly n times (no early termination)
  - Inner loop runs: (n-1) + (n-2) + ... + 1 = n(n-1)/2 times
  - Maximum number of swaps occur
- **Operations**: n(n-1)/2 comparisons and swaps
- **Time Complexity**: **O(n²)**

## Space Complexity
- **Space Complexity: O(1)**
- Uses only a constant amount of extra space (temp variable, flag, loop counters)
- Sorts the array in-place

## Optimization Impact

Your implementation includes an important optimization:
- **Early Termination**: The `flag` variable detects when no swaps occur in a complete pass
- **Benefit**: Reduces best-case complexity from O(n²) to O(n)
- **Impact**: Significantly improves performance on nearly sorted arrays

## Summary Table

| Case | Time Complexity | Space Complexity | Description |
|------|----------------|------------------|-------------|
| Best | O(n) | O(1) | Already sorted array |
| Average | O(n²) | O(1) | Randomly ordered array |
| Worst | O(n²) | O(1) | Reverse sorted array |

## Comparison with Standard Bubble Sort

Your optimized version is better than the basic bubble sort because:
- Basic bubble sort: Always O(n²) for all cases
- Your version: O(n) for best case due to early termination

This makes your implementation more efficient for partially sorted data.