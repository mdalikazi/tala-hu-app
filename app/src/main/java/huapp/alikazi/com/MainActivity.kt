package huapp.alikazi.com

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()

        // Opened sidebar
        // OPTION 1 -> raw_4
        // OPTION 2 -> raw_5
        // OPTION 5 -> raw_6

        // Main sidebar
        // OPTION 3 -> raw_7
    }
}
