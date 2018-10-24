package com.example.cloudymous.kotlinprojectforkadedicoding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    private var clubs: MutableList<Club> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        initData()

        club_list.layoutManager = LinearLayoutManager(this)

        club_list.adapter = RecyclerViewAdapter(this, clubs) {
            val toast = Toast.makeText(applicationContext, it.name, Toast.LENGTH_SHORT)
            toast.show()
        }
    }

        private fun initData() {
            val name = resources.getStringArray(R.array.club_name)
            val image = resources.obtainTypedArray(R.array.club_image)
            clubs.clear()
            for (i in name.indices) {
                clubs.add(
                    Club(
                        name[i],
                        image.getResourceId(i, 0)
                    )
                )
            }

//        Recycle the typed array
            image.recycle()
        }
}
