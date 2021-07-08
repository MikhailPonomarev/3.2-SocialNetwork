package ru.netology.domain;

public class LikesInfo {
    public int likesCount;
    private boolean currentUserLiked;
    private boolean canLike;
    private boolean canPublish;

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isCurrentUserLiked() {
        return currentUserLiked;
    }

    public void setCurrentUserLiked(boolean currentUserLiked) {
        this.currentUserLiked = currentUserLiked;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
