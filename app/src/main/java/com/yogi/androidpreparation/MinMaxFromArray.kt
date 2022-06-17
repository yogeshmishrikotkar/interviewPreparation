package com.yogi.androidpreparation

object MinMaxFromArray {

    @JvmStatic
    fun main(args: Array<String>) {
        val array= intArrayOf(3,9,2,8)
        findMinMax(array)
    }

    private fun findMinMax(array: IntArray) {

        var min=array[0]
       var max=array[0]

        for (i in array.indices)
        {
         max=   Math.max(max,array[i])
            min=   Math.min(min,array[i])
        }

        println("findMinMax $max min $min")

    }
}