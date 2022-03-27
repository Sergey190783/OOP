package ru.netology.wall

import ru.netology.post.Post

class WallService(val posts: Array<Post>) {
    private var curId = 1
    fun add(post: Post): Post{
        val mutablePosts = posts.toMutableList()
        val newPost = post.copy(id = curId)
        mutablePosts.add(newPost)
        posts = mutablePosts.toTypedArray()
        return newPost
    }
}