package com.example.funi

import android.widget.Chronometer

data class EndScreen(var name:CharSequence = "", var gradeLevel:CharSequence = "", var subject:String = "", var numIncorrect: Int? = 0, var time: Double = 0.0) {
    fun end(grade:String?, text:String?, quizSubject: CharSequence?, incorrect: Int?, elapsedTime:Double?)
    {
        setName(text)
        setSubject(quizSubject)
        setGradeLevel(grade)
        if (elapsedTime != null) {
            time = elapsedTime
        }
        if (incorrect != null) {
            numIncorrect = incorrect
        }
    }


    private fun setName(text:String?)
    {
        if (text != null) {
            name = text
        }
    }

    private fun setGradeLevel(grade:String?)
    {
        gradeLevel = grade.toString()
    }

    private fun setSubject(quizSubject:CharSequence?)
    {
        subject = quizSubject.toString()
    }
}