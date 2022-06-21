package com.yogi.androidpreparation


/*
* Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
* */
object AllZerosAndOneInArray {

    @JvmStatic
    fun main(args: Array<String>) {
         val array= intArrayOf(0, 2, 1 ,2, 0,2,1,2,2,0)
         sortArray(array)
    }

    private fun sortArray(array: IntArray) {
        var start=0
        var mid=start
        var end=array.size-1


           while (mid<end){
               when(array[mid]){
                   0->
                   {
                       swapArrayElement(array,start,mid)
                       mid++
                       start++
                   }
                   1->{
                        mid++
                   }
                   2->{
                       swapArrayElement(array,mid,end)
                       end--
                   }
               }
           }

        println(">>>>>>>>>>>>>>>>>>>>>>>>>> ")
        for (i in array.indices){
            println("    ${array[i]}")
        }
       }

    private fun swapArrayElement(array: IntArray, i: Int, j: Int) {
        val tmp = array[i]
        array[i]= array[j]
         array[j] = tmp
    }


}