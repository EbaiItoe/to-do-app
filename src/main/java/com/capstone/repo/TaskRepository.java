package com.capstone.repo;

import com.capstone.model.TaskList;
import com.capstone.model.Task;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository {
    TaskList createList(String name);
    Optional<TaskList> findList(UUID id);
    List<TaskList> findAllLists();
    void deleteList(UUID id);

    void addTask(UUID listId, Task task);
    void removeTask(UUID listId, UUID taskId);
}
