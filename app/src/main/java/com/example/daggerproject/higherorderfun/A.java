package com.example.daggerproject.higherorderfun;

import java.util.ArrayList;

public class A {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            int mid = i;
            int low = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= mid - 1; j++) {
                if (A.get(j) > low && A.get(j) < A.get(mid)) {
                    low = j;
                }
            }
            if (low == Integer.MIN_VALUE)
                continue;

            for (int k = mid + 1; k < n; k++) {
                if (A.get(k) > max && A.get(k) > A.get(mid)) {
                    max = k;
                }
            }
            if (max == Integer.MIN_VALUE)
                continue;
            sum = Math.max(sum, (A.get(low) + A.get(mid) + A.get(max)));
        }
        return sum;
    }
}

