package com.hucet.algorithm

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

/**
 * Created by taesu on 2017-12-02.
 */
class SelectSortTest : Spek({

    val data = arrayOf(5, 1, 2, 3, 12)
    val correct = arrayOf(1, 2, 3, 5, 12)

    describe("select sort")
    {

        runBlocking {
            selectSort(data)
        }

        it("data는 correct 결과와 동일")
        {
            data shouldEqual correct
        }
    }
})

fun selectSort(data: Array<Int>) {
    for (i in 0 until data.size) {
        async { select(data, i) }
    }
}

suspend fun select(data: Array<Int>, i: Int) {
    var minIndex = i
    for (j in i + 1 until data.size) {
        if (data[j] < data[minIndex]) {
            minIndex = j
        }
    }
    swap(data, minIndex, i)
}

fun swap(data: Array<Int>, minIndex: Int, target: Int) {
    val temp = data[minIndex];
    data[minIndex] = data[target];
    data[target] = temp;
}
