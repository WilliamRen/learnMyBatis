drop table blog if exists;
drop table blog_comments if exists;
drop table blog_post if exists;
drop table blog_user if exists;

create table blog (
  id varchar(32),
  title varchar(32),
  userid varchar(32),
  url varchar(32)
);

create table blog_user (
  userid varchar(32),
  username varchar(32),
  password varchar(32),
  userinfo varchar(32)
);

create table blog_post (
  postid varchar(32),
  userid varchar(32),
  postdate varchar(32),
  postinfo varchar(500)
);

create table blog_comments (
  commentid varchar(32),
  postid varchar(32),
  username varchar(32),
  msg varchar(32)
);

insert into blog values('1','偶尔记一下','1','http://blog.csdn.net/isea533');
insert into blog values('2','测试','2','http://www.google.com');

insert into blog_user values('1','abel533','123456','java - 没事看看');
insert into blog_user values('2','test','123456','Test');

insert into blog_post values('1','1','2014-1-21','EasyUI特殊情况下的BUG整理 http://blog.csdn.net/isea533/article/details/17953787 该问题在IE下显示如下： 放大后： 可以看到本该是箭头的位置，出现了一个缺口，很影响美观。。 解决方法有两种，一种最简单的方式就是在IE下不显示箭头。');
insert into blog_post values('2','1','2014-1-11','今天打开别人分享的一个有道云笔记的时候网页一直显示载入中... 刷新多次都无效，然后F12打开开发者工具，发现有两个js请求失败，单独在链接中打开js很正常。 显示如下图： 在Request Header这里显示CAUTION Provisional headers are shown');
insert into blog_post values('3','2','2014-1-12','前面有两篇： Easyui - combo[tree,box]下拉图标有间隙bug解决方法 http://blog.csdn.net/isea533/article/details/12996561 Easyui - dialog,window影响父页面布局的BUG解决方法 http://blog.csdn.net/isea533/article/details/13000');
insert into blog_post values('4','2','2014-1-31','2012年统计用区划代码和城乡划分代码 数据来源:http://www.stats.gov.cn/zjtj/tjbz/tjyqhdmhcxhfdm/2012/ 格式:XML 预览图: 下载地址： 全国数据（所有数据都在一个XML内）：http://pan.baidu.com/s/1hqxD6vU 分省数据：http://pan.');
insert into blog_post values('5','2','2014-2-11','by Roald onOct.16, 2007, under Uncategorized 原文讲解使用的IntelliJ自动生成的equals，只要理解了，使用Eclipse也一样。 假设您有一个简单的pojo类称为MyPojo。包含一些任意属性和一个id和版本。通过IntelliJ生成equals()方法,这个对象,如下所示。');

insert into blog_comments values('1','1','专家费','楼主好！');
insert into blog_comments values('2','1','噶额外','不错，顶！！！');
insert into blog_comments values('3','1','光棍汉','不错！！！');
insert into blog_comments values('4','2','光和热','支持楼主！！');
insert into blog_comments values('5','3','静态化','谢谢楼主！！');
insert into blog_comments values('6','3','俄国和','同谢！！');