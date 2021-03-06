package com.duanxr.yith.easy;

import java.util.PriorityQueue;

/**
 * @author Duanran 2019/2/11 0011
 */
public class KthLargestElementInAStream {

  /**
   * Design a class to find the kth largest element in a stream. Note that it is the kth largest
   * element in the sorted order, not the kth distinct element.
   *
   * Your KthLargest class will have a constructor which accepts an integer k and an integer array
   * nums, which contains initial elements from the stream. For each call to the method
   * KthLargest.add, return the element representing the kth largest element in the stream.
   *
   * Example:
   *
   * int k = 3;
   *
   * int[] arr = [4,5,8,2];
   *
   * KthLargest kthLargest = new KthLargest(3, arr);
   *
   * kthLargest.add(3);   // returns 4
   *
   * kthLargest.add(5);   // returns 5
   *
   * kthLargest.add(10);  // returns 5
   *
   * kthLargest.add(9);   // returns 8
   *
   * kthLargest.add(4);   // returns 8
   *
   * Note:
   *
   * You may assume that nums' length ≥ k-1 and k ≥ 1.
   *
   * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
   *
   * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
   *
   * 示例:
   *
   * int k = 3;
   *
   * int[] arr = [4,5,8,2];
   *
   * KthLargest kthLargest = new KthLargest(3, arr);
   *
   * kthLargest.add(3);   // returns 4
   *
   * kthLargest.add(5);   // returns 5
   *
   * kthLargest.add(10);  // returns 5
   *
   * kthLargest.add(9);   // returns 8
   *
   * kthLargest.add(4);   // returns 8
   *
   * 说明:
   *
   * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
   */
  class KthLargest {

    private PriorityQueue<Integer> priorityQueue;

    private int k;

    public KthLargest(int k, int[] nums) {
      this.k = k;
      priorityQueue = new PriorityQueue<>(k);
      for (int n : nums) {
        priorityQueue.offer(n);
      }
      for (int i = priorityQueue.size(); i > k; i--) {
        priorityQueue.poll();
      }
    }

    public int add(int val) {
      if (priorityQueue.size() < k || val > priorityQueue.peek()) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > k) {
          priorityQueue.poll();
        }
      }
      return priorityQueue.peek();
    }
  }


}
