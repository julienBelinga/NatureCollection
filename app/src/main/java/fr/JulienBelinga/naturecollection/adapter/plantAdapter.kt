package fr.JulienBelinga.naturecollection.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.JulienBelinga.naturecollection.R

class PlantAdapter : RecyclerView.Adapter<PlantAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

}