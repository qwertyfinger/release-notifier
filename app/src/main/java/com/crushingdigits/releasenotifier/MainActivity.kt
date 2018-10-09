package com.crushingdigits.releasenotifier

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crushingdigits.releasenotifier.ui.releases.ReleasesFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
          .replace(R.id.container, ReleasesFragment.newInstance())
          .commitNow()
    }
  }

}
