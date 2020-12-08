package com.atguigu.controller;

import com.atguigu.bean.Movie;
import com.atguigu.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/latest")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }

}
