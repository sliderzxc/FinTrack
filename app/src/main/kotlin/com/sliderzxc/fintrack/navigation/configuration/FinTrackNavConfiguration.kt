package com.sliderzxc.fintrack.navigation.configuration

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class FinTrackNavConfiguration : Parcelable {
    @Parcelize
    data object Splash : FinTrackNavConfiguration()
}