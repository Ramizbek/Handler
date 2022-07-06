package ramizbek.aliyev.handler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import ramizbek.aliyev.handler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler
    var time = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler(mainLooper)

        handler.postDelayed(runnable, 100)


    }

    private val runnable = object : Runnable {
        override fun run() {
            binding.tvTime.text = time.toString()
            binding.progress.progress = time

            if (time ==  3){
                startActivity(Intent(Intent(this@MainActivity, MainActivity2::class.java)))
                finish()
            }

            time++
            handler.postDelayed(this, 1000)
        }
    }
}