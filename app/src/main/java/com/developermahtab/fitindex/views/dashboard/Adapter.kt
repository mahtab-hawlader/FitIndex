package com.developermahtab.fitindex.views.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.developermahtab.fitindex.databinding.DashboardRecyclerItemBinding

class Adapter(val itemList: List<DashItem>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = DashboardRecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
        }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
       holder.binding.apply {
           val position = itemList[position]
           coverImage.setImageResource(position.img)
           title.text = position.title
           description.text = position.desc
       }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(val binding: DashboardRecyclerItemBinding): RecyclerView.ViewHolder(binding.root)
}