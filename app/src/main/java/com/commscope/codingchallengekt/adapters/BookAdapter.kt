package com.commscope.codingchallengekt.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.commscope.codingchallengekt.R
import com.commscope.codingchallengekt.models.Book
import com.commscope.codingchallengekt.models.BookList

class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

    private val tvTitle: TextView by lazy { view.findViewById(R.id.tv_title) }
    private val tvSubtitle: TextView by lazy { view.findViewById(R.id.tv_subtitle) }

    init {
        view.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // TODO
    }

    fun bind(book: Book) {
        tvTitle.text = book.title
        tvSubtitle.text = book.subtitle
    }
}

class BookAdapter(private val context: Context, private val bookList: BookList) : RecyclerView.Adapter<ViewHolder>() {

    private val layoutInflator by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(layoutInflator.inflate(R.layout.recyclerview_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(bookList.books[position])
    }

    override fun getItemCount(): Int {
        return bookList.books.size
    }
}