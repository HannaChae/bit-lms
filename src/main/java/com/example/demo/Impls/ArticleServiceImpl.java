package com.example.demo.Impls;

import java.util.List;

import com.example.demo.domains.ArticleDto;
import com.example.demo.domains.ReplyDto;
import com.example.demo.services.ArticleService;

import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public void writeArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeArticle(ArticleDto article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeReply(ReplyDto reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeReply(ReplyDto reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArticleDto readArticle(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ReplyDto> readRelpy(int artId) {
        // TODO Auto-generated method stub
        return null;
    }
}
