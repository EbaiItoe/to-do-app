package com.capstone.repo;

public class RepositoryFactory {
    public static TaskRepository createRepository() {
        return new InMemoryTaskRepository();
    }
}

