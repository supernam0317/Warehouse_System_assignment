package com.warehouseBundle.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.warehouseBundle.R
import com.warehouseBundle.ui.item_list.ItemDetailFragment

@Suppress("DEPRECATION")
class ProfileFragment : Fragment() {
    private lateinit var img: ImageView
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        img = root.findViewById(R.id.img_profile_menu_1)
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
        img = root.findViewById(R.id.img_profile_menu_4)
        img.setOnClickListener {
            val fragment: Fragment = DependentFragment()
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