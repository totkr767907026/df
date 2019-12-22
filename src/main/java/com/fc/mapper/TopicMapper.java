package com.fc.mapper;

import com.fc.model.Post;
import com.fc.model.Topic;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface TopicMapper {

    List<Topic> listTopic();

    List<String> listImage();

//    void editDemand(@Param("uid")int uid
//            ,@Param("title")String title,@Param("content")String content);
}
