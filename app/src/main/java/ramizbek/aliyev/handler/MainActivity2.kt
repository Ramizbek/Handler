package ramizbek.aliyev.handler

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import ramizbek.aliyev.handler.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private  lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        MyTask().execute()
    }


    inner class MyTask:AsyncTask<Void, Void, Void>() {
       //Jarayonni boshida
        override fun onPreExecute() {
            super.onPreExecute()
           binding.progress.visibility = View.VISIBLE
        }

        //Jarayon fonda davom etadi bunda viewlarga o'zgartirish kiritish tavsiya etilmaydi
        override fun doInBackground(vararg p0: Void?): Void? {
            Thread.sleep(3000)
            return null
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            binding.progress.visibility = View.GONE
        }
    }


//    var isBack = false
//    override fun onBackPressed() {
//        if (isBack){
//            super.onBackPressed()
//            return
//        }
//        isBack = true
//        Toast.makeText(this, "Please click again", Toast.LENGTH_SHORT).show()
//        val handler1  = Handler(Looper.getMainLooper())
//        handler1.postDelayed({
//            isBack = false
//        }, 3000)
//    }
}