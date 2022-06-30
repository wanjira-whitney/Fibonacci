package dev.wanjira.fibonacciassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wanjira.fibonacciassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayseries()
    }
    fun displayseries(){
        var numberList = (fibonnaci())
        val namesAdapter= NumbersRecyclerViewAdapter(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter=namesAdapter
        print(numberList)

    }

    fun fibonnaci(): ArrayList<Int> {
        var list=ArrayList<Int>()
        var limit = 100
        var first_num = 0
        var second_num = 1
        for (n in 1..limit){

            val sum = first_num + second_num
            first_num = second_num
            second_num = sum
            list+=sum
        }
        return  list
    }
}