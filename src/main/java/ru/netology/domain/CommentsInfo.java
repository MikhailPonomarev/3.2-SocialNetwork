package ru.netology.domain;

public class CommentsInfo {
   private int commentsCount;
   private boolean canPost;
   private int groupsCanPost;
   private boolean canClose;
   private boolean canOpen;

   public int getCommentsCount() {
      return commentsCount;
   }

   public void setCommentsCount(int commentsCount) {
      this.commentsCount = commentsCount;
   }

   public boolean isCanPost() {
      return canPost;
   }

   public void setCanPost(boolean canPost) {
      this.canPost = canPost;
   }

   public int getGroupsCanPost() {
      return groupsCanPost;
   }

   public void setGroupsCanPost(int groupsCanPost) {
      this.groupsCanPost = groupsCanPost;
   }

   public boolean isCanClose() {
      return canClose;
   }

   public void setCanClose(boolean canClose) {
      this.canClose = canClose;
   }

   public boolean isCanOpen() {
      return canOpen;
   }

   public void setCanOpen(boolean canOpen) {
      this.canOpen = canOpen;
   }
}
