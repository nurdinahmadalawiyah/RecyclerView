package com.nurdin.myrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero (
    var name: String,
    var description: String,
    var Photo: Int
) : Parcelable