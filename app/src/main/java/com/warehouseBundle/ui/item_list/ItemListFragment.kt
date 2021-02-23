package com.warehouseBundle.ui.item_list

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.warehouseBundle.R


@Suppress("DEPRECATION")
class ItemListFragment : Fragment() {
    private lateinit var btn: Button
    private lateinit var img: ImageView
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_item_list, container, false)
        img = root.findViewById(R.id.img1)
        img.setOnClickListener {
            nextToDetail()
        }
        btn = root.findViewById(R.id.btn_item_add)
        btn.setOnClickListener {
            nextToDetail()
        }
        return root
    }

    @SuppressLint("UseRequireInsteadOfGet")
    private fun nextToDetail(){
        val fragment: Fragment = ItemDetailFragment()
        val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
        transaction.replace(
            R.id.nav_host_fragment,
            fragment
        )
        transaction.addToBackStack(null)
        transaction.commit()
    }
}