package samsung.spring.musicgram.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import samsung.spring.musicgram.dto.Comments;

@Mapper
public interface CommentsMapper {
	public List<Comments> getComments(int contents_no);
	public int deleteComments(int comment_no);
	public int createComment(Comments comment);
}
