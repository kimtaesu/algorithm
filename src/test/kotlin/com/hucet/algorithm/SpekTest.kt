package com.hucet.algorithm

import org.amshove.kluent.`should be`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class SpekTest : Spek({
    describe("abc")
    {
        it("abc")
        {
            1 `should be` 1
        }
    }
})