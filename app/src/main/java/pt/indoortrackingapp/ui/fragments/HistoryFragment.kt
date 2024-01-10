package pt.indoortrackingapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pt.indoortrackingapp.R
import pt.indoortrackingapp.databinding.DevicesListItemBinding
import pt.indoortrackingapp.databinding.FragmentHistoryBinding
import pt.indoortrackingapp.model.Devices

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrList: ArrayList<Devices>

    lateinit var imageId : Array<Int>
    lateinit var deviceName : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHistoryBinding.inflate(inflater).also {
        binding = it
    }.root

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        imageId = arrayOf(
            R.drawable.microscopio,
            R.drawable.osciloscope,
            R.drawable.microscopio,
            R.drawable.osciloscope,
            R.drawable.microscopio,
            R.drawable.osciloscope,
            R.drawable.microscopio,
            R.drawable.osciloscope,
            R.drawable.microscopio,
            R.drawable.osciloscope
        )

        deviceName = arrayOf(
            "Microscope",
            "Oscilloscope",
            "Microscope",
            "Oscilloscope",
            "Microscope",
            "Oscilloscope",
            "Microscope",
            "Oscilloscope",
            "Microscope",
            "Oscilloscope"
        )

    }

}