package huapp.alikazi.com

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.page_1.*

class Page1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_1)

        login_submit.setOnClickListener({
            if (isValid()) {
                login_submit.isEnabled = false
                login_progress_bar.visibility = View.VISIBLE
                Handler().postDelayed({
                    var intent = Intent(this, Page2Activity::class.java)
                    startActivity(intent)
                    finish()
                }, 3000)
            }
        })
    }

    private fun isValid(): Boolean {
        if (login_email.length() == 0) {
            login_email.error = getString(R.string.login_validity_error)
            return false
        }

        if (login_password.length() == 0) {
            login_password.error = getString(R.string.login_validity_error)
            return false
        }

        return true
    }
}