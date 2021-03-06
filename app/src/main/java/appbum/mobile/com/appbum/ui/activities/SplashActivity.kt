package appbum.mobile.com.appbum.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import appbum.mobile.com.appbum.R
import appbum.mobile.com.appbum.ui.viewModels.SplashViewModel

class SplashActivity : AppCompatActivity() {

    private val viewModel = SplashViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        viewModel.checkVersion()
    }
}
