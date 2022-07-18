package mima.anitab.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso

import mima.anitab.mycontacts.databinding.ActivityViewContactBinding
class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtra()
    }

    fun getExtra(){
        val extras=intent.extras
        var name=intent.extras?.getString("Name","")
        var phone=intent.extras?.getString("PHONE_NUMBER","")
        var email=intent.extras?.getString("Email","")
        var address=intent.extras?.getString("Address","")
        var imageView=binding.ivProfile

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvName2.text=name
        binding.tvNumber.text=phone
        binding.tvEmail2.text=email
        binding.tvAddress2.text=address
        Picasso.get().load(intent.getStringExtra("Image")).into(imageView)

    }
}





