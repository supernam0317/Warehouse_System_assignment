package com.warehouseBundle.ui.stock_out

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
class OutStockMainFragment: Fragment() {
    private lateinit var btn: Button
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_stock_out, container, false)
        btn = root.findViewById(R.id.btn_stock_add)
        btn.setOnClickListener {
            val fragment: Fragment = OutStockSelectRackFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.nav_host_fragment,
                fragment
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return root
    }
}