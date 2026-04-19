package com.theveloper.pixelplay.presentation.screens

import android.os.Build
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SetupScreenTest {

    @Test
    fun `buildSetupPages does not include notifications page on android 13`() {
        val pages = buildSetupPages(Build.VERSION_CODES.TIRAMISU)

        assertEquals(
            listOf(
                SetupPage.Welcome,
                SetupPage.MediaPermission,
                SetupPage.BackupRestore,
                SetupPage.DirectorySelection,
                SetupPage.ThemeSelection,
                SetupPage.LibraryLayout,
                SetupPage.NavBarLayout,
                SetupPage.AlarmsPermission,
                SetupPage.BatteryOptimization,
                SetupPage.Finish
            ),
            pages
        )
    }

    @Test
    fun `buildSetupPages excludes alarms page below android 12`() {
        val pages = buildSetupPages(Build.VERSION_CODES.R)

        assertEquals(
            listOf(
                SetupPage.Welcome,
                SetupPage.MediaPermission,
                SetupPage.BackupRestore,
                SetupPage.DirectorySelection,
                SetupPage.ThemeSelection,
                SetupPage.LibraryLayout,
                SetupPage.NavBarLayout,
                SetupPage.BatteryOptimization,
                SetupPage.Finish
            ),
            pages
        )
    }
}
