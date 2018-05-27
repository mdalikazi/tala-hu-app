package huapp.alikazi.com

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.page_2.*

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_2)
        setTitle(R.string.title_hu_portal)

        portal_sidebar_bottom_1.setOnClickListener({

            if (portal_sidebar_bottom_2.visibility ==  View.GONE) {
                portal_sidebar_bottom_2.visibility = View.VISIBLE
                portal_sidebar_bottom_1.visibility = View.GONE
            } else {
                portal_sidebar_bottom_2.visibility = View.GONE
                portal_sidebar_bottom_1.visibility = View.VISIBLE
            }

        })

        portal_sidebar_bottom_2.setOnClickListener({
            var intent = Intent(this, Page3Activity::class.java)
            startActivity(intent)
            finish()
        })

    }
}