package pt.indoortrackingapp.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pt.indoortrackingapp.R
import pt.indoortrackingapp.databinding.FragmentLoginBinding
import pt.indoortrackingapp.ui.activities.DashBoardActivity

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentLoginBinding.inflate(inflater).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.createAccountTxt.setOnClickListener {
            findNavController()
                .navigate(R.id.singUpFragment)
        }
        binding.loginButton.setOnClickListener {
            val intent = Intent(requireActivity(), DashBoardActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }
}