package com.developermahtab.fitindex.views.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developermahtab.fitindex.R
import com.developermahtab.fitindex.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private lateinit var binding: FragmentDashboardBinding
    lateinit var recyclerAdapter: Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(layoutInflater,container,false).also { binding = it }
        val itemList = listOf<DashItem>(
            DashItem("BMI Calculator","Calculate your body mass index",R.drawable.bmi),
            DashItem("BMR Calculator","Calculate your Basal Metabolic Rate",R.drawable.bmr),
            DashItem("Daily Calories","Calculate your daily calorie needs",R.drawable.calories),
            DashItem("Water Intake Calculate","Calculate your daily water intake",R.drawable.water_intake)
        )
        recyclerAdapter = Adapter(itemList)
        binding.recyclerView.adapter = recyclerAdapter

        return binding.root
    }
}