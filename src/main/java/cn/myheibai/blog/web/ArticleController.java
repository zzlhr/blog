package cn.myheibai.blog.web;

/**
 * Created by lhr on 2017/5/1.
 */

import cn.myheibai.blog.service.ArticleService;
import cn.myheibai.blog.service.ArticleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    ArticleService articleService = new ArticleServiceImpl();
    @RequestMapping("/getarticle")
    public Object hello(@RequestParam("id")int id){
        return articleService.findArticleById(id);
    }
}
