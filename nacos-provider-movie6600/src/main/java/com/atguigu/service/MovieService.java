package com.atguigu.service;

import com.atguigu.bean.Movie;
import com.atguigu.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Movie getNewMovie(){
        return movieDao.getNewMovie();
    }

}
