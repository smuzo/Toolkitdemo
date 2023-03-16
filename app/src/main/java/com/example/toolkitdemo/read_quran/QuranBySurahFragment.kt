package com.example.toolkitdemo.read_quran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.toolkitdemo.R
import com.example.toolkitdemo.read_quran.inter.MyService
import com.example.toolkitdemo.read_quran.model.SurrahListModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class QuranBySurahFragment : Fragment() {

    private lateinit var rv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran_by_surah, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv = view.findViewById(R.id.rv)

        val allSurrah = MyService.totalSurrahService.getAllSurrah()
        allSurrah.enqueue(object : Callback<SurrahListModel> {
            override fun onResponse(
                call: Call<SurrahListModel>,
                response: Response<SurrahListModel>
            ) {
                if (response.isSuccessful) {
                    val list = response.body()?.data
                    rv.layoutManager = LinearLayoutManager(requireContext())
                    rv.adapter = list?.let { TotalSurrahAdapter(requireContext(), it) }
                }
            }

            override fun onFailure(call: Call<SurrahListModel>, t: Throwable) {

            }
        })

    }


}