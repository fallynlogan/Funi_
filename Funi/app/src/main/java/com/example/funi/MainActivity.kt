package com.example.funi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.RadioButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var myQuizScreen = QuizScreen()
    private var selectedGradePosition = 0
    private var subjectID = 0
    private var subject:CharSequence = ""
    private var playerName = ""
    //add save state stuff for this or no?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //event listener
        startButton.setOnClickListener {
            playerName = editTextName.text.toString()
            subjectID = startRadioGroup.checkedRadioButtonId
            selectedGradePosition = gradeSpinner.selectedItemPosition

            //make sure all fields are filled out. if not throw error (snackbar)
            if (subjectID == -1 && playerName.isEmpty()) {
                val bothSnackbar = Snackbar.make(rootLayout, "Please enter your name & choose a subject", Snackbar.LENGTH_SHORT)
                bothSnackbar.show()
            } else if (playerName.isEmpty())
            {
                val nameSnackbar = Snackbar.make(rootLayout, "Please enter your name", Snackbar.LENGTH_SHORT)
                nameSnackbar.show()
            }
            else if (subjectID == -1){
                val subjectSnackbar = Snackbar.make(rootLayout, "Please choose a subject", Snackbar.LENGTH_SHORT)
                subjectSnackbar.show()
            }
            else {
                subject = findViewById<RadioButton>(subjectID).text
                myQuizScreen.quiz(selectedGradePosition, playerName, subject)
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("playerName", myQuizScreen.name)
                intent.putExtra("subject", myQuizScreen.subject)
                intent.putExtra("gradeLevel", myQuizScreen.gradeLevel)
                startActivity(intent)
            }
        }
    }

    private fun updateUI() {
        playerName = editTextName.text.toString()
        subjectID = startRadioGroup.checkedRadioButtonId
        selectedGradePosition = gradeSpinner.selectedItemPosition
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("name",playerName)
        outState.putCharSequence("subject", subject)
        outState.putInt("gradeLevel", selectedGradePosition)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        playerName = savedInstanceState.getString("name")!!
        subject = savedInstanceState.getCharSequence("subject")!!
        selectedGradePosition = savedInstanceState.getInt("gradeLevel")
        updateUI()
    }
}