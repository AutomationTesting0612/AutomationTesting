package com.automation.stream;

import java.util.Arrays;
import java.util.List;

public class AverageInteger {




    public static void main(String[] args) {

      List<Integer> nums = Arrays.asList(1,5,4,3,2,6);

      Double avg = nums.stream().mapToDouble(Integer::doubleValue)
              .average().orElse(0.0);

        System.out.println(avg);

    }
}
