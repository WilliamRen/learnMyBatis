package tk.mybatis.simpletest.model;

import java.util.List;

public class BlogDto extends Blog{
	
	public BlogDto(String id) {
		super(id);
	}
	
	private BlogUser user;
	private List<BlogPostDto> posts;
	public BlogUser getUser() {
		return user;
	}
	public void setUser(BlogUser user) {
		this.user = user;
	}
	public List<BlogPostDto> getPosts() {
		return posts;
	}
	public void setPosts(List<BlogPostDto> posts) {
		this.posts = posts;
	}
}
