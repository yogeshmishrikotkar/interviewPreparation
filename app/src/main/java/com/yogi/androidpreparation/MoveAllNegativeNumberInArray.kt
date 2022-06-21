package com.yogi.androidpreparation

object MoveAllNegativeNumberInArray {

    @JvmStatic
    fun main(args: Array<String>) {
       var array= intArrayOf(  1, 2,  -4, -5, 2, -7, 3,
            2, -6, -8, -9, 3, 2,  1 )

        sortedArray(array)

        array.forEach {
            print(" $it  ")
        }
    }

    private fun sortedArray(array: IntArray) {
        var end=array.size-1
        var low=0
        while (low<end){
            if(array[low]<0){
                low++
            }else{
                swapArrayElement(array,low,end)
                end--
            }
        }

    }

    private fun swapArrayElement(array: IntArray, i: Int, j: Int) {
        val tmp = array[i]
        array[i]= array[j]
        array[j] = tmp
    }
}