package com.agilsantosa.academy.ui.reader.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agilsantosa.academy.data.ModuleEntity
import com.agilsantosa.academy.databinding.ItemsModuleListCustomBinding

class ModuleListAdapter internal constructor(private val listener: MyAdapterClickListener) :
    RecyclerView.Adapter<ModuleListAdapter.ModuleViewHolder>() {

    private var listModules = ArrayList<ModuleEntity>()

    internal fun setModules(modules: List<ModuleEntity>) {
        if (modules == null) return
        this.listModules.clear()
        this.listModules.addAll(modules)
    }

    inner class ModuleViewHolder(val binding: ItemsModuleListCustomBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(module: ModuleEntity) {
            binding.textModuleTitle.text = module.title
        }
    }

    override fun getItemCount(): Int = listModules.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val itemsModuleListCustomBinding =
            ItemsModuleListCustomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(itemsModuleListCustomBinding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = listModules[position]
        holder.bind(module)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(
                holder.adapterPosition,
                listModules[holder.adapterPosition].moduleId
            )
        }
    }
}

internal interface MyAdapterClickListener {
    fun onItemClicked(position: Int, moduleId: String)
}