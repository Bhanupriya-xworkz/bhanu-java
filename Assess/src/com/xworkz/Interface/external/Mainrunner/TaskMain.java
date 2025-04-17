package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.HouseCleaningTask;
import com.xworkz.Interface.internal.Task;

public class TaskMain {
        public static void main(String[] args) {
            Task task = new HouseCleaningTask();
            task.startTask();
            task.completeTask();
            task.cancelTask();
        }
    }

