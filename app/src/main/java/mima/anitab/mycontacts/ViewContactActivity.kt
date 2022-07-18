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
        getExtras()
        getClicklisteners()
    }
    fun getClicklisteners(){
        binding.ivBack.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
    fun getExtras(){
        val extras=intent.extras
        binding.tvName2.text=extras?.getString("NAME","")
        binding.tvEmail2.text=extras?.getString("EMAIL","")
        binding.tvAddress2.text=extras?.getString("ADDRESS","")
        binding.tvNumber.text=extras?.getString("NUMBER","")
        val image=extras?.getString("IMAGE","")
                Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .resize(300,300)
            .centerCrop()
            .into(binding.ivProfile)

    }
}