package com.example.cataloguerforbooks

data class Book (
    var title : String = "",
    var description : String = "",
    var genre : MutableCollection<String>,
    var tagList : MutableMap<String, String>
        )