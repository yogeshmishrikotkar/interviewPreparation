package com.yogi.androidpreparation

object KadaneAlgo {

    @JvmStatic
    fun main(args: Array<String>) {


        findMaxSumInContinuesArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))
    }

    private fun findMaxSumInContinuesArray(array: IntArray) {
//        findMaxSumInContinuesArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))

        var total=0
        var tempSum=0
        for(i in array.indices){
            tempSum += array[i]

            if(tempSum<0){
                tempSum=0
            }else{
                total=Math.max(total,tempSum)
            }

        }

        println("Tottal is $total")

    }
}