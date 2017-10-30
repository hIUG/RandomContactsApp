package com.allexis.randomcontactsapp.core.network.service.randomuser.model

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by allexis on 10/30/17.
 *
 * With the [kotlinx.android.parcel.Parcelize] annotation, POJOs get automatically created all
 * required methods from [android.os.Parcelable] are automatically implemented by the compiler.
 * It's important to consider that this annotation is still on experimental phase.
 */

@SuppressLint("ParcelCreator")
@Parcelize data class Id(val name:String): Parcelable