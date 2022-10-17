package com.commscope.codingchallengekt

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.commscope.codingchallengekt.adapters.BookAdapter
import com.commscope.codingchallengekt.databinding.ActivityBooksBinding
import com.commscope.codingchallengekt.models.Book
import com.commscope.codingchallengekt.models.BookList
import com.commscope.codingchallengekt.utils.loadStringFromAsset
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

class BooksActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBooksBinding.inflate(layoutInflater) }
    private lateinit var booksList: BookList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Books"
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun loadStatic(view: View) {
        booksList = BookList().apply {
            books.add(
                Book(
                    "Java For Dummies",
                    "Learn the basics of Java",
                    "Does what it says on the tin"
                )
            )
            books.add(
                Book(
                    "C# For Dummies",
                    "Learn the basics of C#",
                    "Does what it says on the tin"
                )
            )
            books.add(
                Book(
                    "C++ For Dummies",
                    "Learn the basics of C++",
                    "Does what it says on the tin"
                )
            )
        }
        binding.recyclerView.adapter = BookAdapter(this, booksList)
    }

    fun loadAssets(view: View) {
        val jsonStr = loadStringFromAsset(this, "books.json")
        val gson = Gson()
        val assetBooksList: BookList = gson.fromJson(jsonStr, BookList::class.java)
        booksList.books.addAll(assetBooksList.books)
        binding.recyclerView.adapter?.notifyDataSetChanged()
    }
}