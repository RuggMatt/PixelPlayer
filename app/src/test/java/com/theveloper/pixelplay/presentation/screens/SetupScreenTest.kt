package com.theveloper.pixelplay.presentation.screens

import android.os.Build
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SetupScreenTest {

    @Test
    fun `buildSetupPages does not include notifications page on android 13 plus`() {
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
    fun `buildSetupPages keeps alarms page for android 12 plus`() {
        val pages = buildSetupPages(Build.VERSION_CODES.S)

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
}
