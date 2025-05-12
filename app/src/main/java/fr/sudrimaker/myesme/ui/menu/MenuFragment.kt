package fr.sudrimaker.myesme.ui.menu
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import fr.sudrimaker.myesme.R
import fr.sudrimaker.myesme.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.profileButton.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_profile)
        }

        binding.assosButton.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_assos)
        }

        binding.notesButton.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_notes)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
