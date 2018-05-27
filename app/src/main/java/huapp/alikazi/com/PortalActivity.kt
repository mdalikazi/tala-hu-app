package huapp.alikazi.com

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_portal.*
import kotlinx.android.synthetic.main.toolbar.*

class PortalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portal)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.title_hu_portal)

        portal_sidebar_bottom_1.setOnClickListener({

            if (portal_sidebar_bottom_2.visibility ==  View.GONE) {
                portal_sidebar_bottom_2.visibility = View.VISIBLE
                portal_sidebar_bottom_1.visibility = View.GONE
                portal_button_1.visibility = View.VISIBLE
                portal_button_2.visibility = View.VISIBLE
                portal_button_3.visibility = View.VISIBLE
            } else {
                portal_sidebar_bottom_2.visibility = View.GONE
                portal_sidebar_bottom_1.visibility = View.VISIBLE
                portal_button_1.visibility = View.GONE
                portal_button_2.visibility = View.GONE
                portal_button_3.visibility = View.GONE
            }

        })

        portal_button_1.setOnClickListener({
            var intent = Intent(this, Page4Activity::class.java)
            startActivity(intent)
        })

        portal_button_2.setOnClickListener({
            var intent = Intent(this, Page5Activity::class.java)
            startActivity(intent)
        })

        portal_button_3.setOnClickListener({
            var intent = Intent(this, Page6Activity::class.java)
            startActivity(intent)
        })

    }
}