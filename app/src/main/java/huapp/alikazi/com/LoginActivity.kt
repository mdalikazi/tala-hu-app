package huapp.alikazi.com

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_submit.setOnClickListener({
            if (isValid()) {
                login_submit.isEnabled = false
                login_progress_bar.visibility = View.VISIBLE
                val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(this.currentFocus.windowToken, 0)
                Handler().postDelayed({
                    val intent = Intent(this, PortalActivity::class.java)
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