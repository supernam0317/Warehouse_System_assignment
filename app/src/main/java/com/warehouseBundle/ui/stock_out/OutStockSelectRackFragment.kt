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
class OutStockSelectRackFragment: Fragment() {
    private lateinit var btn: Button
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_stock_out_select_rack, container, false)

        btn = root.findViewById(R.id.btn_stock_rack_back)
        btn.setOnClickListener {
            val fragment: Fragment = OutStockMainFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.nav_host_fragment,
                fragment
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }

        btn = root.findViewById(R.id.btn_stock_rack)
        btn.setOnClickListener {
            val fragment: Fragment = OutStockSelectItemFragment()
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