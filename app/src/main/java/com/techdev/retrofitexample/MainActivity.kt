package com.techdev.retrofitexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.techdev.retrofitexample.domain.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView = findViewById<RecyclerView>(R.id.rvSchoolList)
        recycleView.layoutManager = LinearLayoutManager(this@MainActivity)

        GlobalScope.launch {
            val result = RetrofitHelper.getInstance().getSchoolList()
            Log.e("MainActivity","${result.size}")
            withContext(Dispatchers.Main) {
                recycleView.adapter = NycAdapter(result)
            }

        }
    }
}