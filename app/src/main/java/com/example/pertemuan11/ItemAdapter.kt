package com.example.pertemuan11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class ItemAdapter(val context: Context, val items:
ArrayList<DataModelClass>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_view,
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: ViewHolder,
                                  position: Int) {
        val item = items.get(position)
        holder.tvNama.text = item.nama
        holder.tvNim.text = item.nim
//Mengabdate warna background
        if (position % 2 == 0) {
            holder.llMain.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorLightGray
                )
            )
        } else {
            holder.llMain.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite))
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val llMain = view.llMain
        val tvNama = view.tv_nama
        val tvNim = view.tv_nim
        val ivEdit = view.iv_edit
        val ivDelete = view.iv_delete
    }
}