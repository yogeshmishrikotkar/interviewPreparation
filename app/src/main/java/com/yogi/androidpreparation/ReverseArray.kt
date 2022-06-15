package com.yogi.androidpreparation

object ReverseArray {
 /*
 *
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

 *
 *
 * */

    @JvmStatic
    fun main(args: Array<String>) {
        val array= intArrayOf(1,2,3,4,5,6,7,8,9,11,13)


        println("################# WITH LINEAR LOOP #################### ")
        for(i in array.indices){
            print(" ${array[i]}  ")
        }
        println("")
        reverseInSingleLoop(array)
         for(i in array.indices){
             print(" ${array[i]}  ")
         }
        println("")
        println("################## WITH RECURSION ################## ")

        val array1= intArrayOf(1,2,3,4,5 )
        for(i in array1.indices){
            print(" ${array1[i]}  ")
        }
        println("")
        reverseUsingRecursion(array1, 0 , array1.size-1)

        for(i in array1.indices){
            print(" ${array1[i]}  ")
        }


    }

    private fun reverseUsingRecursion(array: IntArray, start: Int, end: Int) {
        var startValue=start
        var endValue=end

        if(startValue>=endValue){
            return
        }
        val temp= array[endValue]
        array[endValue] =array[startValue]
        array[startValue]=temp
        reverseUsingRecursion(array,++startValue ,--endValue)
    }


    private fun reverseInSingleLoop(array: IntArray) {
        if(array.isEmpty()){
            println( " Empty array cant be converted")
            return
        }
         val size=array.size
        for (i in 0 until  size/2){
            val endIndex=(size-1)-i

            if(array[i] != array[endIndex]){
               val temp= array[endIndex]
                array[endIndex] =array[i]
                array[i]=temp
            }
        }
    }


}