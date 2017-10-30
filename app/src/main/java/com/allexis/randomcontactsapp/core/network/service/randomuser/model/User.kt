package com.allexis.randomcontactsapp.core.network.service.randomuser.model

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by allexis on 10/30/17.
 *
 * With the [kotlinx.android.parcel.Parcelize] annotation, POJOs get automatically created all
 * required methods from [android.os.Parcelable] are automatically implemented by the compiler
 * It's important to consider that this annotation is still on experimental phase.
 */

@SuppressLint("ParcelCreator")
@Parcelize data class User(val gender: String,
                           val name: Name,
                           val location: Location,
                           val email: String,
                           val login: Login,
                           val dob: String,
                           val registered: String,
                           val phone: String,
                           val cell: String,
                           val id: Id,
                           val picture: Picture,
                           val nat: String) : Parcelable