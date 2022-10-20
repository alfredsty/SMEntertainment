package com.example.smcylerview

import android.os.Parcelable

data class Singer(
    var image : String,
    var name : String,
    var korname : String,
    var info : String,
    var birth : String,
    var debut : String
)
data class Actor(
    var image : String,
    var name : String,
    var korname : String,
    var info : String,
    var birth : String,
    var debut : String
)
data class Enter(
    var image : String,
    var name : String,
    var korname : String,
    var birth : String,
    var debut : String,
    var company : String
)
data class Model(
    var image : String,
    var name : String,
    var korname : String,
    var info : String,
    var birth : String,
    var debut : String
)
data class Album(
    var image : String,
    var ifno : String,
    var year : String
)


