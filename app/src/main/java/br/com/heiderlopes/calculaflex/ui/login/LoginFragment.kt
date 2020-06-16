package br.com.heiderlopes.calculaflex.ui.login

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView

import br.com.heiderlopes.calculaflex.R
import br.com.heiderlopes.calculaflex.ui.base.BaseFragment

class LoginFragment : BaseFragment() {

    override val layout = R.layout.fragment_login


    private lateinit var tvSubTitleSignUp: TextView
    private lateinit var containerLogin: LinearLayout
    private lateinit var tvResetPassword: TextView
    private lateinit var tvNewAccount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater
            .from(context)
            .inflateTransition(android.R.transition.move)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView(view)
        startAnimation()
    }

    private fun setUpView(view: View) {
        tvSubTitleSignUp = view.findViewById(R.id.tvSubTitleSignUp)
        containerLogin = view.findViewById(R.id.containerLogin)
        tvResetPassword = view.findViewById(R.id.tvResetPassword)
        tvNewAccount = view.findViewById(R.id.tvNewAccount)
    }

    private fun startAnimation() {
        val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_form_login)
        tvSubTitleSignUp.startAnimation(anim)
        containerLogin.startAnimation(anim)
        tvResetPassword.startAnimation(anim)
        tvNewAccount.startAnimation(anim)
    }
}
