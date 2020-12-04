package com.example.funi

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_end.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class EndActivity : AppCompatActivity() {
    private var myQuizScreen = QuizScreen()
    private var name : String? = null
    private var subject : CharSequence? = null
    private var gradeLevel : String? = null
    private var numIncorrect : Int? = null
    private var time : Double? = null
    private var selectedGradePosition = 0
    private var listView: ListView? = null
    private var player : Player? = null
    private var players : MutableList<String>? = null
    private var popUpShown : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        name = intent.getStringExtra("playerName")
        subject = intent.getCharSequenceExtra("subject")
        gradeLevel = intent.getStringExtra("gradeLevel")
        numIncorrect = intent.getIntExtra("numIncorrect", 0)
        time = intent.getDoubleExtra("time", 0.0)

        gameOverTextview.text = "Game Over, $name"
        if(numIncorrect!! < 3) {
            showAlert()
        }
        displayLeaderBoard()
        //try again event listener
        tryAgainButton.setOnClickListener{
            when(gradeLevel) {
                "pre-school" -> selectedGradePosition = 0
                "kindergarten" -> selectedGradePosition = 1
                "1st grade" -> selectedGradePosition = 2
                "2nd grade" -> selectedGradePosition = 3
                "3rd grade" -> selectedGradePosition = 4
            }
            name?.let { it1 -> subject?.let { it2 ->
                myQuizScreen.quiz(selectedGradePosition, it1,
                    it2
                )
            } }
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("playerName", myQuizScreen.name)
            intent.putExtra("subject", myQuizScreen.subject)
            intent.putExtra("gradeLevel", myQuizScreen.gradeLevel)
            startActivity(intent)
        }

        //switch subject event listener
        switchSubjectButton.setOnClickListener {
            when(gradeLevel) {
                "pre-school" -> selectedGradePosition = 0
                "kindergarten" -> selectedGradePosition = 1
                "1st grade" -> selectedGradePosition = 2
                "2nd grade" -> selectedGradePosition = 3
                "3rd grade" -> selectedGradePosition = 4
            }
            when(subject) {
                "Reading" -> subject = "Math"
                "Math" -> subject = "Reading"
            }
            name?.let { it1 -> subject?.let { it2 -> myQuizScreen.quiz(selectedGradePosition, it1, it2) } }
            println("myQuizScreenName"+ myQuizScreen.name)
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("playerName", myQuizScreen.name)
            intent.putExtra("subject", myQuizScreen.subject)
            intent.putExtra("gradeLevel", myQuizScreen.gradeLevel)
            startActivity(intent)
        }

        //start over event listener
        startOverrButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    //source: https://www.tutorialspoint.com/android/android_alert_dialoges.htm
    private fun showAlert() {
        if (popUpShown) { return }
        //Builder pattern 
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Congratulations, $name!")
        alertDialogBuilder.setMessage("Would you like to add your name to the Funi leader board?")
        //alertDialogBuilder.setIcon(R.drawable)
        alertDialogBuilder.setPositiveButton("Yes") { dialog, _ ->  dialog.dismiss()
        addToLeaderBoard()
        }
        alertDialogBuilder.setNegativeButton("No") { dialog, _ ->  dialog.dismiss()
        }
        val alert: AlertDialog = alertDialogBuilder.create()
        alert.show()
        popUpShown = true
    }

    private fun displayLeaderBoard() {

        listView = leaderboardListView
        when(gradeLevel) {
            "pre-school" -> leaderBoardTextview.text = "Pre-School $subject Leader Board"
            "kindergarten" -> leaderBoardTextview.text = "Kindergarten $subject Leader Board"
            "1st grade" -> leaderBoardTextview.text = "1st grade $subject Leader Board"
            "2nd grade" -> leaderBoardTextview.text = "2nd grade $subject Leader Board"
            "3rd grade" -> leaderBoardTextview.text = "3rd grade $subject Leader Board"
        }
        players= mutableListOf()

        try {
            when (subject) {
                "Math" -> when (gradeLevel) {
                    "pre-school" -> File(this.getFilesDir().getPath().toString() + "/preschoolMath.txt").forEachLine { players!!.add(it) }
                    "kindergarten" -> File(this.getFilesDir().getPath().toString() + "/kindergartenMath.txt").forEachLine { players!!.add(it) }
                    "1st grade" -> File(this.getFilesDir().getPath().toString() + "/firstMath.txt").forEachLine { players!!.add(it) }
                    "2nd grade" -> File(this.getFilesDir().getPath().toString() + "/secondMath.txt").forEachLine { players!!.add(it) }
                    "3rd grade" -> File(this.getFilesDir().getPath().toString() + "/thirdMath.txt").forEachLine { players!!.add(it) }
                }
                "Reading" -> when (gradeLevel) {
                    "pre-school" -> File(this.getFilesDir().getPath().toString() + "/preschoolReading.txt").forEachLine { players!!.add(it) }
                    "kindergarten" -> File(this.getFilesDir().getPath().toString() + "/kindergartenReading.txt").forEachLine { players!!.add(it) }
                    "1st grade" -> File(this.getFilesDir().getPath().toString() + "/firstReading.txt").forEachLine { players!!.add(it) }
                    "2nd grade" -> File(this.getFilesDir().getPath().toString() + "/secondReading.txt").forEachLine { players!!.add(it) }
                    "3rd grade" -> File(this.getFilesDir().getPath().toString() + "/thirdReading.txt").forEachLine { players!!.add(it) }
                }
            }
        } catch (ioException : IOException) {

        }

        println("list $$$" + players!!.size)
        val adapter : ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            players!!
        )
        listView?.adapter = adapter
    }

    private fun addToLeaderBoard() {
        //source: https://developer.android.com/reference/java/io/PrintWriter, https://stackoverflow.com/questions/30551853/can-we-use-printwriter-class-for-saving-a-string-in-a-file-in-an-android-app-if
        player = numIncorrect?.let { Player(name, gradeLevel, subject.toString(), time, it) }
        try {
            when (subject) {
                "Reading" -> when (gradeLevel) {
                    "pre-school" -> File(this.getFilesDir().getPath().toString() +"/preschoolReading.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "kindergarten" -> File(this.getFilesDir().getPath().toString() +"/kindergartenReading.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "1st grade" -> File(this.getFilesDir().getPath().toString() +"/firstReading.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "2nd grade" -> File(this.getFilesDir().getPath().toString() +"/secondReading.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "3rd grade" -> File(this.getFilesDir().getPath().toString() +"/thirdReading.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                }
                "Math" -> when (gradeLevel) {
                    "pre-school" -> File(this.getFilesDir().getPath().toString() +"/preschoolMath.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "kindergarten" -> File(this.getFilesDir().getPath().toString() +"/kindergartenMath.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "1st grade" -> File(this.getFilesDir().getPath().toString() +"/firstMath.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "2nd grade" -> File(this.getFilesDir().getPath().toString() +"/secondMath.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                    "3rd grade" -> File(this.getFilesDir().getPath().toString() +"/thirdMath.txt").printWriter().use { out ->
                        if (player != null) {
                            out.println(player!!.description)
                        }
                        players?.forEach { out.println(it) }
                    }
                }
            }
            println("$$$$ directory: " + this.getFilesDir().getPath().toString())
        } catch (ioException : IOException) {
            println("exception $$$$" + ioException)
        }
        displayLeaderBoard()
    }


    //add stuff for leader board saving state
    private fun updateUI() {
        name = intent.getStringExtra("playerName")
        subject = intent.getCharSequenceExtra("subject")
        gradeLevel = intent.getStringExtra("gradeLevel")
        numIncorrect = intent.getIntExtra("numIncorrect", 0)
        time = intent.getDoubleExtra("time", 0.0)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("name", name)
        outState.putString("gradeLevel", gradeLevel)
        outState.putCharSequence("subject", subject)
        outState.putBoolean("popUp", popUpShown)
        time?.let { outState.putDouble("time", it) }
        numIncorrect?.let { outState.putInt("numIncorrect", it) }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        name = savedInstanceState.getString("name")
        gradeLevel = savedInstanceState.getString("gradeLevel")
        subject = savedInstanceState.getCharSequence("subject")
        time = savedInstanceState.getDouble("time")
        numIncorrect = savedInstanceState.getInt("numIncorrect")
        popUpShown = savedInstanceState.getBoolean("popUp")
        updateUI()
    }
}
