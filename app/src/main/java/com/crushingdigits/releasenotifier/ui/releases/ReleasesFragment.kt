package com.crushingdigits.releasenotifier.ui.releases

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.crushingdigits.releasenotifier.R

class ReleasesFragment : Fragment() {

  companion object {
    fun newInstance() = ReleasesFragment()
  }

  private lateinit var viewModel: ReleasesViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return inflater.inflate(R.layout.releases_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this)
        .get(ReleasesViewModel::class.java)
    // TODO: Use the ViewModel
  }

}
