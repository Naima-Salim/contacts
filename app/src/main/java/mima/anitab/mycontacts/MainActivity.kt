package mima.anitab.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mima.anitab.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1=Contacts("Naima", "0113247436", "naimasalim027@gmail.com", "Bajuri-lamu", "https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contacts("salim", "0115247436", "naimasalim027@gmail.com", "Bajuri-lamu", "https://images.unsplash.com/photo-1539701938214-0d9736e1c16b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3=Contacts("yusuf", "0113247436", "naimasalim027@gmail.com", "Bajuri-lamu", "https://images.unsplash.1.2.=60")
        var contact4=Contacts("maryann", "0113247436", "naimasalim027@gmail.com", "Bajuri-lamu", "https://images.unsplash.com/photo-1543807535-eceef0bc6599?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact5=Contacts("shirleen", "0113247436", "naimasalim027@gmail.com", "Bajuri-lamu", "https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contactsList= listOf(contact1,contact2,contact3,contact4,contact5)
        var contactsAdapter=ContactsRvAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}