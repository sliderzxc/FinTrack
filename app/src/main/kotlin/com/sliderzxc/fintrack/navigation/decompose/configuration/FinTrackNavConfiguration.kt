package com.sliderzxc.fintrack.navigation.decompose.configuration

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class FinTackNavConfiguration : Parcelable {
    @Parcelize
    data object Splash : FinTackNavConfiguration()
}