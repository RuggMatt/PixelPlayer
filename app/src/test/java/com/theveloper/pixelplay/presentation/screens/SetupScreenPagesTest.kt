package com.theveloper.pixelplay.presentation.screens

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SetupScreenPagesTest {

    @Test
    fun buildSetupPages_excludesDirectorySelection_whenAllFilesPermissionNotGranted() {
        val pages = buildSetupPages()

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }

    @Test
    fun buildSetupPages_includesDirectorySelection_whenAllFilesPermissionGranted() {
        val pages = buildSetupPages()

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertFalse(pages.contains(SetupPage.BackupRestore))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }
}
