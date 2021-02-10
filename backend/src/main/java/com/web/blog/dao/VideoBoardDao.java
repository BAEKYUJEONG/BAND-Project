package com.web.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.blog.dto.VideoBoard;

public interface VideoBoardDao {
	
	public int insert(VideoBoard vboard) throws Exception;
	public int update(VideoBoard vboard) throws Exception;
	public int delete(String boardId) throws Exception;
	public VideoBoard select(String boardId) throws Exception;
	public List<VideoBoard> selectAll() throws Exception;
}
