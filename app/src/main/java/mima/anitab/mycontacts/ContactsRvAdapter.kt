package mima.anitab.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import mima.anitab.mycontacts.databinding.ContactListItemBinding
import kotlin.coroutines.coroutineContext

class ContactsRvAdapter(var contactsList: List<Contacts>):
RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
            var binding=
        ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
   var contactsViewHolder = ContactsViewHolder(binding)
        return  contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContacts = contactsList.get(position)
        holder.binding.tvName.text =currentContacts.name
        holder.binding.tvPhoneNumber.text=currentContacts.phoneNumber
        holder.binding.tvEmail.text=currentContacts.email
        holder.binding.tvAddress.text=currentContacts.address
        Picasso.get()
            .load(currentContacts.image)
//            .error(R.drawable.ic_baseline_error_24)
            .placeholder(R.drawable.ic_baseline_person_24)
            .resize(50,70)
            .centerCrop()
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.binding.ivContact)
        val context=holder.itemView.context
        holder.binding.ivContact.setOnClickListener {
            Toast.makeText(context, "you have clicked on ${currentContacts.name}'s image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener {
            val intent=Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContacts.name)
            intent.putExtra("EMAIL", currentContacts.email)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

}

