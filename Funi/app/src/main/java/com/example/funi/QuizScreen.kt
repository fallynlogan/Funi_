package com.example.funi

import android.text.Editable

data class QuizScreen(var name:CharSequence = "", var gradeLevel:String = "", var subject:String = "") {
    fun quiz(position:Int, text:String, quizSubject: CharSequence)
    {
        setName(text)
        setSubject(quizSubject)
        setGradeLevel(position)
    }

    private fun setName(text:String)
    {
        name = text
    }

    private fun setGradeLevel(position:Int)
    {
        gradeLevel = when(position) {
            0 -> "pre-school"
            1 -> "kindergarten"
            2 -> "1st grade"
            3 -> "2nd grade"
            4 -> "3rd grade"
            else -> "grade"
        }
    }

    private fun setSubject(quizSubject:CharSequence)
    {
        when(quizSubject) {
            "Math" -> subject = "Math"
            "Reading" -> subject = "Reading"
        }
    }

}