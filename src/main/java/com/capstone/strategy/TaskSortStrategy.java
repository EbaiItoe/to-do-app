package com.capstone.strategy;

import com.capstone.model.Task;
import java.util.Comparator;

public interface TaskSortStrategy {
    Comparator<Task> getComparator();
    String getName();
}
