package com.theveloper.pixelplay.presentation.screens

import android.os.Build
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SetupScreenPagesTest {

    @Test
    fun buildSetupPages_excludesDirectorySelection_whenAllFilesPermissionNotGranted() {
        val pages = buildSetupPages(
            sdkInt = Build.VERSION_CODES.TIRAMISU,
            includeDirectorySelection = false
        )

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }

    @Test
    fun buildSetupPages_includesDirectorySelection_whenAllFilesPermissionGranted() {
        val pages = buildSetupPages(
            sdkInt = Build.VERSION_CODES.TIRAMISU,
            includeDirectorySelection = true
        )

        assertFalse(pages.contains(SetupPage.DirectorySelection))
        assertFalse(pages.contains(SetupPage.BackupRestore))
        assertTrue(pages.contains(SetupPage.MediaPermission))
    }
}
