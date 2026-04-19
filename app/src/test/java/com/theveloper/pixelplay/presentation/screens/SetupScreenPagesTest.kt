package com.theveloper.pixelplay.presentation.screens

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SetupScreenPagesTest {

    @Test
    fun buildSetupPages_returnsOnlyMediaPermission() {
        val pages = buildSetupPages()

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }

    @Test
    fun buildSetupPages_neverIncludesDirectorySelection() {
        val pages = buildSetupPages()

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertFalse(pages.contains(SetupPage.BackupRestore))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }
}
