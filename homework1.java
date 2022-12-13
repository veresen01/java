//1768. Merge Strings Alternately
/*class Solution {

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                res.append(word1.charAt(i++));
            }
            if (j < n) {
                res.append(word2.charAt(j++));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc", "pqr"));
        System.out.println(solution.mergeAlternately("ab", "pqrs"));
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }

}
*/


//27. Remove Element
/* 
public class Solution {
    public int removeElement(int[] nums, int val) {
        int ps[] = new int[nums.length];
        int psLen = 0;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == val) {
                count++;
                ps[psLen] = i;
                psLen++;
            }
        }

        int i2 = psLen;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (--i2 < 0) break;
            int p = ps[i2];
            if (p == i) continue;
            nums[p] = nums[i];
        }
        return nums.length - count;
    }
}
*/


//88. Merge Sorted Array
/* 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = nums1.clone(), i = 0, j = 0, index = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (temp[i] < nums2[j]) {
                    nums1[index++] = temp[i++];
                } else {
                    nums1[index++] = nums2[j++];
                }
            } else if (i == m) {
                nums1[index++] = nums2[j++];
            } else {
                nums1[index++] = temp[i++];
            }
        }
    }
}
*/


//151. Reverse Words in a String
/* 
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        while (l < s.length()) {
            char ch = s.charAt(l);
            if (ch == ' ') {
                l++;
                continue;
            }
            StringBuilder tmp = new StringBuilder();
            int r = l + 1;
            tmp.append(ch);
            while (r < s.length() && s.charAt(r) != ' ') {
                tmp.append(s.charAt(r));
                r++;
            }
            tmp.append(" ");
            sb.insert(0, tmp.toString());
            l = r + 1;
        }
        return sb.toString().trim();
    }
}
*/

//125. Valid Palindrome
/*
public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, h = s.length() - 1;
        while (l < h) {
            char charl = s.charAt(l), charh = s.charAt(h);
            if (!Character.isLetterOrDigit(charl))
                l++;
            else if (!Character.isLetterOrDigit(charh))
                h--;
            else {
                if (Character.toLowerCase(charl) != Character.toLowerCase(charh))
                    return false;
                l++;
                h--;
            }
        }
        return true;
    }
}
*/
