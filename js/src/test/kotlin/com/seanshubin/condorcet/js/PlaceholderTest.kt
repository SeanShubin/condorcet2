package com.seanshubin.condorcet.js

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Shows that tests for JavaScript-specific functionality will run at the same time as tests for common functionality.
 */
class ClassWithMultiPlatformFunctionalityTest {
    @Test
    fun stringRepresentationIsCorrect() {
        val expected = 1
        val actual = 1
        assertEquals(expected, actual)
    }
}
