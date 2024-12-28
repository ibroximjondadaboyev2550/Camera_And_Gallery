package com.example.ameraandgallery19.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ameraandgallery19.databinding.ItemRvBinding
import com.example.ameraandgallery19.models.myImage

class MyImageAdapter(var list:ArrayList<MyImage> = ArrayList()):RecyclerView.Adapter<MyImageAdapter.Vh>(){

    inner class Vh(val itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){


        fun onBind(myImage: myImage){
            

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyImageAdapter.Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: MyImageAdapter.Vh, position: Int) {

    }

    override fun getItemCount(): Int  = list.size
    }





