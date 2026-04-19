package com.theveloper.pixelplay.presentation.screens

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SetupScreenTest {

    @Test
    fun `buildSetupPages returns only media permission page`() {
        val pages = buildSetupPages()

        assertEquals(
            listOf(
                SetupPage.MediaPermission
            ),
            pages
        )
    }

    @Test
    fun `buildSetupPages is sdk independent`() {
        val pages = buildSetupPages()

        assertEquals(
            listOf(
                SetupPage.MediaPermission
            ),
            pages
        )
    }
}
