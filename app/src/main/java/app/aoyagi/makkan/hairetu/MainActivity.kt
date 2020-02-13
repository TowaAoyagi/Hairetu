package app.aoyagi.makkan.hairetu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val appName = arrayOf("Camsccaner", "googleFit", "Mikan", "Makkan")
    val use = arrayOf("camera", "helth", "english", "drink", "eat")
    val visibility = arrayOf("visible", "invisible")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun usage(view: View?) {

        nameTextView.text = appName[(Random().nextInt(4))] + "は"
        imageTextView.text = use[(Random().nextInt(5))] + "に使います"
        verbTextView.text = visibility[(Random().nextInt(2))]

        when (verbTextView.text) {

            "invisible" -> {
                viewApp.text = "One more again!"
                verbTextView.textSize = 48F
            }

            "visible" -> {
                viewApp.text = "Great!"
                verbTextView.textSize = 24F
            }
        }
    }
}
