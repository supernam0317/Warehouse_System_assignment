package com.warehouseBundle.ui.item_list

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.warehouseBundle.R

@Suppress("DEPRECATION")
class ItemDetailFragment: Fragment() {
    private lateinit var btn: Button
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_item_detail, container, false)
        btn = root.findViewById(R.id.btn_item_detail_back)
        btn.setOnClickListener {
            if (fragmentManager!!.backStackEntryCount != 0) {
                fragmentManager!!.popBackStack();
            }
        }
        return root
    }
}