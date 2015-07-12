package tk.mybatis.simpletest.model;

import java.util.List;

public class BlogPostDto extends BlogPost{
	private BlogUser user;
	private List<BlogComments> comments;

	public BlogUser getUser() {
		return user;
	}

	public void setUser(BlogUser user) {
		this.user = user;
	}

	public List<BlogComments> getComments() {
		return comments;
	}

	public void setComments(List<BlogComments> comments) {
		this.comments = comments;
	}
	
}
