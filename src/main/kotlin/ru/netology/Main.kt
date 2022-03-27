package ru.netology

import ru.netology.post.*
import ru.netology.wall.WallService

class Main {
    fun main() {
        val service = WallService(
            arrayOf(
                Post(
                    121,
                    11,
                    34,
                    33,
                    1000,
                    "Привет",
                    22,
                    33,
                    true,
                    Comments(44, true, true, true, true),
                    Copyright(77, "Пока", "оатмот", "акомтко"),
                    Likes(12,23,34,45),
                    Reposts(12,23),
                    Views(33),
                    "оаомгоыт",
                    88,
                    true,
                    true,
                    true,
                    true,
                    true,
                    true,
                    Donut(true,34,true,Placeholder("овтпит"),"армрг"),
                    12
                ),
                Post(
                    122,
                    12,
                    33,
                    35,
                    100,
                    "Пока",
                    21,
                    33,
                    false,
                    Comments(12, false, true, true, false),
                    Copyright(77, "GJN", "feve", "rvb"),
                    Likes(11,25,37,40),
                    Reposts(11,22),
                    Views(31),
                    "wec",
                    55,
                    false,
                    false,
                    true,
                    true,
                    true,
                    true,
                    Donut(true,33,true,Placeholder("fvefbv"),"nbnbg"),
                    11
                )

            )
        )
    }
}