package com.tuwiq.prodect.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tuwiq.prodect.R
import com.tuwiq.prodect.adapter.prodectAdapter
import com.tuwiq.prodect.dataSource.Data
import com.tuwiq.prodect.databinding.FragmentprodectBinding
import com.tuwiq.prodect.viewModel.SharedViewModel


class prodectFragment : Fragment() {

    private lateinit var recyclerViewnaike: RecyclerView
    private lateinit var recyclerViewnaike: RecyclerView
    private lateinit var recyclerViewnaike: RecyclerView
    private lateinit var recyclerViewnaike: RecyclerView
    private var _binding: FragmentprodectBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_prodect, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listnaike = Data().naike()

        binding.sharedViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        recyclerViewnaike = binding.recyclernaike

        recyclerViewnaike.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        recyclerViewnaike.adapter = prodectAdapter(viewModel, listnaike)


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}