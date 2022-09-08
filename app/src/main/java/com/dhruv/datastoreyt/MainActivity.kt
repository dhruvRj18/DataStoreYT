package com.dhruv.datastoreyt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dhruv.datastoreyt.Constants.USER_NAME
import com.dhruv.datastoreyt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataStoreViewModel : DataStoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val userName = binding.edUsername.text.toString()
            dataStoreViewModel.storeUserName(userName)
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))

            //clear preferences
           // dataStoreViewModel.clearPreferences(USER_NAME)
        }

    }
}