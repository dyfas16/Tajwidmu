package com.tajwidmu

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tajwid(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
):Parcelable