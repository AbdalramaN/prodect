package com.tuwiq.prodect.dataSource

import com.tuwiq.prodect.R
import com.tuwiq.prodect.model.prodect

class Data {


    fun loadLondon(): List<prodect> {

        return listOf(
            prodect(
                R.string.speed100,
                R.string.nike,
                R.drawable.a1,
                R.string.price_title,
                30
            ),
            prodect(
                R.string.speed200,
                R.string.nike,
                R.drawable.a2,
                R.string.price_title,
                60
            )
        )
    }

    fun loadMaldives(): List<prodect> {
        return listOf(
            prodect(
                R.string.speed300,
                R.string.nike,
                R.drawable.a3,
                R.string.price_title,
                70
            ),
            prodect(
                R.string.speed400,
                R.string.nike,
                R.drawable.a4,
                R.string.price_title,
                80
            )
        )
    }

    fun loadAmsterdam(): List<prodect> {
        return listOf(
            prodect(
                R.string.speed500,
                R.string.nike,
                R.drawable.a5,
                R.string.price_title,
                90
            ),
            prodect(
                R.string.speed600,
                R.string.nike,
                R.drawable.a1,
                R.string.price_title,
                95
            )
        )
    }

    fun loadMadrid(): List<prodect> {
        return listOf(
            prodect(
                R.string.speed700,
                R.string.nike,
                R.drawable.a2,
                R.string.price_title,
                90
            ),
            prodect(
                R.string.speed800,
                R.string.nike,
                R.drawable.a3,
                R.string.price_title,
                60
            )
        )
    }

}
