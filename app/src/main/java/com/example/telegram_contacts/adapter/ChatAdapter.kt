package com.example.telegram_contacts.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_contacts.R
import com.example.telegram_contacts.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var item: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val item_type_search = 0
    val item_type_location = 1
    val item_type_add = 2
    val item_type_chat = 3


    fun issearch(position: Int): Boolean {
        return position == 0
    }

    fun islocation(position: Int): Boolean {
        return position == 1
    }

    fun isadd(position: Int): Boolean {
        return position == 2
    }

   fun ischat(position: Int):Boolean{
       return position==3
   }

    override fun getItemViewType(position: Int): Int {
        if (issearch(position)) return item_type_search
        if (islocation(position)) return item_type_location
        if (isadd(position)) return item_type_add

        return item_type_chat
    }


    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == item_type_search) {
            var view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
            return MessageSearchHolder(view)
        }

        else if (viewType == item_type_location) {
            var view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent, false)
            return MessagelocationHolder(view)
        }

        else if (viewType == item_type_add) {
            var view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_add, parent, false)
            return MessageAddHolder(view)
        }

            var view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
            return MessageChatHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var chats = item[position]

        if (holder is MessageChatHolder) {

            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_message = holder.tv_message


            iv_profile.setImageResource(chats.profile)
            tv_fullname.text = chats.fullname
            tv_message.text = chats.message
        }
    }

    class MessageSearchHolder(view: View) : RecyclerView.ViewHolder(view) {}


    class MessagelocationHolder(view: View) : RecyclerView.ViewHolder(view) {}

    class MessageAddHolder(view: View) : RecyclerView.ViewHolder(view) {}

    class MessageChatHolder(view: View) : RecyclerView.ViewHolder(view) {

        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_message: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_message = view.findViewById(R.id.tv_message)
        }

    }
}