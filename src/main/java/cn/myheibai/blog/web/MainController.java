package cn.myheibai.blog.web;

import cn.myheibai.blog.pojo.Article;
import cn.myheibai.blog.pojo.Message;
import cn.myheibai.blog.service.ArticleService;
import cn.myheibai.blog.service.ArticleServiceImpl;
import cn.myheibai.blog.service.MessageService;
import cn.myheibai.blog.service.MessageServiceImpl;
import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lhr on 2017/5/1.
 */
@RestController
@RequestMapping("/")
public class MainController {
    ModelAndView model = new ModelAndView();
    @RequestMapping("/index.html")
    public ModelAndView index(HttpServletRequest request){
        ArticleService articleService = new ArticleServiceImpl();
        List<Article> articleList = articleService.getArticleList(null,0,10);
//        System.out.println(articleList);
        model.setViewName("index");
        model.addObject("articlelist",articleList);
        articleList = articleService.getCommendArticle(2);
        model.addObject("commendright",articleList);
        try {
            //获取并返回留言
            MessageService messageService = new MessageServiceImpl(request);
            List<Message> messages = messageService.findMessage(0,5);
            System.out.println(messages.toString());
            model.addObject("messages",messages);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return model;
    }
}
