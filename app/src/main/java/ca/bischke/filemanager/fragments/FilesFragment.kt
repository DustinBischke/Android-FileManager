package ca.bischke.filemanager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ca.bischke.filemanager.R
import ca.bischke.filemanager.adapters.FileAdapter
import kotlinx.android.synthetic.main.fragment_files.*
import java.io.File

class FilesFragment : Fragment() {
    private val files: ArrayList<File> = ArrayList()
    private lateinit var mView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater.inflate(R.layout.fragment_files, container, false)!!
        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerview_files.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = FileAdapter(files)
        }

        files.add(File("Test"))
        files.add(File("Test2"))
        files.add(File("Test3"))
    }
}