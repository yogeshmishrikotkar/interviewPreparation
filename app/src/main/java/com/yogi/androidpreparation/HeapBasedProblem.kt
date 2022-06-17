package com.yogi.androidpreparation

import java.util.*


/*
* Kth smallest element
* Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
* */
object HeapBasedProblem {

    @JvmStatic
    fun main(args: Array<String>) {
        val array= intArrayOf(7, 2, 4 ,3, 20, 15)
        //2,3 4,7, 15 20
    val value =    findKthSmallestElement(3,array)
        println(" findKthSmallestElement $value")

        //3 4,7 10 15 20
        val largestNumber =    findKthLargestElement(3,array)
        println(" largestNumber $largestNumber")


    }

    private fun findKthLargestElement(K: Int, array: IntArray): Int? {
       val minHeap= PriorityQueue<Int>(Comparator.reverseOrder())
        for (i in array.indices)
        {
            minHeap.add(array[i])
            if(minHeap.size>K){
                minHeap.remove()
            }
        }
      return  minHeap.element()
    }

    private fun findKthSmallestElement(K: Int, array: IntArray): Int? {
        val maxHeap= PriorityQueue<Int>()
        for (i in array.indices)
        {
            maxHeap.add(array[i])
            if(maxHeap.size>K){
                maxHeap.remove()
            }
        }
        return  maxHeap.element()
    }

}