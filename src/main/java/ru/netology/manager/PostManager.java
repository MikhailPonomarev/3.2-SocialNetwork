package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() { //метод, который возвращает массив объектов записей на стене
        return null;
    }

    public Post[] search(int postOwnerId, String domain, String query, int ownersOnly, int count, int offset) {
        //метод поиска
        return null;
    }

    public void delete(int postId, int postOwnerId) {
        //метод удаления
    }
}
