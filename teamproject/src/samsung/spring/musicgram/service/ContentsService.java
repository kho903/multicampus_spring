package samsung.spring.musicgram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import samsung.spring.musicgram.dao.ContentsMapper;
import samsung.spring.musicgram.dto.Contents;

@Service
public class ContentsService {

	@Autowired
	private ContentsMapper contentsMapper;

	public Contents getContent(int content_no) {
		return contentsMapper.getContent(content_no);
	}

	public List<Contents> getContents() {
		return contentsMapper.getContents();
	}

	public int deleteContent(int content_no) {
		return contentsMapper.deleteContent(content_no);
	}

	public int updateContent(Contents content) {
		return contentsMapper.updateContent(content);
	}

	public int createContent(Contents content) {
		return contentsMapper.createContent(content);
	}

	public int getLike(int content_no) {
		return contentsMapper.getLike(content_no);
	}

	public List<Contents> getGenreContents(String genre) {
		return contentsMapper.getGenreContents(genre);
	}

	public List<Contents> getTagContents(String tag) {
		return contentsMapper.getTagContents(tag);
	}

	public int pressLike(int content_no) {
		return contentsMapper.pressLike(content_no);
	}

	public int cancelLike(int content_no) {
		return contentsMapper.cancelLike(content_no);
	}

}
