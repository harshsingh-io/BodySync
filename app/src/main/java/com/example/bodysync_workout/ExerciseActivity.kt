package com.example.bodysync_workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import com.example.bodysync_workout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private var binding: ActivityExerciseBinding? = null

    private var restTimer: CountDownTimer? = null
    private var restProgress = 0

    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolbarExercise)
        if (supportActionBar!=null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarExercise?.setNavigationOnClickListener{
            onBackPressed()
        }
        setRestProgressBar()

    }
    private fun setupRestView() {
        if (restTimer!=null){
            restTimer?.cancel()
            restProgress = 0
        }
        setRestProgressBar()
    }
    private fun setRestProgressBar() {
        binding?.progressBar?.progress = restProgress

        restTimer = object: CountDownTimer(10000,1000) {
            override fun onTick(millisUntilFinished: Long) {
                restProgress++
                binding?.progressBar?.progress = 10-restProgress
                binding?.tvTimer?.text = (10-restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(
                    this@ExerciseActivity,
                    "Here now we will start the exercise.",
                    Toast.LENGTH_SHORT
                ).show()
                setupExerciseView()

            }
        }.start()
    }
    private fun setupExerciseView() {
        binding?.flProgressBar?.visibility = View.INVISIBLE
        binding?.tvTitle?.visibility = View.INVISIBLE
        binding?.flProgressBarExercise?.visibility = View.VISIBLE
        binding?.tvTitleExercise?.visibility = View.VISIBLE
        if (exerciseTimer!=null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        setExerciseProgressBar()
    }
    private fun setExerciseProgressBar() {
        binding?.progressBarExercise?.progress = exerciseProgress

        exerciseTimer = object: CountDownTimer(30000,1000) {
            override fun onTick(millisUntilFinished: Long) {
                exerciseProgress++
                binding?.progressBarExercise?.progress = 30-exerciseProgress
                binding?.tvTimerExercise?.text = (30-exerciseProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(
                    this@ExerciseActivity,
                    "Here now we will start the next exercise.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (restTimer!=null){
            restTimer?.cancel()
            restProgress = 0
        }

        if (exerciseTimer!=null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        binding = null
    }
}