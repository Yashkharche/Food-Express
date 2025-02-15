package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.ReviewException;
import com.foodexpress.model.Review;
import com.foodexpress.model.User;
import com.foodexpress.request.ReviewRequest;

public interface ReviewSerive {

    public Review submitReview(ReviewRequest review, User user);

    public void deleteReview(Long reviewId) throws ReviewException;

    public double calculateAverageRating(List<Review> reviews);
}
