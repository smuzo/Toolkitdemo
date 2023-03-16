package com.example.toolkitdemo.read_quran.model

class SurrahModel(val number:Int, val name:String, val englishName:String, val englishNameTranslation:String,
val revelationType:String, val numberOfAyahs:Int, val ayahs:List<AyahsModel>, val edition:List<EditionModel>) {
}