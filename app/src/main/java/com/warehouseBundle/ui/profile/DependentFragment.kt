package com.warehouseBundle.ui.profile

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
class DependentFragment: Fragment() {
    private lateinit var btn: Button
    private lateinit var img: ImageView
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dependent, container, false)
        btn = root.findViewById(R.id.btn_dependent_back)
        btn.setOnClickListener {
            val fragment: Fragment = ProfileFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.nav_host_fragment,
                fragment
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        img = root.findViewById(R.id.img_dependent_1)
        img.setOnClickListener {
            val fragment: Fragment = StaffProfileFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(
                R.id.nav_host_fragment,
                fragment
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        btn = root.findViewById(R.id.btn_dependent_register)
        btn.setOnClickListener {
            val fragment: Fragment = StaffProfileFragment()
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