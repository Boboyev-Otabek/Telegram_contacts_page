package com.example.telegram_contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_contacts.adapter.ChatAdapter
import com.example.telegram_contacts.model.Chat

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        recyclerView=findViewById(R.id.recyclerView)

        recyclerView.layoutManager=GridLayoutManager(this,1)


        refreshAdapter(getAllChat())
    }

    fun refreshAdapter (chats:ArrayList<Chat>){
        var adapter=ChatAdapter(this,chats)
        recyclerView.adapter=adapter
    }
    fun getAllChat():ArrayList<Chat>{
        var chats=ArrayList<Chat>()

        chats.add(Chat(R.drawable.car_1,"Boboyev Nurbek","Salom"))
        chats.add(Chat(R.drawable.car_2,"Boboyev Elbek","Qale"))
        chats.add(Chat(R.drawable.car_3,"Boboyev Otabek","Yaxshi"))
        chats.add(Chat(R.drawable.car_1,"Boboyev Nurbek","Salom"))
        chats.add(Chat(R.drawable.car_2,"Boboyev Elbek","Qale"))
        chats.add(Chat(R.drawable.car_3,"Boboyev Otabek","Yaxshi"))
        chats.add(Chat(R.drawable.car_1,"Boboyev Nurbek","Salom"))
        chats.add(Chat(R.drawable.car_2,"Boboyev Elbek","Qale"))
        chats.add(Chat(R.drawable.car_3,"Boboyev Otabek","Yaxshi"))
        chats.add(Chat(R.drawable.car_1,"Boboyev Nurbek","Salom"))
        chats.add(Chat(R.drawable.car_2,"Boboyev Elbek","Qale"))
        chats.add(Chat(R.drawable.car_3,"Boboyev Otabek","Yaxshi"))
        chats.add(Chat(R.drawable.car_1,"Boboyev Nurbek","Salom"))
        chats.add(Chat(R.drawable.car_2,"Boboyev Elbek","Qale"))
        chats.add(Chat(R.drawable.car_3,"Boboyev Otabek","Yaxshi"))



        return chats
    }

}