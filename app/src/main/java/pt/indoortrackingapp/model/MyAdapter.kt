package pt.indoortrackingapp.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text
import pt.indoortrackingapp.R

class MyAdapter (private val deviceList : ArrayList<Devices>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.devices_list_item,
            parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return deviceList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = deviceList[position]
        holder.deviceImage.setImageResource(currentItem.deviceImage)
        holder.deviceName.textContent = currentItem.deviceName
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val deviceImage : ShapeableImageView = itemView.findViewById(R.id.device_image)
        val deviceName : Text = itemView.findViewById(R.id.device_name)
    }
}