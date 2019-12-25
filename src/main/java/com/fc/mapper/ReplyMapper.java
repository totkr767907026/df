package com.fc.mapper;

import com.fc.model.Comment;
import com.fc.model.Reply;
import com.fc.model.Topic;

import java.util.List;


public interface ReplyMapper {

    void insertReply(Reply reply);

    List<Reply> listReply(int pid);

    void insertComment(Comment comment);

    List<Comment> listComment(Integer rid);

    String getContentByRid(int rid);

}

String name, email, subject, content, time;
                           int reply, id;
                           while (rs.next()) {
                                  name = rs.getString(1);
                                  email = rs.getString(2);
                                  subject = rs.getString(3);
                                  content = rs.getString(4);
                                  time = rs.getString(5);
                                  id = rs.getInt(7);
                                  out.print("<tr bgcolor=yellow><td><a href="delete.jsp?id=" mce_href="delete.jsp?id=""+id+"&replyid=0><img src="Pictures/delete.bmp" mce_src="Pictures/delete.bmp" width=20 height=20></a></td><td width=300><a href="detail.jsp?id=" mce_href="detail.jsp?id=""+ id + ">" + subject + "</a></td>");
                                  out.print("<td width=200>" + name + "</td>");
                                  out.print("<td width=200>" + time + "</td></tr>");
                           }
