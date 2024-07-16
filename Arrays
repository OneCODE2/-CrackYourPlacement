There Are 3 solutions based on the conditions :

Best Solution
Considering the balance between time complexity, space complexity, and input integrity, the Floyd's Tortoise and Hare (Cycle Detection) Solution is the best:

Time Complexity: O(n)
Space Complexity: O(1)
Does Not Modify Input
Efficient and Optimal for Most Scenarios


1--- Binary Search on Range Solution:

class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2, count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }
            if (count > mid) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}


Time Complexity: O(n log n)
Space Complexity: O(1)
Pros: Does not modify input, low space complexity.
Cons: More complex to understand.


2--- HashSet Solution:

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return 0;
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Pros: Simple and easy to understand, does not modify input.
Cons: High space complexity for large arrays.

3--- Floyd's Tortoise and Hare Solution:

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Pros: Linear time complexity, does not modify input, low space complexity.
Cons: More complex due to cycle detection, but efficient.
