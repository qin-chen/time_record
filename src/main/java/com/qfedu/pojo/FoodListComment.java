package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/22.
 */
public class FoodListComment {
    private Integer commentId;
    private String  commentQuestion;
    private String  commentAdvice;
    private String  commentDetailAdvice;
    private FoodListContent foodListContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentQuestion() {
        return commentQuestion;
    }

    public void setCommentQuestion(String commentQuestion) {
        this.commentQuestion = commentQuestion;
    }

    public String getCommentAdvice() {
        return commentAdvice;
    }

    public void setCommentAdvice(String commentAdvice) {
        this.commentAdvice = commentAdvice;
    }

    public String getCommentDetailAdvice() {
        return commentDetailAdvice;
    }

    public void setCommentDetailAdvice(String commentDetailAdvice) {
        this.commentDetailAdvice = commentDetailAdvice;
    }

    public FoodListContent getFoodListContent() {
        return foodListContent;
    }

    public void setFoodListContent(FoodListContent foodListContent) {
        this.foodListContent = foodListContent;
    }
}