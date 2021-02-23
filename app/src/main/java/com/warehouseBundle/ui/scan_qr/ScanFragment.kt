package com.warehouseBundle.ui.scan_qr

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.warehouseBundle.R


@Suppress("DEPRECATION")
class ScanFragment : Fragment(){
    private lateinit var img: ImageView
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_scan_qr, container, false)
        img = root.findViewById(R.id.barcodeimage)
        img.setOnClickListener {
            val fragment: Fragment = ScanInsertFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.nav_host_fragment,
                fragment
            )
            transaction.addToBackStack(null) // if written, this transaction will be added to backstack
            transaction.commit()
        }
        return root
    }
}
