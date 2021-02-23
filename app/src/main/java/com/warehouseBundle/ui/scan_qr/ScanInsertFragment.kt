package com.warehouseBundle.ui.scan_qr

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.warehouseBundle.R

@Suppress("DEPRECATION")
class ScanInsertFragment: Fragment() {
    private lateinit var btn: Button
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_scan_insert, container, false)
        btn = root.findViewById(R.id.btn_back)
        btn.setOnClickListener {
            if (fragmentManager!!.backStackEntryCount != 0) {
                fragmentManager!!.popBackStack();
            }
        }
        return root
    }
}