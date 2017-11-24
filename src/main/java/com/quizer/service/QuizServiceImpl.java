package com.quizer.service;

import com.quizer.dao.QuizDao;
import com.quizer.model.Quiz;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author UZAIR
 */
@Service
@Transactional
public class QuizServiceImpl implements QuizService{

    QuizDao quizDao;
    
    @Autowired
    public void setQuizDao(QuizDao quizDao){
        this.quizDao=quizDao;
    }
    
    @Override
    public List<Quiz> getQuizList() {
        return quizDao.getQuizList();
    }

    @Override
    public void saveOrUpdate(Quiz quiz) {
        quizDao.saveOrUpdate(quiz);
    }

    @Override
    public void deleteQuiz(int id) {
        quizDao.deleteQuiz(id);
    }

    @Override
    public Quiz findQuizById(int id) {
        return quizDao.findQuizById(id);
    }

    
}
