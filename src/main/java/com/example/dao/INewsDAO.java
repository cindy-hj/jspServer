package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.NewsEntity;

@Mapper
public interface INewsDAO {
	public List<NewsEntity> listNews();
}
