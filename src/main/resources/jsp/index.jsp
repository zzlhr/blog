<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>黑白的博客</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="css/blog.css">
    <link rel="stylesheet" type="text/css" href="css/wangEditor.min.css">
</head>
<body>
<!--
    关于兼容性
    992*833
    以上
 -->
<div class="row" style="height: 100%">

    <!-- 左侧导航 -->
    <div class="col-md-3 s" style="height: 100% !important;">
        <!-- logo,站标题,座右铭 -->
        <div style="height: 25%;">
            <div style="height: 50%; margin-top: 20px">
                <img class="center-block img-circle" style="width: 40%" src="images/logo.jpg" alt="logo">
            </div>
            <p style="height: 20%;" class="h2 text-center">黑白的小站</p>
            <p style="height: 30%;" class="h5 text-center text-muted" >业精于勤，荒于嬉；行成于思，毁于随。</p>
        </div>

        <!-- 目录 -->
        <div style="height: 62%">
            <div class="text-center h4" style="padding: 50px 50px 10% 50px;">
                <a class="blog-left-list"><p class="list id" id="shouye">首页</p></a>
                <a class="blog-left-list" data-toggle="modal" data-target="#myModal"><p id="wenzhang" class="list">文章</p></a>
                <a class="blog-left-list" ><p class="list id" id="fenxiang">分享</p></a>
                <a class="blog-left-list" ><p class="list id" id="liuyanban">留言板</p></a>
                <a class="blog-left-list" ><p class="list id" id="guanyu">关于</p></a>
            </div>
        </div>

        <!-- 页脚 -->
        <div class="text-center" style="height: 8%">
            <small>Copyright © 2017-2018 heibai小站 All Rights Reserved. www.myheibai.cn 版权所有</small><br>
            <a href="http://www.miitbeian.gov.cn/" class="a" target="_blank" rel="external nofollow"><small>豫ICP备17005770号-1</small></a>
        </div>
        <!-- 选择文章分类 -->
        <!-- Button trigger modal -->

    </div>

    <!-- 内容 -->
    <div class="col-md-6" style="height: 100% !important;">
        <!-- 头部内容 -->
        <div class="header">
            <div>
                <!-- 路径导航 -->
                <ol class="breadcrumb pull-left">
                    当前位置：

                </ol>
                <!-- 搜索 -->
                <div class="pull-right" style="width: 25%; margin-top: 5px;">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="搜索" aria-label="搜索">
                        <div class="input-group-btn">
                            <button class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                        </div>
                    </div>
                </div>
            </div>
            <hr style="clear: both">
        </div>
        <!-- 首页 -->
        <div id="index" class="content">
            <!-- 轮播 -->
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height: 500px; width: 100%">
                <!-- Indicators -->
                <ol class="carousel-indicators" style="height: 100%">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox" style="height: 100%">
                    <div class="item active" style="height: 100%">
                        <img src="images/lunbo1.jpeg" alt="..." style="height: 100%">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item" style="height: 100%">
                        <img src="images/lunbo2.jpeg" alt="..." style="height: 100%">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item" style="height: 100%">
                        <img src="images/lunbo3.jpeg" alt="..." style="height: 100%">
                        <div class="carousel-caption">
                        </div>
                    </div>
                </div>
                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <!-- 文章 -->
        <div id="articles" class="content">
            <!-- 文章列表 -->
            <ul style="list-style: none">
                <li>
                    <a href="article.html?id=1234">
                        <h4 class="text-left">黑白的博客</h4>
                    </a>
                    <div>
                        <p class="text-muted pull-left"><small>作者：<a name="about" class="text-success">黑白</a> | 发布时间：2017-4-28 16:48 | 分类：<a name="cs" class="text-success">未分类</a> </small></p>
                        <p class="pull-right">点击数：999</p>
                    </div>
                    <p class="hidetext">这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介这是简介</p>
                </li>
            </ul>
        </div>
        <!-- 分享 -->
        <div id="shares" class="content">
        </div>
        <!-- 留言板 -->
        <div id="message" class="content" style="height: 80%">
            <!-- 内容 -->
            <div style="height: 90%; overflow-y:scroll;">
                <div class="panel panel-warning">
                    <div class="panel-heading"><label class="bg-info">黑白</label> 说：<span class="pull-right">发布于：2017-01-21 09:30</span> </div>
                    <div class="panel-body">
                        <span>欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临</span>
                    </div>
                    <ul class="list-group">
                        <li class="list-group-item"><label class="bg-danger">黑白</label> 于 2017-02-30 08:30 回复：Cras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odio</li>
                    </ul>
                    <div class="panel-footer">
                        <button class="btn btn-success"><span class="glyphicon glyphicon-edit"></span> 评论</button>
                        &nbsp&nbsp
                        <button class="btn btn-info"><span class="glyphicon glyphicon-thumbs-up"></span> 赞</button>
                    </div>
                </div>

                <div class="panel panel-warning">
                    <div class="panel-heading"><label class="bg-info">黑白</label> 说：<span class="pull-right">发布于：2017-01-21 09:30</span> </div>
                    <div class="panel-body">
                        <span>欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临</span>
                    </div>
                    <ul class="list-group">
                        <li class="list-group-item"><label class="bg-danger">黑白</label> 于 2017-02-30 08:30 回复：Cras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odio</li>
                    </ul>
                    <div class="panel-footer">
                        <button class="btn btn-success"><span class="glyphicon glyphicon-edit"></span> 评论</button>
                        &nbsp&nbsp
                        <button class="btn btn-info"><span class="glyphicon glyphicon-thumbs-up"></span> 赞</button>
                    </div>
                </div>

                <div class="panel panel-warning">
                    <div class="panel-heading"><label class="bg-info">黑白</label> 说：<span class="pull-right">发布于：2017-01-21 09:30</span> </div>
                    <div class="panel-body">
                        <span>欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临欢迎光临</span>
                    </div>
                    <ul class="list-group">
                        <li class="list-group-item"><label class="bg-danger">黑白</label> 于 2017-02-30 08:30 回复：Cras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odioCras justo odio</li>
                    </ul>
                    <div class="panel-footer">
                        <button class="btn btn-success"><span class="glyphicon glyphicon-edit"></span> 评论</button>
                        &nbsp&nbsp
                        <button class="btn btn-info"><span class="glyphicon glyphicon-thumbs-up"></span> 赞</button>
                    </div>
                </div>
            </div>
            <!-- 分页 -->
            <div class="" style="height: 10%">
                <div class="center-block" style="width: 35%;">
                    <nav class="" aria-label="分页">
                        <ul class="pagination">
                            <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                            <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                            <li class=""><a href="#">2 <span class="sr-only">(current)</span></a></li>
                            <li class=""><a href="#">3 <span class="sr-only">(current)</span></a></li>
                            <li class=""><a href="#">4 <span class="sr-only">(current)</span></a></li>
                            <li class=""><a href="#">5 <span class="sr-only">(current)</span></a></li>
                            <li class=""><a href="#">6 <span class="sr-only">(current)</span></a></li>
                            <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
                        </ul>
                    </nav>
                </div>
                <div class="pull-right" style="clear: both;"><button class="btn btn-danger" data-toggle="modal" data-target="#sendmessage">发表留言</button></div>
            </div>
        </div>
        <!-- 关于 -->
        <div id="about" class="content" style="margin:5% 20% 5% 20%;">
            <h4>关于我</h4>
            <p>姓名：刘浩然</p>
            <p>职称：初级全栈(Full Stack developer)Web工程师 <small class="text-muted">自封(～￣▽￣)～</small></p>
            <p>特点：宅</p>
            <p>现居地：河南郑州</p>
            <p>主业：Java工程师</p>
            <p>副业：前端工程师</p>
            <p>寄语：神枪手是子弹喂出来的，架构师是代码堆起来的！</p>
            <br />
            <h4>关于博客</h4>
            <p>前端布局：bootstrop</p>
            <p>后台架构：springboot + mybatis</p>
            <p>SQL：mysql</p>
            <p>服务器：阿里云</p>
            <p>开源地址：</p>
            <p>ps：这已经是我第n次重写博客了，之前的那个上线的博客后台是nodejs实现的，后来发现维护好麻烦啊，还有就是页面好丑啊。最后无奈之下就重写了这一版，请原谅我半吊子的css和审美。</p>

        </div>
        <!-- 文章页 -->
        <div id="article" class="content" style="margin:5% 15% 5% 15%; overflow-y:scroll;">
            <h4>《天问》</h4>
            <p><small class="text-muted">作者：黑白 | 发布时间：2017-04-30 10:52 | 分类：【未分类】</small></p>
                余光中
            　　水上的霞光呵
            　　一条接一条，何以
            　　都没入了暮色了呢？
            　　地上的灯光呵
            　　一盏接一盏，何以
            　　都没入了夜色了呢？
            　　天上的星光呵
            　　一颗接一颗，何以
            　　都没入了曙色了呢？
            　　我们的生命呵
            　　一天接一天，何以
            　　都归于永恒了呢？
            　　而当我走时呵
            　　把我接走的，究竟
            　　是怎样的天色呢？
            　　是暮色吗昏昏？
            　　是夜色吗沉沉？
            　　是曙色吗耿耿
        </div>
    </div>

    <!-- 右侧导航 -->
    <div class="col-md-3 s" style="height: 100% !important;">
        <!-- 关于我 -->
        <div class="center-block blog-right-list">
            <h4>关于我</h4>
            <p>名儿：刘浩然</p>
            <p>性别：<b style="color: #5bc0de">♂</b>（爱好<b style="color: hotpink">♀</b>)</p>
            <p>职业：码农</p>
            <p>E-Mail：2388399752@qq.com</p>
            <p>QQ：2388399752</p>
        </div>
        <!-- 推荐 -->
        <div class="blog-right-list">
            <h4>文章推荐</h4>
            <p><a class="blog-left-class">【未分类】</a><a href="index.html?article=1234">关于博客</a></p>
            <p><a class="blog-left-class">【Java】</a><a href="index.html?article=1234">什么是反射机制</a></p>
            <p><a class="blog-left-class">【未分类】</a><a href="index.html?article=1234">关于博客</a></p>
            <p><a class="blog-left-class">【未分类】</a><a href="index.html?article=1234">关于博客</a></p>
            <p><a class="blog-left-class">【未分类】</a><a href="index.html?article=1234">关于博客</a></p>
        </div>
        <!-- 最新留言 -->
        <div class="blog-right-list">
            <h4>最新留言</h4>
            <p><span class="pull-left messagelist">xxx:你好！</span><span class="pull-right">2017-02-19</span></p>
            <p><span class="pull-left messagelist">xxx:你好！你好！你好！你好！你好！你好！你好！你好！你好！</span><span class="pull-right">2017-02-19</span></p>
            <p><span class="pull-left messagelist">xxx:你好！你好！你好！你好！你好！你好！你好！你好！你好！</span><span class="pull-right">2017-02-19</span></p>
            <p><span class="pull-left messagelist">xxx:你好！你好！你好！你好！你好！你好！你好！你好！你好！</span><span class="pull-right">2017-02-19</span></p>
            <p><span class="pull-left messagelist">xxx:你好！你好！你好！你好！你好！你好！你好！你好！你好！</span><span class="pull-right">2017-02-19</span></p>
        </div>
        <!-- 友情链接 -->
        <div class="blog-right-list" >
            <h4>友情链接</h4>
            <table class="table">
                <th>
                <th class="col-md-4"><a href="#">亚子的博客</a></th>
                <th class="col-md-4">位置1</th>
                <th class="col-md-4">位置1</th>
                </th>
            </table>

        </div>
    </div>

    <!-- 选择文章分类弹出层 -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">选择分类</h4>
                </div>
                <div class="modal-body">
                    <p><label name="class"><input name='class' type="radio" checked>&nbsp;&nbsp;未分类</label></p>
                    <p><label name="class"><input name='class' type="radio">&nbsp;&nbsp;Java</label></p>
                    <p><label name="class"><input name='class' type="radio">&nbsp;&nbsp;JavaScript</label></p>
                    <p><label name="class"><input name='class' type="radio">&nbsp;&nbsp;Linux</label></p>
                    <p><label name="class"><input name='class' type="radio">&nbsp;&nbsp;易语言</label></p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>

    <!-- 发表留言弹出层 -->
    <div class="modal fade" id="sendmessage" tabindex="-1" role="dialog" aria-labelledby="sendmessage">
        <div class="modal-dialog blog-modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="sendmessageLab">发表留言</h4>
                </div>
                <div class="modal-body">
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">@</span>
                        <input type="text" class="form-control" placeholder="联系方式 E-mail、qq">
                    </div>
                    <p class="text-muted">请放心填写，联系方式作为本人和您联系的唯一渠道，本站不会以任何方式泄露您的联系方式！</p>
                    <div class="input-group">
                        <span class="input-group-addon glyphicon glyphicon-user"></span>
                        <input style="top: 1px;" type="text" class="form-control" placeholder="昵称">
                    </div>
                    <h4>留言内容：</h4>
                    <div id="editor"></div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/wangEditor.min.js"></script>
<script type="text/javascript" src="js/blog.js"></script>
<script type="text/javascript">
    //设置当前位置
    function setbreadcrumb(html) {
        var breadcrumb = '当前位置：';
        breadcrumb += html;
        $('.breadcrumb').html(breadcrumb);
    }
    function init() {
        /**
         * 初始化富文本
         */
        //关闭浏览器打印log
        wangEditor.config.printLog = false;
        //获取需要实例的div
        var editor = new wangEditor('editor');
        // 插入代码时的默认语言
        editor.config.codeDefaultLang = 'java';
        //创建
        editor.create();

        //初始化内容
        $('.content').hide();
        $('#index').show();
        setbreadcrumb('<li><a href="index.html">Home</a></li>');
        
        //监听左侧导航菜单
        $('.list').on('click',function () {
            var id = this.id;
            console.log(id);
            if (id === 'shouye'){
                $('.content').hide();
                $('#index').show();
                setbreadcrumb('<li><a href="index.html">Home</a></li>');
            }
            if (id === 'wenzhang'){
                $('.content').hide();
                $('#articles').show();
                setbreadcrumb('<li><a href="index.html">Home</a></li><li class="active">文章列表</a></li>');
            }
            if (id === 'fenxiang'){
                $('.content').hide();
                $('#shares').show();
                setbreadcrumb('<li><a href="index.html">Home</a></li><li class="active">分享列表</a></li>');
            }
            if (id === 'liuyanban'){
                $('.content').hide();
                $('#message').show();
                setbreadcrumb('<li><a href="index.html">Home</a></li><li class="active">留言板</a></li>');
            }
            if (id === 'guanyu'){
                $('.content').hide();
                $('#about').show();
                setbreadcrumb('<li><a href="index.html">Home</a></li><li class="active">关于</a></li>');
            }
        })

        //监听参数
        var article = $.getUrlParam('article');
        if (!(article === '')){
            $('.content').hide();
            $('#article').show();
        }
    }
    init();
</script>
</html>