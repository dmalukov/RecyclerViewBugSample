package com.example.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sample.databinding.FragmentListBinding
import com.example.sample.placeholder.PlaceholderContent


class ItemFragment : Fragment() {

    lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)

        binding.list.layoutManager = LinearLayoutManager(requireContext()).apply {
            stackFromEnd = true
        }
        binding.list.adapter = ItemRecyclerViewAdapter(PlaceholderContent.ITEMS) {
            showFullscreenView()
        }

        return binding.root
    }

    private fun showFullscreenView() {
        val activity = requireActivity() as? MainActivity
        activity?.findViewById<LinearLayout?>(R.id.fullscreen_view)?.let {
            it.isVisible = true
        }
    }

}