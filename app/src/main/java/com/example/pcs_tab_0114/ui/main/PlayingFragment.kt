package com.example.pcs_tab_0114.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pcs_tab_0114.Movie
import com.example.pcs_tab_0114.MovieAdapter
import com.example.pcs_tab_0114.R


class PlayingFragment : Fragment() {
    private val movie = arrayOf("Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice ")
    private val movieYear = arrayOf("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View
        view = inflater.inflate(R.layout.fragment_playing, container, false)

        var movieList:ArrayList<Movie> = ArrayList<Movie>()
        for (i in 0 until movie.size){
            val mov = Movie(movie[i],movieYear[i])
            movieList.add(mov)
        }

        var rvMovie : RecyclerView
        rvMovie = view.findViewById(R.id.rv_movie)

        rvMovie.setHasFixedSize(true)
        rvMovie.layoutManager = LinearLayoutManager(context)

        val movieAdapter = MovieAdapter(movieList)
        rvMovie.adapter = movieAdapter
        return view
    }


}