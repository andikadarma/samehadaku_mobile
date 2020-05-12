package com.example.samehadakumobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import androidx.annotation.Nullable

/**
 * A simple [Fragment] subclass.
 */
class MyFriendsFragment : Fragment() {

    lateinit var listTeman : ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("Son Gohan", "Laki-laki", "markonam78@gmail.com", "089654321198", "Malang"))
        listTeman.add(MyFriend("Ramadhian Maulana", "Laki-laki", "ramadhianml11@gmail.com", "087776984312", "Malang"))
    }

    private fun tampilTeman() {
        rv_listmyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listmyFriends.adapter = MyFriendAdapter(activity!!, listTeman)
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
}
