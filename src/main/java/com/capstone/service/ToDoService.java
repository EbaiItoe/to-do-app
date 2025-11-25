package com.capstone.service;

import com.capstone.model.*;
import com.capstone.strategy.TaskSortStrategy;
import java.util.List;
import java.util.UUID;

public interface ToDoService {
    TaskList createList(String name);
    List<TaskList> allLists();
    void deleteList(UUID listId);

    void addTask(UUID listId, String title, String description, Priority p);
    List<Task> getTasks(UUID listId, TaskSortStrategy strategy);
    void completeTask(UUID listId, UUID taskId);
}

