package com.example.tugas_advance_project

import android.os.Parcel
import android.os.Parcelable


@parcelize
data class Jurusan(
    val imgJurusan: Int,
    val nameJurusan: String?,
    val descJurusan: String?,

    )   : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imgJurusan)
        parcel.writeString(nameJurusan)
        parcel.writeString(descJurusan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jurusan> {
        override fun createFromParcel(parcel: Parcel): Jurusan {
            return Jurusan(parcel)
        }

        override fun newArray(size: Int): Array<Jurusan?> {
            return arrayOfNulls(size)
        }
    }
}