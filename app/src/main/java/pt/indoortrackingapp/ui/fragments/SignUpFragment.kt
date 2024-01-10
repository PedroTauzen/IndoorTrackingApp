package pt.indoortrackingapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pt.indoortrackingapp.R
import pt.indoortrackingapp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSignUpBinding.inflate(inflater).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.alreadyHaveAccountTxt.setOnClickListener {
            findNavController()
                .navigateUp()
        }
        binding.signUpButton.setOnClickListener {
            findNavController()
                .navigateUp()
        }
    }
}