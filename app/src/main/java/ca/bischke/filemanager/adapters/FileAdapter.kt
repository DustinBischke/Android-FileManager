package ca.bischke.filemanager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ca.bischke.filemanager.R
import kotlinx.android.synthetic.main.list_file.view.*
import java.io.File

class FileAdapter(private val fileList: ArrayList<File>) : RecyclerView.Adapter<FileAdapter.FileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_file, parent, false)
        return FileViewHolder(view)
    }

    override fun onBindViewHolder(holder: FileViewHolder, position: Int) {
        holder.textFileName.text = fileList.get(position).name
    }

    override fun getItemCount(): Int {
        return fileList.size
    }

    class FileViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textFileName: TextView = view.text_file_name
    }
}
