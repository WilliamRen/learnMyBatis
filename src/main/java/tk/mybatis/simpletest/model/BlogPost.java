package tk.mybatis.simpletest.model;

import java.util.Date;

public class BlogPost {
    private String postid;

    private String userid;

    private String postdate;

    private String postinfo;

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getPostinfo() {
        return postinfo;
    }

    public void setPostinfo(String postinfo) {
        this.postinfo = postinfo;
    }
}