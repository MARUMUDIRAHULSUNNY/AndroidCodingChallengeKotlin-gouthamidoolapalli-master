package com.commscope.codingchallengekt

import org.junit.Test
import org.junit.Assert.*

class TestPasswordValidator {
    @Test
    fun `Test is a valid password`() {
        val isValid = validatePassword("fortran_20")
        assertTrue(isValid)
    }

    @Test
    fun `Test 5 chars is too short`() {
        val isValid = validatePassword("_dave")
        assertFalse(isValid)
    }

    @Test
    fun `Test 11 chars is too long`() {
        val isValid = validatePassword("password_12")
        assertFalse(isValid)
    }
}