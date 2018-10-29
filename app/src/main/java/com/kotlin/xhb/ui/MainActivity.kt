package com.kotlin.xhb.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import com.kotlin.xhb.bean.Person
import com.kotlin.xhb.adapter.PersonRvAdapter
import com.kotlin.xhb.R
import com.kotlin.xhb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var contentView: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentView = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        contentView.person = Person("tom", 12)



        //列表
        contentView.recyclerView.layoutManager = LinearLayoutManager(this)
        contentView.recyclerView.adapter = PersonRvAdapter(LayoutInflater.from(this),
                Array(10, init = { it -> Person("Tom--" + "${it}", it) })
        )
    }
}