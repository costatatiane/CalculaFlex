package br.com.heiderlopes.calculaflex.ui.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

import br.com.heiderlopes.calculaflex.R
import br.com.heiderlopes.calculaflex.ui.base.BaseFragment

class SignUpFragment : BaseFragment() {

    override val layout = R.layout.fragment_sign_up

    private lateinit var tvTerms: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTerms = view.findViewById(R.id.tvTerms)
        tvTerms.setOnClickListener {
            findNavController()
                .navigate(R.id.action_signUpFragment_to_termsFragment)
        }
    }

}
