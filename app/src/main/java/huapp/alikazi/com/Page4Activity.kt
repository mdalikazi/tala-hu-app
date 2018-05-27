package huapp.alikazi.com

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*

class Page4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_4)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.title_hu_portal)
    }
}