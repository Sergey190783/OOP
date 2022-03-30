package ru.netology

import ru.netology.post.*
import ru.netology.wall.WallService

fun main(args: Array<String>) {
    val service = WallService(
        arrayOf(
            Post(
                //121,//Идентификатор записи
                11,//Идентификатор владельца стены, на которой размещена запись.
                34,//Идентификатор автора записи (от чьего имени опубликована запись).
                33,//Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
                1000,//Время публикации записи в формате unixtime
                "Привет",//Текст записи.
                22,//Идентификатор владельца записи, в ответ на которую была оставлена текущая.
                33,//Идентификатор записи, в ответ на которую была оставлена текущая.
                true,//1, если запись была создана с опцией «Только для друзей».
                Comments(44, true, true, true, true),//Информация о комментариях к записи, объект с полями:
                Copyright(77, "Пока", "оатмот", "акомтко"),//Источник материала, объект с полями:
                Likes(12, 23, 34, 45),//Информация о лайках к записи, объект с полями
                Reposts(12, 23),//Информация о репостах записи («Рассказать друзьям»), объект с полями
                Views(33),//Информация о просмотрах записи. Объект с единственным полем:
                "post",//Тип записи, может принимать следующие значения
                88,//Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
                true,//Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
                true,//Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
                true,//Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
                true,//Информация о том, что запись закреплена.
                true,//Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет).
                true,//true, если объект добавлен в закладки у текущего пользователя.
                Donut(true, 34, true, Placeholder("овтпит"), "армрг"),//Информация о записи VK Donut:
                12//Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
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
                Likes(11, 25, 37, 40),
                Reposts(11, 22),
                Views(31),
                "wec",
                55,
                false,
                false,
                true,
                true,
                true,
                true,
                Donut(true, 33, true, Placeholder("fvefbv"), "nbnbg"),
                11
            )
        )
    )
    println(service.posts[0])
}
