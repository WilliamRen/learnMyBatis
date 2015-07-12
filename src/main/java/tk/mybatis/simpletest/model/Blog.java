package tk.mybatis.simpletest.model;

import java.io.Serializable;

public class Blog implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String userid;

    private String url;

    public Blog(String id) {
		super();
		this.id = id;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}